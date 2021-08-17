package com.progressterra.ipbandroidapi.remoteData.ipbAambassador

import com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.ambassador_status.AmbassadorStatusResponse
import com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.client_info.BankInfoResponse
import com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.client_info.UpdateBankDataRequest
import com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.client_info.UpdateBankInfoResponse
import com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.upload_file.UploadContractOfAmbassadorRequest
import com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.upload_file.UploadImageResponse
import com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.upload_file.UploadImageUrlRequest
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import okhttp3.MultipartBody
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface IPBAambassadorApi {
    /**
     * загрузить файл на сервер
     */
    @Multipart
    @POST("/mobile/{AccessToken}/image/{Alias}/{Tag}")
    suspend fun uploadImage(
        @Path("AccessToken") accessToken: String,
        @Path("Alias") alias: String,
        @Path("Tag") tag: String,
        @Part() image: MultipartBody.Part
    ): Response<UploadImageResponse>

    /**
     * получение информации о банковском счете клиента
     */
    @GET("/ambassador/bankdata/{AccessToken}")
    suspend fun getUserBankInfo(@Path("AccessToken") accessToken: String): BankInfoResponse

    /**
     * обновление информации о бакновском счете клиента
     */
    @POST("/ambassador/bankdata/{AccessToken}")
    suspend fun updateBankClientInfo(
        @Body updateBankInfoRequest: UpdateBankDataRequest,
        @Path("AccessToken") accessToken: String
    ): UpdateBankInfoResponse

    /**
     * получить статус для текущего пользователя
     */
    @GET("/ambassador/{AccessToken}/status")
    suspend fun getAmbassadorStatus(@Path("AccessToken") accessToken: String): AmbassadorStatusResponse

    /**
     * сделать текущего пользователя самозанятым
     */
    @POST("/ambassador/{AccessToken}/status/se")
    suspend fun becomeSelfEmployed(@Path("AccessToken") accessToken: String): AmbassadorStatusResponse

    /**
     * прикрепить ссылку на фото паспорта
     */
    @POST("/ambassador/{AccessToken}/images/passport")
    suspend fun uploadPassportPhotoUrl(
        @Path("AccessToken") accessToken: String,
        @Body uploadImageUrlRequest: UploadImageUrlRequest
    ): ResultResponse

    /**
     * прикрепить ссылку на фото СНИЛС
     */
    @POST("/ambassador/{AccessToken}/images/snils")
    suspend fun uploadSnilsPhotoUrl(
        @Path("AccessToken") accessToken: String,
        @Body uploadImageUrlRequest: UploadImageUrlRequest
    ): ResultResponse

    /**
     * Скачать договор с самозанятым
     */
    @Streaming
    @GET("/ambassador/{AccessToken}/contract/draft")
    suspend fun getContractOfAmbassador(@Path("AccessToken") accessToken: String): ResponseBody

    /**
     * прикрепить ссылку на договор
     */
    @POST("/ambassador/contract/seturlimage")
    suspend fun uploadAmbassadorContractPhotoUrl(
        @Body uploadImageUrlRequest: UploadContractOfAmbassadorRequest
    ): ResultResponse
}

