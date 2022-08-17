package com.progressterra.ipbandroidapi.repository

import com.progressterra.ipbandroidapi.api.scrmapiqwerty.SCRMApiQwertyApi
import com.progressterra.ipbandroidapi.interfaces.client.login.LoginResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.CodeVerificationModel
import com.progressterra.ipbandroidapi.interfaces.client.login.models.CreateClientWithoutPhoneRequest
import com.progressterra.ipbandroidapi.interfaces.client.login.models.InitUserResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.PersonalInfo
import com.progressterra.ipbandroidapi.interfaces.internal.AddressesRepository
import com.progressterra.ipbandroidapi.interfaces.internal.BonusesRepository
import com.progressterra.ipbandroidapi.interfaces.internal.LoginRepository
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.localdata.shared_pref.UserData
import com.progressterra.ipbandroidapi.localdata.shared_pref.models.ClientAdditionalInfo
import com.progressterra.ipbandroidapi.localdata.shared_pref.models.ClientInfo
import com.progressterra.ipbandroidapi.remotedata.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remotedata.NetworkSettings
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remotedata.models.base.GlobalResponseStatus
import com.progressterra.ipbandroidapi.remotedata.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remotedata.models.base.ResultResponse
import com.progressterra.ipbandroidapi.api.scrm.SCRMService
import com.progressterra.ipbandroidapi.api.scrm.models.accesstoken.AccessTokenRequest
import com.progressterra.ipbandroidapi.api.scrm.models.accesstoken.AccessTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.address.Address
import com.progressterra.ipbandroidapi.api.scrm.models.address.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.api.scrm.models.address.dadata.DadataSuggestionResponse
import com.progressterra.ipbandroidapi.api.scrm.models.address.dadata.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.api.scrm.models.clientinfo.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailRequest
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailResponse
import com.progressterra.ipbandroidapi.api.scrm.models.entities.ParamName
import com.progressterra.ipbandroidapi.api.scrm.models.requests.*
import com.progressterra.ipbandroidapi.api.scrm.models.responses.*
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationEndRequest
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationStartRequest
import com.progressterra.ipbandroidapi.exception.FailedRequestException
import com.progressterra.ipbandroidapi.utils.Debug
import com.progressterra.ipbandroidapi.utils.extentions.tryOrNull

internal class RepositoryImpl : LoginRepository, BonusesRepository,
    AddressesRepository {

    private val networkService: NetworkService = NetworkServiceImpl()

    private val scrmService =
        networkService.createService(SCRMService::class.java, NetworkSettings.LIKEDISLIKE_ROOT_URL)
    private val addressesApi = networkService.createService(
        SCRMService::class.java,
        NetworkSettings.ADDRESSES_ROOT_URL
    )
    private val dadataApi =
        networkService.createService(SCRMService::class.java, NetworkSettings.DADATA_ROOT_URL)

    private val clientsApi = networkService.createService(
        SCRMApiQwertyApi.ClientsV3::class.java,
        NetworkSettings.LIKEDISLIKE_ROOT_URL
    )

    //TODO channel type and data?
    override suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse {
        val response = networkService.handle {
            scrmService.verificationChannelBegin(
                VerificationStartRequest(
                    0,
                    ""
                )
            )
        }
        return LoginResponse(
            if (response.result.status == 0) GlobalResponseStatus.SUCCESS else GlobalResponseStatus.ERROR,
            response.result.message ?: ""
        )
    }

    //TODO handle error in presentation

    //TODO channel type, data? rename model because it is response
    override suspend fun verificationChannelEnd(
        phoneNumber: String,
        code: String
    ): CodeVerificationModel {
        val response = networkService.handle {
            scrmService.verificationChannelEnd(
                VerificationEndRequest(0, "", "", "")
            )
        }
        if (response.result.status == 0) {
            UserData.registerAccessToken = response.data.idDevice
            getUserData(phoneNumber)
        }
        return CodeVerificationModel(
            if (response.result.status == 0) GlobalResponseStatus.SUCCESS else GlobalResponseStatus.ERROR,
            UserData.clientExist,
            response.result.message ?: ""
        )
    }

    //TODO access token
    override suspend fun addPersonalInfo(personalInfo: PersonalInfo): ClientInfoResponse {
        val response = networkService.handle {
            scrmService.setPersonalInfo(
                "",
                ClientInfoRequest(
                    personalInfo.sexType?.value ?: 0,
                    personalInfo.lastname ?: "",
                    personalInfo.name ?: "",
                    personalInfo.patronymic ?: "",
                    personalInfo.birthdate ?: "",
                    ""
                )
            )
        }
        saveUserData(
            response.data.clientInfo.convertToClientInfo(),
            response.data.clientAdditionalInfo.convertToClientAdditionalInfo()
        )
        return response
    }

    //TODO access token
    override suspend fun setEmail(email: String): EmailResponse {
        val request = EmailRequest(
            email
        )
        return networkService.handle { scrmService.setEmail("", request) }
    }

    override suspend fun confirmEmail(email: String): ResponseWrapper<BaseResponse> {
        val confirmEmailRequest = ConfirmEmailRequest(
            UserData.accessToken,
            email
        )
        return networkService.baseRequest { scrmService.confirmEmail(confirmEmailRequest) }
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
        return networkService.baseRequest { scrmService.setCity(UserData.accessToken, addCitiRequest) }
    }

    override suspend fun getCitiesList(): ResponseWrapper<CitiesListResponse> {
        return networkService.baseRequest { scrmService.getCities() }
    }

    override suspend fun initClient(): InitUserResponse {
        return if (!UserData.clientAlreadyCreated) {
            createBaseClient()
        } else {
            InitUserResponse(GlobalResponseStatus.SUCCESS)
        }
    }

    private suspend fun getRegisterAccessToken(): ResponseWrapper<AccessTokenResponse> {
        val request = CreateClientWithoutPhoneRequest()
        return networkService.baseRequest { scrmService.createClientWithoutPhone(request) }
    }

    //TODO latitude, longitude, iddevice
    override suspend fun getAccessToken(): AccessTokenResponse {
        val accessTokenRequest = AccessTokenRequest(
            "",
            0F,
            0F
        )
        val response = networkService.baseRequest { scrmService.accessToken(accessTokenRequest) }
        UserData.accessToken = response.responseBody?.accessToken ?: ""
        return response
    }

    override suspend fun getBonusesInfo(accessToken: String): ResponseWrapper<GeneralInfoResponse> {
        return networkService.baseRequest { scrmService.getGeneralInfo(accessToken) }
    }

    override suspend fun getTransactionsList(accessToken: String): ResponseWrapper<TransactionListResponse> =
        networkService.baseRequest { scrmService.getTransactionsList(accessToken) }

    override suspend fun getPurchasesList(accessToken: String): ResponseWrapper<PurchasesListResponse> =
        networkService.baseRequest { scrmService.getShopList(accessToken) }

    override suspend fun getBonusMessagesList(accessToken: String): ResponseWrapper<BonusesMessagesResponse> =
        networkService.baseRequest { scrmService.getBonusMessagesList(accessToken) }


    private suspend fun getUserData(phoneNumber: String) {
        getExistingClient()
        addDevice()
        getAccessToken()

        // Дополнительная проверка additionalData
        if (UserData.clientAdditionalInfo.emailGeneral.isBlank()) {
            getClientAdditionalInfo()
        }
    }

    private suspend fun getExistingClient(): Boolean {
        val response = networkService.handle {
            scrmService.clientInfoByToken(
                UserData.registerAccessToken
            )
        }
        return if (response.result.status == 0) {
            saveUserData(
                response.data.clientInfo.convertToClientInfo(),
                response.data.clientAdditionalInfo.convertToClientAdditionalInfo()
            )
            UserData.clientExist = true
            true
        } else {
            false
        }
    }

    private suspend fun getClientAdditionalInfo() {
        val token = getAccessToken().data

        val response = tryOrNull { clientsApi.getClientInfo(token) }

        saveUserData(null, response?.clientAdditionalInfo?.convertToClientAdditionalInfo())
    }


    private fun saveUserData(clientInfo: ClientInfo?, clientAdditionalInfo: ClientAdditionalInfo?) {
        if (clientInfo != null)
            UserData.clientInfo = clientInfo
        if (clientAdditionalInfo != null)
            UserData.clientAdditionalInfo = clientAdditionalInfo
    }

    private suspend fun addDevice(): ResponseWrapper<DeviceResponse> {
        val response = networkService.baseRequest {
            scrmService.addDevice(
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

    override suspend fun getAddressList(accessToken: String): ResponseWrapper<ListOfAddressesResponse> {
        return networkService.baseRequest { addressesApi.getAddressList(accessToken) }
    }

    override suspend fun addClientAddress(
        accessToken: String,
        modifyClientAddressRequest: Address
    ): ResponseWrapper<ResultResponse> {
        return networkService.baseRequest {
            addressesApi.addClientAddress(
                accessToken,
                modifyClientAddressRequest
            )
        }
    }

    override suspend fun updateClientAddress(
        accessToken: String,
        modifyClientAddressRequest: Address
    ): ResponseWrapper<ResultResponse> {
        return networkService.baseRequest {
            addressesApi.updateClientAddress(
                accessToken,
                modifyClientAddressRequest
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
