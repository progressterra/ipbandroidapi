package com.progressterra.ipbandroidapi.api.scrm

import com.progressterra.ipbandroidapi.api.scrm.models.accesstoken.AccessTokenRequest
import com.progressterra.ipbandroidapi.api.scrm.models.accesstoken.AccessTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.address.dadata.DadataSuggestionResponse
import com.progressterra.ipbandroidapi.api.scrm.models.address.dadata.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.api.scrm.models.clientinfo.ClientInfoResponse
import com.progressterra.ipbandroidapi.api.scrm.models.deviceid.DeviceIdResponse
import com.progressterra.ipbandroidapi.api.scrm.models.devicetoken.DeviceParameters
import com.progressterra.ipbandroidapi.api.scrm.models.devicetoken.DeviceTokenResponse
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailRequest
import com.progressterra.ipbandroidapi.api.scrm.models.email.EmailResponse
import com.progressterra.ipbandroidapi.api.scrm.models.requests.ClientInfoRequest
import com.progressterra.ipbandroidapi.api.scrm.models.requests.ConfirmEmailRequest
import com.progressterra.ipbandroidapi.api.scrm.models.responses.CitiesListResponse
import com.progressterra.ipbandroidapi.api.scrm.models.responses.PurchasesListResponse
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationEndRequest
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationEndResponse
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationStartRequest
import com.progressterra.ipbandroidapi.api.scrm.models.verification.VerificationStartResponse
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.remotedata.CloudDataSource
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse
import retrofit2.Response

interface SCRMCloudDataSource {

    suspend fun verificationChannelBegin(request: VerificationStartRequest): VerificationStartResponse

    suspend fun verificationChannelEnd(request: VerificationEndRequest): VerificationEndResponse

    suspend fun clientInfoByToken(accessToken: String): ClientInfoResponse

    suspend fun deviceIdByToken(accessToken: String): DeviceIdResponse

    suspend fun accessToken(request: AccessTokenRequest): AccessTokenResponse

    suspend fun setPersonalInfo(accessToken: String, request: ClientInfoRequest): ClientInfoResponse

    suspend fun setEmail(accessToken: String, request: EmailRequest): EmailResponse

    suspend fun setDeviceToken(accessToken: String, request: DeviceParameters): DeviceTokenResponse

    suspend fun confirmEmail(confirmEmailRequest: ConfirmEmailRequest): Response<BaseResponse>

    suspend fun getCities(): Response<CitiesListResponse>

    suspend fun getShopList(accessToken: String): Response<PurchasesListResponse>

    suspend fun getSuggestionsAddressFromDadata(dadataSuggestionsRequest: DadataSuggestionsRequest): Response<DadataSuggestionResponse>

    class Base(
        private val service: SCRMService,
        handleException: HandleException
    ) : SCRMCloudDataSource, CloudDataSource.Abstract(handleException) {

        override suspend fun verificationChannelBegin(request: VerificationStartRequest): VerificationStartResponse = handle {
            service.verificationChannelBegin(request)
        }

        override suspend fun verificationChannelEnd(request: VerificationEndRequest): VerificationEndResponse = handle {
            service.verificationChannelEnd(request)
        }

        override suspend fun clientInfoByToken(accessToken: String): ClientInfoResponse = handle {
            service.clientInfoByToken(accessToken)
        }

        override suspend fun deviceIdByToken(accessToken: String): DeviceIdResponse = handle {
            service.deviceIdByToken(accessToken)
        }

        override suspend fun accessToken(request: AccessTokenRequest): AccessTokenResponse = handle {
            service.accessToken(request)
        }

        override suspend fun setPersonalInfo(accessToken: String, request: ClientInfoRequest): ClientInfoResponse = handle {
            service.setPersonalInfo(accessToken, request)
        }

        override suspend fun setEmail(accessToken: String, request: EmailRequest): EmailResponse = handle {
            service.setEmail(accessToken, request)
        }

        override suspend fun setDeviceToken(accessToken: String, request: DeviceParameters): DeviceTokenResponse = handle {
            service.setDeviceToken(accessToken, request)
        }

        override suspend fun confirmEmail(confirmEmailRequest: ConfirmEmailRequest): Response<BaseResponse> = handle {
            service.confirmEmail(confirmEmailRequest)
        }

        override suspend fun getCities(): Response<CitiesListResponse> = handle {
            service.getCities()
        }

        override suspend fun getShopList(accessToken: String): Response<PurchasesListResponse> = handle {
            service.getShopList(accessToken)
        }

        override suspend fun getSuggestionsAddressFromDadata(dadataSuggestionsRequest: DadataSuggestionsRequest): Response<DadataSuggestionResponse> = handle {
            service.getSuggestionsAddressFromDadata(dadataSuggestionsRequest)
        }
    }
}