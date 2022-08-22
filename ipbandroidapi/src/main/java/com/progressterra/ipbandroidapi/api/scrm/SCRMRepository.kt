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
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse
import retrofit2.Response

interface SCRMRepository {

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
        private val sCRMCloudDataSource: SCRMCloudDataSource
    ) : SCRMRepository {

        override suspend fun verificationChannelBegin(request: VerificationStartRequest): VerificationStartResponse =
            sCRMCloudDataSource.verificationChannelBegin(request)

        override suspend fun verificationChannelEnd(request: VerificationEndRequest): VerificationEndResponse =
            sCRMCloudDataSource.verificationChannelEnd(request)

        override suspend fun clientInfoByToken(accessToken: String): ClientInfoResponse =
            sCRMCloudDataSource.clientInfoByToken(accessToken)

        override suspend fun deviceIdByToken(accessToken: String): DeviceIdResponse =
            sCRMCloudDataSource.deviceIdByToken(accessToken)

        override suspend fun accessToken(request: AccessTokenRequest): AccessTokenResponse =
            sCRMCloudDataSource.accessToken(request)

        override suspend fun setPersonalInfo(accessToken: String, request: ClientInfoRequest): ClientInfoResponse =
            sCRMCloudDataSource.setPersonalInfo(accessToken, request)

        override suspend fun setEmail(accessToken: String, request: EmailRequest): EmailResponse =
            sCRMCloudDataSource.setEmail(accessToken, request)

        override suspend fun setDeviceToken(accessToken: String, request: DeviceParameters): DeviceTokenResponse =
            sCRMCloudDataSource.setDeviceToken(accessToken, request)

        override suspend fun confirmEmail(confirmEmailRequest: ConfirmEmailRequest): Response<BaseResponse> =
            sCRMCloudDataSource.confirmEmail(confirmEmailRequest)

        override suspend fun getCities(): Response<CitiesListResponse> = sCRMCloudDataSource.getCities()

        override suspend fun getShopList(accessToken: String): Response<PurchasesListResponse> =
            sCRMCloudDataSource.getShopList(accessToken)

        override suspend fun getSuggestionsAddressFromDadata(dadataSuggestionsRequest: DadataSuggestionsRequest): Response<DadataSuggestionResponse> =
            sCRMCloudDataSource.getSuggestionsAddressFromDadata(dadataSuggestionsRequest)
    }
}