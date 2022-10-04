package com.progressterra.ipbandroidapi.api.ambassador

import com.progressterra.ipbandroidapi.api.ambassador.model.*
import com.progressterra.ipbandroidapi.api.ambassador.model.SetNewPhoneRequest
import com.progressterra.ipbandroidapi.api.ambassador.model.UpdateBankDataRequest
import com.progressterra.ipbandroidapi.api.ambassador.model.UploadContractOfAmbassadorRequest
import com.progressterra.ipbandroidapi.api.ambassador.model.UploadImageUrlRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseAmbassadorRepository(
    private val cloudDataSource: AmbassadorCloudDataSource
) : AbstractRepository(), AmbassadorRepository {

    override suspend fun getUserBankInfo(accessToken: String): Result<BankAccountDetailsData> = handle {
        val response = cloudDataSource.getUserBankInfo(accessToken)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        BankAccountDetailsData(it.clientBankData)
    }

    override suspend fun updateBankClientInfo(
        typeName: String,
        bankName: String,
        numberAccount: String,
        bik: String,
        correspondentAccount: String,
        tinOfBank: String,
        kppBank: String,
        tinOfClient: String,
        accessToken: String
    ): Result<BankExtendedData> = handle {
        val response = cloudDataSource.updateBankClientInfo(
            UpdateBankDataRequest(
                typeName,
                bankName,
                numberAccount,
                bik,
                correspondentAccount,
                tinOfBank,
                kppBank,
                tinOfClient
            ), accessToken
        )
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        BankExtendedData(it.data)
    }

    override suspend fun getAmbassadorStatus(accessToken: String): Result<AmbassadorStatusData> = handle {
        val response = cloudDataSource.getAmbassadorStatus(accessToken)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        AmbassadorStatusData(it.ambassadorInfo)
    }

    override suspend fun becomeSelfEmployed(accessToken: String): Result<AmbassadorStatusData> = handle {
        val response = cloudDataSource.becomeSelfEmployed(accessToken)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        AmbassadorStatusData(it.ambassadorInfo)
    }

    override suspend fun uploadPassportPhotoUrl(
        accessToken: String,
        urlImage: String
    ): Result<Unit> = handle {
        val response = cloudDataSource.uploadPassportPhotoUrl(accessToken, UploadImageUrlRequest(urlImage))
        if (response.status != 0)
            throw BadRequestException()
    }

    override suspend fun uploadSnilsPhotoUrl(accessToken: String, urlImage: String): Result<Unit> = handle {
        val response = cloudDataSource.uploadSnilsPhotoUrl(accessToken, UploadImageUrlRequest(urlImage))
        if (response.status != 0)
            throw BadRequestException()
    }

    override suspend fun getContractOfAmbassador(accessToken: String): Result<Unit> = handle {
        cloudDataSource.getContractOfAmbassador(accessToken)
    }

    override suspend fun uploadAmbassadorContractPhotoUrl(accessToken: String, urlImage: String): Result<Unit> =
        handle {
            val response = cloudDataSource.uploadAmbassadorContractPhotoUrl(
                UploadContractOfAmbassadorRequest(
                    accessToken,
                    urlImage
                )
            )
            if (response.status != 0)
                throw BadRequestException()
        }

    override suspend fun setDirectPaymentCooperationType(accessToken: String): Result<AmbassadorData> = handle {
        val response = cloudDataSource.setDirectPaymentCooperationType(accessToken)
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        AmbassadorData(it.data?.dataAmbassador)
    }

    override suspend fun setNewNumber(
        accessToken: String,
        phone: String,
        verifiedChannelCode: String
    ): Result<AmbassadorData> = handle {
        val response =
            cloudDataSource.setNewNumber(accessToken, SetNewPhoneRequest(accessToken, phone, verifiedChannelCode))
        if (response.status != 0)
            throw BadRequestException()
        response
    }.map {
        AmbassadorData(it.data?.dataAmbassador)
    }
}