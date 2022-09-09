package com.progressterra.ipbandroidapi.api.ambassador

import com.progressterra.ipbandroidapi.api.ambassador.model.*
import com.progressterra.ipbandroidapi.base.ResultResponse
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException
import okhttp3.ResponseBody

interface AmbassadorCloudDataSource {

    suspend fun getUserBankInfo(accessToken: String): BankInfoResponse

    suspend fun updateBankClientInfo(
        updateBankInfoRequest: UpdateBankDataRequest,
        accessToken: String
    ): UpdateBankInfoResponse

    suspend fun getAmbassadorStatus(accessToken: String): AmbassadorStatusResponse

    suspend fun becomeSelfEmployed(accessToken: String): AmbassadorStatusResponse

    suspend fun uploadPassportPhotoUrl(
        accessToken: String,
        uploadImageUrlRequest: UploadImageUrlRequest
    ): ResultResponse

    suspend fun uploadSnilsPhotoUrl(
        accessToken: String,
        uploadImageUrlRequest: UploadImageUrlRequest
    ): ResultResponse

    suspend fun getContractOfAmbassador(accessToken: String): ResponseBody

    suspend fun uploadAmbassadorContractPhotoUrl(
        uploadImageUrlRequest: UploadContractOfAmbassadorRequest
    ): ResultResponse

    suspend fun setDirectPaymentCooperationType(
        accessToken: String
    ): AmbassadorDataResponse

    suspend fun setNewNumber(
        accessToken: String,
        newPhoneRequest: SetNewPhoneRequest
    ): AmbassadorDataResponse

    class Base(
        private val service: AmbassadorService,
        handleException: HandleException
    ) : AbstractCloudDataSource(handleException), AmbassadorCloudDataSource {

        override suspend fun getUserBankInfo(accessToken: String): BankInfoResponse = handle {
            service.getUserBankInfo(accessToken)
        }

        override suspend fun updateBankClientInfo(
            updateBankInfoRequest: UpdateBankDataRequest,
            accessToken: String
        ): UpdateBankInfoResponse = handle {
            service.updateBankClientInfo(updateBankInfoRequest, accessToken)
        }

        override suspend fun getAmbassadorStatus(accessToken: String): AmbassadorStatusResponse = handle {
            service.getAmbassadorStatus(accessToken)
        }

        override suspend fun becomeSelfEmployed(accessToken: String): AmbassadorStatusResponse = handle {
            service.becomeSelfEmployed(accessToken)
        }

        override suspend fun uploadPassportPhotoUrl(
            accessToken: String,
            uploadImageUrlRequest: UploadImageUrlRequest
        ): ResultResponse = handle {
            service.uploadPassportPhotoUrl(accessToken, uploadImageUrlRequest)
        }

        override suspend fun uploadSnilsPhotoUrl(
            accessToken: String,
            uploadImageUrlRequest: UploadImageUrlRequest
        ): ResultResponse = handle {
            service.uploadSnilsPhotoUrl(accessToken, uploadImageUrlRequest)
        }

        override suspend fun getContractOfAmbassador(accessToken: String): ResponseBody = handle {
            service.getContractOfAmbassador(accessToken)
        }

        override suspend fun uploadAmbassadorContractPhotoUrl(
            uploadImageUrlRequest: UploadContractOfAmbassadorRequest
        ): ResultResponse = handle {
            service.uploadAmbassadorContractPhotoUrl(uploadImageUrlRequest)
        }

        override suspend fun setDirectPaymentCooperationType(accessToken: String): AmbassadorDataResponse = handle {
            service.setDirectPaymentCooperationType(accessToken)
        }

        override suspend fun setNewNumber(
            accessToken: String,
            newPhoneRequest: SetNewPhoneRequest
        ): AmbassadorDataResponse = handle {
            service.setNewNumber(accessToken, newPhoneRequest)
        }
    }
}