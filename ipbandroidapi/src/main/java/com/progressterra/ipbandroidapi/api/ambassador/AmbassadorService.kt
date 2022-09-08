package com.progressterra.ipbandroidapi.api.ambassador

import com.progressterra.ipbandroidapi.api.ambassador.models.AmbassadorStatusResponse
import com.progressterra.ipbandroidapi.api.ambassador.models.BankInfoResponse
import com.progressterra.ipbandroidapi.api.ambassador.models.UpdateBankDataRequest
import com.progressterra.ipbandroidapi.api.ambassador.models.UpdateBankInfoResponse
import com.progressterra.ipbandroidapi.api.ambassador.models.AmbassadorDataResponse
import com.progressterra.ipbandroidapi.api.ambassador.models.SetNewPhoneRequest
import com.progressterra.ipbandroidapi.api.ambassador.models.UploadContractOfAmbassadorRequest
import com.progressterra.ipbandroidapi.api.ambassador.models.UploadImageUrlRequest
import com.progressterra.ipbandroidapi.base.ResultResponse
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface AmbassadorService {

    @GET("/ambassador/bankdata/{AccessToken}")
    suspend fun getUserBankInfo(@Path("AccessToken") accessToken: String): BankInfoResponse

    @POST("/ambassador/bankdata/{AccessToken}")
    suspend fun updateBankClientInfo(
        @Body updateBankInfoRequest: UpdateBankDataRequest,
        @Path("AccessToken") accessToken: String
    ): UpdateBankInfoResponse

    @GET("/ambassador/{AccessToken}/status")
    suspend fun getAmbassadorStatus(@Path("AccessToken") accessToken: String): AmbassadorStatusResponse

    @POST("/ambassador/{AccessToken}/status/se")
    suspend fun becomeSelfEmployed(@Path("AccessToken") accessToken: String): AmbassadorStatusResponse

    @POST("/ambassador/{AccessToken}/images/passport")
    suspend fun uploadPassportPhotoUrl(
        @Path("AccessToken") accessToken: String,
        @Body uploadImageUrlRequest: UploadImageUrlRequest
    ): ResultResponse

    @POST("/ambassador/{AccessToken}/images/snils")
    suspend fun uploadSnilsPhotoUrl(
        @Path("AccessToken") accessToken: String,
        @Body uploadImageUrlRequest: UploadImageUrlRequest
    ): ResultResponse

    @Streaming
    @GET("/ambassador/{AccessToken}/contract/draft")
    suspend fun getContractOfAmbassador(@Path("AccessToken") accessToken: String): Response<ResponseBody>

    @POST("/ambassador/contract/seturlimage")
    suspend fun uploadAmbassadorContractPhotoUrl(
        @Body uploadImageUrlRequest: UploadContractOfAmbassadorRequest
    ): ResultResponse

    @POST("/ambassador/{AccessToken}/directpayment/default")
    suspend fun setDirectPaymentCooperationType(
        @Path("AccessToken") accessToken: String
    ): AmbassadorDataResponse

    @POST("/ambassador/{AccessToken}/directpayment/newphone")
    suspend fun setNewNumber(
        @Path("AccessToken") accessToken: String,
        @Body newPhoneRequest: SetNewPhoneRequest
    ): AmbassadorDataResponse
}

