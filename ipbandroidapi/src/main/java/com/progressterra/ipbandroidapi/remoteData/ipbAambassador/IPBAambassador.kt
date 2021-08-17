package com.progressterra.ipbandroidapi.remoteData.ipbAambassador

import com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.ambassador_status.AmbassadorStatusResponse
import com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.client_info.BankInfoResponse
import com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.client_info.UpdateBankInfoResponse
import com.progressterra.ipbandroidapi.remoteData.models.base.ResultResponse
import okhttp3.ResponseBody
import retrofit2.Response

/**
 * http://84.201.184.154:5087/docsapi/v1/index.html
 */
interface IPBAambassador {
    interface Ambassador {
        suspend fun getUserBankData(accessToken: String): BankInfoResponse

        suspend fun updateUserBankData(
            accessToken: String,
            bankName: String,
            numberAccount: String,
            bik: String,
            correspondentAccount: String,
            tinOfBank: String,
            kppBank: String
        ): UpdateBankInfoResponse

        suspend fun uploadSnilsPhotoUrl(
            snilsPhotoUrl: String,
            accessToken: String
        ): ResultResponse

        suspend fun uploadPassportPhotoUrl(
            passportPhotoUrl: String,
            accessToken: String
        ): ResultResponse

        suspend fun getAmbassadorStatus(accessToken: String): AmbassadorStatusResponse

        suspend fun getContractOfAmbassador(accessToken: String): Response<ResponseBody>

        suspend fun uploadAmbassadorContractPhotoUrl(
            accessToken: String,
            urlImage: String
        ): ResultResponse
    }

    interface MoneyOut

    interface Product

    interface SaleFix
}

fun IPBAambassadorAmbassador(): IPBAambassador.Ambassador = IPBAambassadorImpl()