package com.progressterra.ipbandroidapi.api.ipbAmbassador

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.ambassador_status.AmbassadorStatusResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.BankInfoResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.UpdateBankDataRequest
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info.UpdateBankInfoResponse
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.upload_file.UploadContractOfAmbassadorRequest
import com.progressterra.ipbandroidapi.api.ipbAmbassador.models.upload_file.UploadImageUrlRequest
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import okhttp3.ResponseBody
import retrofit2.Response

internal class IPBAmbassadorImpl : IPBAmbassador.Ambassador {

    private val networkService: NetworkService = NetworkServiceImpl()
    private val ipbAmbassadorApi =
        networkService.createService(IPBAmbassadorApi::class.java, NetworkSettings.AMBASSADOR_URL)


    override suspend fun getUserBankData(accessToken: String): BankInfoResponse {
        return ipbAmbassadorApi.getUserBankInfo(accessToken)
    }

    override suspend fun updateUserBankData(
        accessToken: String,
        bankName: String,
        numberAccount: String,
        bik: String,
        correspondentAccount: String,
        tinOfBank: String,
        kppBank: String,
        tinOfClient: String
    ): UpdateBankInfoResponse {
        return ipbAmbassadorApi.updateBankClientInfo(
            UpdateBankDataRequest(
                bankName = bankName,
                numberAccount = numberAccount,
                bik = bik,
                correspondentAccount = correspondentAccount,
                tinOfBank = tinOfBank,
                kppBank = kppBank,
                tinOfClient = tinOfClient
            ), accessToken
        )
    }

    override suspend fun uploadSnilsPhotoUrl(
        snilsPhotoUrl: String,
        accessToken: String
    ): ResultResponse {
        return ipbAmbassadorApi.uploadSnilsPhotoUrl(
            accessToken,
            UploadImageUrlRequest(snilsPhotoUrl)
        )
    }

    override suspend fun uploadPassportPhotoUrl(
        passportPhotoUrl: String,
        accessToken: String
    ): ResultResponse {
        return ipbAmbassadorApi.uploadPassportPhotoUrl(
            accessToken,
            UploadImageUrlRequest(passportPhotoUrl)
        )
    }

    override suspend fun becomeSelfEmployed(accessToken: String): AmbassadorStatusResponse {
        return ipbAmbassadorApi.becomeSelfEmployed(accessToken)
    }

    override suspend fun getAmbassadorStatus(accessToken: String): AmbassadorStatusResponse {
        return ipbAmbassadorApi.getAmbassadorStatus(accessToken)
    }

    override suspend fun getContractOfAmbassador(accessToken: String): Response<ResponseBody> {
        return ipbAmbassadorApi.getContractOfAmbassador(accessToken)
    }

    override suspend fun uploadAmbassadorContractPhotoUrl(
        accessToken: String,
        urlImage: String
    ): ResultResponse {
        return ipbAmbassadorApi.uploadAmbassadorContractPhotoUrl(
            UploadContractOfAmbassadorRequest(
                accessToken,
                urlImage
            )
        )
    }
}