package com.progressterra.ipbandroidapi.repository

import com.progressterra.ipbandroidapi.interfaces.client.login.LoginResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.CodeVerificationModel
import com.progressterra.ipbandroidapi.interfaces.client.login.models.CreateClientWithoutPhoneRequest
import com.progressterra.ipbandroidapi.interfaces.client.login.models.InitUserResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.PersonalInfo
import com.progressterra.ipbandroidapi.interfaces.internal.*
import com.progressterra.ipbandroidapi.localdata.shared_pref.UserData
import com.progressterra.ipbandroidapi.localdata.shared_pref.models.ClientAdditionalInfo
import com.progressterra.ipbandroidapi.localdata.shared_pref.models.ClientInfo
import com.progressterra.ipbandroidapi.remoteData.AddressesNetworkService
import com.progressterra.ipbandroidapi.remoteData.DadataNetworkService
import com.progressterra.ipbandroidapi.remoteData.IpbNetworkService
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.GlobalResponseStatus
import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.ScrmApi
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.Address
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.dadata.DadataSuggestionResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.address.dadata.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.chat.CreateDialogRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.chat.CreateDialogResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.chat.MessageSendingRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.chat.MessagesListResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.entities.ParamName
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.*
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.*
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.client_info_response.ClientInfoResponse
import com.progressterra.ipbandroidapi.utils.Debug
import kotlinx.coroutines.coroutineScope

internal class RepositoryImpl : LoginRepository, BonusesRepository, ChatRepository,
    AddressesRepository {


    private val networkService: NetworkService = IpbNetworkService()
    private val addressesNetworkService: NetworkService = AddressesNetworkService()
    private val dadataNetworkService: NetworkService = DadataNetworkService()

    private val scrmAPI = networkService.createService(ScrmApi::class.java)
    private val addressesApi = addressesNetworkService.createService(ScrmApi::class.java)
    private val dadataApi = dadataNetworkService.createService(ScrmApi::class.java)

    override suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse {
        val response = coroutineScope {
            networkService.safeApiCall {
                scrmAPI.verificationChannelBegin(
                    VerificationRequest(
                        phoneNumber
                    )
                )
            }
        }

        val status =
            if (response?.status == 0) GlobalResponseStatus.SUCCESS else GlobalResponseStatus.ERROR
        val message = response?.message ?: ""

        return LoginResponse(status, message)
    }

    override suspend fun verificationChannelEnd(
        phoneNumber: String,
        code: String
    ): CodeVerificationModel {
        val response = coroutineScope {
            networkService.baseRequest {
                scrmAPI.verificationChannelEnd(VerificationRequest(phoneNumber, code))
            }
        }

        val responseBody = response.responseBody

        if (response.globalResponseStatus == GlobalResponseStatus.SUCCESS && responseBody != null) {
            getUserData(phoneNumber)
        }

        return CodeVerificationModel(
            status = response.globalResponseStatus,
            userExist = UserData.clientExist,
            error = response.errorString
        )
    }

    override suspend fun addPersonalInfo(personalInfo: PersonalInfo): ResponseWrapper<BaseResponse> {
        val clientData = ClientData(
            personalInfo.birthdate ?: "",
            personalInfo.name ?: "",
            null,
            sex = personalInfo.sexType?.value?.toString() ?: "0",
            soname = personalInfo.lastname!!
        )


        val addClientInfoRequest = ClientInfoRequest(
            accessToken = UserData.accessToken,
            clientData = clientData,
            iDClient = UserData.clientInfo.idUnique,
            0.0,
            0.0,
            null,
            null,
            0
        )


        val response = networkService.baseRequest { scrmAPI.addPersonalInfo(addClientInfoRequest) }

        saveUserData(
            response.responseBody?.client?.convertToClientInfo(),
            response.responseBody?.clientAdditionalInfo?.convertToClientAdditionalInfo()
        )
        return response as ResponseWrapper<BaseResponse>
    }

    override suspend fun addEmail(email: String): ResponseWrapper<BaseResponse> {
        val request = ParamRequest(
            UserData.clientInfo.idUnique,
            UserData.accessToken,
            ParamName.EMAIL,
            email,
        )
        return networkService.baseRequest { scrmAPI.addEmail(request) }
    }

    override suspend fun confirmEmail(email: String): ResponseWrapper<BaseResponse> {
        val confirmEmailRequest = ConfirmEmailRequest(
            UserData.accessToken,
            email
        )
        return networkService.baseRequest { scrmAPI.confirmEmail(confirmEmailRequest) }
    }

    override suspend fun addCity(city: CitiesListResponse.City): ResponseWrapper<BaseResponse> {
        val addCitiRequest = AddCitiRequest(
            "",
            "",
            city.name ?: "",
            city.idUnique,
            0,
            0
        )
        return networkService.baseRequest { scrmAPI.setCity(UserData.accessToken, addCitiRequest) }
    }

    override suspend fun getCitiesList(): ResponseWrapper<CitiesListResponse> {
        return networkService.baseRequest { scrmAPI.getCities() }
    }

    override suspend fun initClient(): InitUserResponse {
        // если успешного создания клиента не произошло
        return if (!UserData.clientAlreadyCreated) {
            createBaseClient()
        } else {
            // если клиет создан успешно был до этого
            InitUserResponse(GlobalResponseStatus.SUCCESS)
        }
    }

    private suspend fun getRegisterAccessToken(): ResponseWrapper<AccessTokenResponse> {
        val request = CreateClientWithoutPhoneRequest()
        return networkService.baseRequest { scrmAPI.createClientWithoutPhone(request) }
    }

    override suspend fun getAccessToken(): ResponseWrapper<AccessTokenResponse> {
        val accessTokenRequest = AccessTokenRequest(
            "",
            idClient = UserData.clientInfo.idUnique,
            0,
            0,
            "device",
            paramValue = UserData.deviceId,
            0
        )
        val response = networkService.baseRequest { scrmAPI.getAccessToken(accessTokenRequest) }
        UserData.accessToken = response.responseBody?.accessToken ?: ""
        return response
    }

    override suspend fun getBonusesInfo(accessToken: String): ResponseWrapper<GeneralInfoResponse> {
        return networkService.baseRequest { scrmAPI.getGeneralInfo(accessToken) }
    }

    override suspend fun getTransactionsList(accessToken: String): ResponseWrapper<TransactionListResponse> =
        networkService.baseRequest { scrmAPI.getTransactionsList(accessToken) }

    override suspend fun getPurchasesList(accessToken: String): ResponseWrapper<PurchasesListResponse> =
        networkService.baseRequest { scrmAPI.getShopList(accessToken) }

    override suspend fun getBonusMessagesList(accessToken: String): ResponseWrapper<BonusesMessagesResponse> =
        networkService.baseRequest { scrmAPI.getBonusMessagesList(accessToken) }


    private suspend fun getUserData(phoneNumber: String) {
        getExistingClient(phoneNumber)
        addDevice()
    }

    private suspend fun getExistingClient(phoneNumber: String): Boolean {
        val response = networkService.baseRequest {
            scrmAPI.getClientByParams(
                UserData.registerAccessToken,
                ParamName.PHONE.value,
                phoneNumber
            )
        }

        val responseBody: ClientInfoResponse? = response.responseBody
        return if (response.globalResponseStatus == GlobalResponseStatus.SUCCESS && responseBody != null) {
            saveUserData(
                responseBody.client?.convertToClientInfo(),
                responseBody.clientAdditionalInfo?.convertToClientAdditionalInfo()
            )

            UserData.clientExist = true
            true
        } else {
            addPhone(phoneNumber)
            false
        }
    }

    private suspend fun createNewClient(): ResponseWrapper<ClientInfoResponse> {
        return networkService.baseRequest {
            scrmAPI.createNewClient(
                ParamRequest(
                    idClient = null,
                    accessToken = UserData.registerAccessToken,
                    paramName = ParamName.CREATE_NEW_CLIENT,
                    paramValue = "",
                    latitude = null,
                    longitude = null
                )
            )
        }

    }

    private fun saveUserData(clientInfo: ClientInfo?, clientAdditionalInfo: ClientAdditionalInfo?) {
        if (clientInfo != null)
            UserData.clientInfo = clientInfo
        if (clientAdditionalInfo != null)
            UserData.clientAdditionalInfo = clientAdditionalInfo
    }

    private suspend fun addDevice(): ResponseWrapper<DeviceResponse> {
        val response = networkService.baseRequest {
            scrmAPI.addDevice(
                ParamRequest(
                    idClient = UserData.clientInfo.idUnique,
                    accessToken = UserData.registerAccessToken,
                    paramName = ParamName.ADD_DEVICE,
                    paramValue = UserData.androidId
                )
            )
        }
        if (response.globalResponseStatus == GlobalResponseStatus.SUCCESS) {
            // сохраняем девайс айди для клиента в префах
            UserData.deviceId = response.responseBody?.idDevice ?: ""
        }
        return response
    }

    private suspend fun addPhone(phoneNumber: String) {
        val response = networkService.baseRequest {
            scrmAPI.addPhone(
                ParamRequest(
                    idClient = UserData.clientInfo.idUnique,
                    accessToken = UserData.registerAccessToken,
                    paramName = ParamName.ADD_PHONE,
                    paramValue = phoneNumber
                )
            )
        }
        if (response.globalResponseStatus == GlobalResponseStatus.ERROR) {
            //Такой телефон у клиента уже есть
            Debug.printDebug(response.responseBody!!, "Phone exist")
        }
        UserData.phone = phoneNumber
    }

    private suspend fun createBaseClient(): InitUserResponse {

        // получаем регистрационный токен
        val registerTokenResponse = getRegisterAccessToken()

        if (registerTokenResponse.globalResponseStatus == GlobalResponseStatus.SUCCESS) {

            // сохраняем токен в префах
            UserData.registerAccessToken = registerTokenResponse.responseBody?.accessToken ?: ""

            // создаем клиента с ранее полученным токеном
            val createClientResponse = createNewClient()

            if (createClientResponse.globalResponseStatus == GlobalResponseStatus.SUCCESS) {
                saveUserData(

                    // сохраняем полученные данные , а именно id клиента, в префах
                    createClientResponse.responseBody?.client?.convertToClientInfo(),
                    createClientResponse.responseBody?.clientAdditionalInfo?.convertToClientAdditionalInfo()
                )
                UserData.clientExist = false

                // добавляем текущий девайс клиенту
                val addDeviceResponse = addDevice()

                if (addDeviceResponse.globalResponseStatus == GlobalResponseStatus.SUCCESS) {
                    // сохраняем девайс айди для клиента в префах
                    UserData.deviceId = addDeviceResponse.responseBody?.idDevice ?: ""

                    // сохраняем успешное создание клиента в префах
                    UserData.clientAlreadyCreated = true

                    // отправляем колбек об успешном завершении регистрации
                    return InitUserResponse(GlobalResponseStatus.SUCCESS)
                } else {
                    // при ошибке отправляем событие о неуспешном создан
                    return InitUserResponse(
                        GlobalResponseStatus.ERROR,
                        addDeviceResponse.errorString
                    )
                }

            } else {
                return InitUserResponse(
                    GlobalResponseStatus.ERROR,
                    createClientResponse.errorString
                )
            }
        } else {
            return InitUserResponse(
                GlobalResponseStatus.ERROR,
                registerTokenResponse.errorString
            )
        }

    }

    override suspend fun getMessagesList(
        IDRGDialog: String,
        page: String
    ): ResponseWrapper<MessagesListResponse> {
        return networkService.baseRequest { scrmAPI.getMessagesList(IDRGDialog, page) }
    }

    override suspend fun sendMessage(messageSendingRequest: MessageSendingRequest): ResponseWrapper<MessagesListResponse> {
        return networkService.baseRequest { scrmAPI.sendMessage(messageSendingRequest) }
    }

    override suspend fun createNewDialog(createDialogRequest: CreateDialogRequest): ResponseWrapper<CreateDialogResponse> {
        return networkService.baseRequest { scrmAPI.createNewDialog(createDialogRequest) }
    }

    override suspend fun getAddressList(accessToken: String): ResponseWrapper<ListOfAddressesResponse> {
        return addressesNetworkService.baseRequest { addressesApi.getAddressList(accessToken) }
    }

    override suspend fun addClientAddress(
        accessToken: String,
        modifiClientAddressRequest: Address
    ): ResponseWrapper<ResultResponse> {
        return addressesNetworkService.baseRequest {
            addressesApi.addClientAddress(
                accessToken,
                modifiClientAddressRequest
            )
        }
    }

    override suspend fun updateClientAddress(
        accessToken: String,
        modifiClientAddressRequest: Address
    ): ResponseWrapper<ResultResponse> {
        return addressesNetworkService.baseRequest {
            addressesApi.updateClientAddress(
                accessToken,
                modifiClientAddressRequest
            )
        }

    }

    override suspend fun getSuggestionsAddressFromDadata(dadataSuggestionsRequest: DadataSuggestionsRequest): ResponseWrapper<DadataSuggestionResponse> {
        val response = dadataApi.getSuggestionsAddressFromDadata(dadataSuggestionsRequest)
        return if (response.isSuccessful) {
            ResponseWrapper<DadataSuggestionResponse>().apply {
                responseBody = response.body()
                globalResponseStatus = GlobalResponseStatus.SUCCESS
            }
        } else {
            ResponseWrapper<DadataSuggestionResponse>().apply {
                globalResponseStatus = GlobalResponseStatus.ERROR
            }
        }
    }

}
