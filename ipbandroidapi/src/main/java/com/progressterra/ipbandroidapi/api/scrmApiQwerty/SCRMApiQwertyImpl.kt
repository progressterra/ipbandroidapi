package com.progressterra.ipbandroidapi.api.scrmApiQwerty

import com.progressterra.ipbandroidapi.api.iProBonusApi.models.CityResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.UpdateUserInfoRequest
import com.progressterra.ipbandroidapi.api.scrmApiQwerty.models.requests.BeginVerificationChannelRequest
import com.progressterra.ipbandroidapi.api.scrmApiQwerty.models.requests.DeviceParameters
import com.progressterra.ipbandroidapi.api.scrmApiQwerty.models.requests.RemoveClientRequest
import com.progressterra.ipbandroidapi.api.scrmApiQwerty.models.requests.TestimonialRequest
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import com.progressterra.ipbandroidapi.api.scrm.models.entities.ParamName

internal class SCRMApiQwertyImpl : SCRMApiQwerty.ClientManagement, SCRMApiQwerty.ClientsV3,
    SCRMApiQwerty.ClientCity, SCRMApiQwerty.TestimonialsControllerV3,
    SCRMApiQwerty.VerifiedChannel {

    private val networkService: NetworkService = NetworkServiceImpl()
    private val api = networkService.createService(
        SCRMApiQwertyApi.ClientManagement::class.java,
        NetworkSettings.SCRMAPIQWERTY_ROOT_URL
    )

    private val clientsApi = networkService.createService(
        SCRMApiQwertyApi.ClientsV3::class.java,
        NetworkSettings.LIKEDISLIKE_ROOT_URL
    )

    private val cityApi = networkService.createService(
        SCRMApiQwertyApi.ClientCity::class.java,
        NetworkSettings.LIKEDISLIKE_ROOT_URL
    )
    private val testimonialApi = networkService.createService(
        SCRMApiQwertyApi.TestimonialControllerV3::class.java,
        NetworkSettings.SCRMAPIQWERTY_ROOT_URL
    )
    private val verifiedChannelApi = networkService.createService(
        SCRMApiQwertyApi.VerifiedChannel::class.java,
        NetworkSettings.SCRMAPIQWERTY_ROOT_URL
    )


    /**
     *  ClientManagement
     */
    override suspend fun removeClientBegin(accessToken: String): BaseResponse {
        return api.removeClientBegin(accessToken)
    }

    override suspend fun removeClientEnd(
        accessToken: String,
        verificationCode: String
    ): BaseResponse {
        return api.removeClientEnd(
            accessToken,
            RemoveClientRequest(accessToken = accessToken, verifiedCode = verificationCode)
        )
    }

    /**
     *  ClientsV3
     */
    override suspend fun getClientInfo(accessToken: String): ClientInfoResponse {
        return clientsApi.getClientInfo(accessToken)
    }

    override suspend fun updateClientInfo(
        accessToken: String,
        name: String,
        soname: String,
        patronymic: String,
        sex: Int
    ): ClientInfoResponse {
        return clientsApi.updatePersonalInfo(
            accessToken,
            UpdateUserInfoRequest(soname, name, patronymic, sex)
        )
    }

    override suspend fun getClientInfo(
        registerAccessToken: String,
        paramName: ParamName,
        paramValue: String
    ): ClientInfoResponse {
        return clientsApi.getClientByParams(
            AccessToken = registerAccessToken,
            paramName.value,
            paramValue
        )
    }

    override suspend fun setDeviceToken(deviceParameters: DeviceParameters): ClientInfoResponse {
        return clientsApi.setDeviceToken(deviceParameters)
    }

    /**
     *  ClientCity
     */
    override suspend fun getClientCity(accessToken: String): CityResponse {
        return cityApi.getCityClient(accessToken)
    }

    /**
     * TestimonialControllerV3
     */
    override suspend fun addTestimonial(
        accessToken: String,
        nickNameClient: String,
        message: String,
        idEmployee: String,
        idOrder: String,
        idShop: String,
        rating: Int,
        typeMessage: String
    ): BaseResponse {
        return testimonialApi.addTestimonial(
            accessToken,
            TestimonialRequest(
                nickNameClient,
                message,
                idEmployee,
                idOrder,
                idShop,
                rating,
                typeMessage
            )
        )
    }

    override suspend fun beginVerificationChannel(
        channelName: String,
        channelValue: String
    ): BaseResponse {
        return verifiedChannelApi.beginVerificationChannel(
            BeginVerificationChannelRequest(
                channelName = channelName,
                channelValue = channelValue
            )
        )
    }
}