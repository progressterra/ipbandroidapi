package com.progressterra.ipbandroidapi.repository

import com.progressterra.ipbandroidapi.api.address.AddressCloudDataSource
import com.progressterra.ipbandroidapi.api.address.AddressService
import com.progressterra.ipbandroidapi.api.city.CityCloudDataSource
import com.progressterra.ipbandroidapi.api.city.CityService
import com.progressterra.ipbandroidapi.api.ibonus.IBonusService
import com.progressterra.ipbandroidapi.api.scrm.SCRMCloudDataSource
import com.progressterra.ipbandroidapi.api.scrm.SCRMService
import com.progressterra.ipbandroidapi.interfaces.client.login.LoginResponse
import com.progressterra.ipbandroidapi.interfaces.client.login.models.CodeVerificationModel
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
import com.progressterra.ipbandroidapi.api.scrm.models.accesstoken.AccessTokenRequest
import com.progressterra.ipbandroidapi.api.scrm.models.accesstoken.AccessTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.address.Address
import com.progressterra.ipbandroidapi.api.scrm.models.address.ListOfAddressesResponse
import com.progressterra.ipbandroidapi.api.scrm.models.address.dadata.DadataSuggestionResponse
import com.progressterra.ipbandroidapi.api.scrm.models.address.dadata.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.api.scrm.models.clientinfo.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.scrm.models.devicetoken.DeviceParameters
import com.progressterra.ipbandroidapi.api.scrm.models.devicetoken.DeviceTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailRequest
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailResponse
import com.progressterra.ipbandroidapi.api.scrm.models.requests.*
import com.progressterra.ipbandroidapi.api.scrm.models.responses.*
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationEndRequest
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationStartRequest
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationType
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.utils.extentions.tryOrNull

internal class RepositoryImpl : LoginRepository, BonusesRepository,
    AddressesRepository {

    private val networkService: NetworkService = NetworkServiceImpl()
     
    private val scrmCloudDataSource = SCRMCloudDataSource.Base(
        networkService.createService(SCRMService::class.java, NetworkSettings.SCRM_URL),
        HandleException.Base()
    )

    private val addressCloudDataSource = AddressCloudDataSource.Base(
        networkService.createService(AddressService::class.java, NetworkSettings.ADDRESSES_ROOT_URL),
        HandleException.Base()
    )
    
    private val cityCloudDataSource = CityCloudDataSource.Base(
        networkService.createService(CityService::class.java, NetworkSettings.ADDRESSES_ROOT_URL),
        HandleException.Base()
    )

    private val iBonusService = networkService.createService(IBonusService::class.java, NetworkSettings.IBONUS_URL)

    private val dadataApi = networkService.createService(SCRMService::class.java, NetworkSettings.DADATA_ROOT_URL)

    override suspend fun verificationChannelBegin(phoneNumber: String): LoginResponse {
        val response = networkService.handle {
            scrmCloudDataSource.verificationChannelBegin(
                VerificationType.PHONE,
                phoneNumber
            )
        }
        return LoginResponse(
            if (response.result.status == 0) GlobalResponseStatus.SUCCESS else GlobalResponseStatus.ERROR,
            response.result.message ?: ""
        )
    }

    override suspend fun setDeviceToken(accessToken: String, deviceParameters: DeviceParameters): DeviceTokenResponse {
        return scrmCloudDataSource.setDeviceToken(accessToken, deviceParameters)
    }

    //TODO infodevice?
    override suspend fun verificationChannelEnd(
        phoneNumber: String,
        code: String
    ): CodeVerificationModel {
        val response = networkService.handle {
            scrmCloudDataSource.verificationChannelEnd(
                VerificationEndRequest(0, phoneNumber, code, "")
            )
        }
        if (response.result.status == 0) {
            UserData.registerAccessToken = response.data.idDevice
            getUserData()
        }
        return CodeVerificationModel(
            if (response.result.status == 0) GlobalResponseStatus.SUCCESS else GlobalResponseStatus.ERROR,
            UserData.clientExist,
            response.result.message ?: ""
        )
    }

    //TODO replace with some model
    override suspend fun addPersonalInfo(
        accessToken: String,
        soname: String,
        name: String,
        patronymic: String
    ): ClientInfoResponse {
        val response = networkService.handle {
            scrmCloudDataSource.setPersonalInfo(
                accessToken,
                ClientInfoRequest(
                    0,
                    soname,
                    name,
                    patronymic,
                    "",
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

    override suspend fun userData(accessToken: String): ClientInfoResponse {
        return networkService.handle {
            scrmCloudDataSource.clientInfoByToken(
                UserData.registerAccessToken
            )
        }
    }

    override suspend fun setEmail(accessToken: String, email: String): EmailResponse {
        val request = EmailRequest(
            email
        )
        return networkService.handle { scrmCloudDataSource.setEmail(accessToken, request) }
    }

    override suspend fun confirmEmail(email: String): ResponseWrapper<BaseResponse> {
        val confirmEmailRequest = ConfirmEmailRequest(
            UserData.accessToken,
            email
        )
        return networkService.baseRequest { scrmCloudDataSource.confirmEmail(confirmEmailRequest) }
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
        return networkService.baseRequest { cityCloudDataSource.setCity(UserData.accessToken, addCitiRequest) }
    }

    override suspend fun getCitiesList(): ResponseWrapper<CitiesListResponse> {
        return networkService.baseRequest { scrmCloudDataSource.getCities() }
    }

    //TODO latitude, longitude, iddevice
    override suspend fun getAccessToken(): AccessTokenResponse {
        val accessTokenRequest = AccessTokenRequest(
            UserData.fcmToken,
            0F,
            0F
        )
        val response = networkService.handle { scrmCloudDataSource.accessToken("") }
        UserData.accessToken = response.data
        return response
    }

    override suspend fun bonusesInfo(accessToken: String): GeneralInfoResponse {
        return networkService.handle { iBonusService.generalInfo(accessToken) }
    }

    override suspend fun transactionsList(accessToken: String): TransactionListResponse =
        networkService.handle { iBonusService.transactionsList(accessToken) }

    override suspend fun purchasesList(accessToken: String): ResponseWrapper<PurchasesListResponse> =
        networkService.baseRequest { scrmCloudDataSource.getShopList(accessToken) }

    override suspend fun bonusMessagesList(accessToken: String): BonusesMessagesResponse =
        networkService.handle { iBonusService.bonusMessagesList(accessToken) }


    private suspend fun getUserData() {
        getExistingClient()
        //addDevice()
        getAccessToken()

        // Дополнительная проверка additionalData
        if (UserData.clientAdditionalInfo.emailGeneral.isBlank()) {
            getClientAdditionalInfo()
        }
    }

    private suspend fun getExistingClient(): Boolean {
        val response = networkService.handle {
            scrmCloudDataSource.clientInfoByToken(
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

        val response = tryOrNull { scrmCloudDataSource.clientInfoByToken(token) }

        saveUserData(null, response?.data?.clientAdditionalInfo?.convertToClientAdditionalInfo())
    }


    private fun saveUserData(clientInfo: ClientInfo?, clientAdditionalInfo: ClientAdditionalInfo?) {
        if (clientInfo != null)
            UserData.clientInfo = clientInfo
        if (clientAdditionalInfo != null)
            UserData.clientAdditionalInfo = clientAdditionalInfo
    }


//    private suspend fun addDevice(): ResponseWrapper<DeviceResponse> {
//        val response = networkService.baseRequest {}
//        if (response.globalResponseStatus == GlobalResponseStatus.SUCCESS) {
//            // сохраняем девайс айди для клиента в префах
//            UserData.deviceId = response.responseBody?.idDevice ?: ""
//        }
//        return response
//    }


    override suspend fun getAddressList(accessToken: String): ResponseWrapper<ListOfAddressesResponse> {
        return networkService.baseRequest { addressCloudDataSource.getAddressList(accessToken) }
    }

    override suspend fun addClientAddress(
        accessToken: String,
        modifyClientAddressRequest: Address
    ): ResponseWrapper<ResultResponse> {
        return networkService.baseRequest {
            addressCloudDataSource.addClientAddress(
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
            addressCloudDataSource.updateClientAddress(
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
