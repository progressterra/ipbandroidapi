package com.progressterra.ipbandroidapi.repository

import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.AddCitiRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.ConfirmEmailRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.CitiesListResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.LoginResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.CodeVerificationModel
import com.progressterra.ipbandroidapi.interfaces.client.login.models.PersonalInfo
import com.progressterra.ipbandroidapi.interfaces.internal.BonusesRepository
import com.progressterra.ipbandroidapi.interfaces.internal.LoginRepository
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.localdata.shared_pref.UserData
import com.progressterra.ipbandroidapi.localdata.shared_pref.models.ClientAdditionalInfo
import com.progressterra.ipbandroidapi.localdata.shared_pref.models.ClientInfo
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.GlobalResponseStatus
import com.progressterra.ipbandroidapi.remoteData.models.base.ResponseWrapper
import com.progressterra.ipbandroidapi.remoteData.scrm.ScrmApi
import com.progressterra.ipbandroidapi.remoteData.scrm.models.entities.ParamName
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.*
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.*
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.client_info_response.ClientInfoResponse
import com.progressterra.ipbandroidapi.utils.Debug
import kotlinx.coroutines.coroutineScope

internal class RepositoryImpl : LoginRepository, BonusesRepository {


    private val networkService: NetworkService = NetworkServiceImpl()

    private val scrmAPI = networkService.createService(ScrmApi::class.java)

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
            UserData.registerAccessToken = responseBody.accessToken ?: ""
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
            personalInfo.birthdate?:"",
            personalInfo.name ?:"",
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
            city.name?:"",
            city.idUnique,
            0,
            0
        )
        return networkService.baseRequest { scrmAPI.setCity(UserData.accessToken, addCitiRequest) }
    }

    override suspend fun getCitiesList(): ResponseWrapper<CitiesListResponse> {
        return networkService.baseRequest { scrmAPI.getCities() }
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
        // Получение имеющегося клиента
        if (!getExistingClient(phoneNumber)) {
            // Если клиента не существует, создаем нового
            createNewClient()
        }
        // Получаем девайс (idDevice)
        addDevice()
        addPhone(phoneNumber)
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
            false
        }
    }

    private suspend fun createNewClient() {
        val response = networkService.baseRequest {
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
        val responseBody = response.responseBody
        if (response.globalResponseStatus == GlobalResponseStatus.SUCCESS && responseBody != null) {
            saveUserData(
                responseBody.client?.convertToClientInfo(),
                responseBody.clientAdditionalInfo?.convertToClientAdditionalInfo()
            )
            UserData.clientExist = false
        }
    }

    private fun saveUserData(clientInfo: ClientInfo?, clientAdditionalInfo: ClientAdditionalInfo?) {
        if (clientInfo != null)
            UserData.clientInfo = clientInfo
        if (clientAdditionalInfo != null)
            UserData.clientAdditionalInfo = clientAdditionalInfo
    }

    private suspend fun addDevice() {
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
        val rawDeviceId = response.responseBody?.idDevice
        if (response.globalResponseStatus == GlobalResponseStatus.SUCCESS && rawDeviceId != null)
            UserData.deviceId = rawDeviceId
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
}