package com.progressterra.ipbandroidapi.api.ambassador

import com.progressterra.ipbandroidapi.api.ambassador.model.AmbassadorData
import com.progressterra.ipbandroidapi.api.ambassador.model.AmbassadorStatusData
import com.progressterra.ipbandroidapi.api.ambassador.model.BankAccountDetailsData
import com.progressterra.ipbandroidapi.api.ambassador.model.BankExtendedData

interface AmbassadorRepository {

    suspend fun getUserBankInfo(accessToken: String): Result<BankAccountDetailsData>

    suspend fun updateBankClientInfo(
        typeName: String = "",
        bankName: String = "",
        numberAccount: String = "",
        bik: String = "",
        correspondentAccount: String = "",
        tinOfBank: String = "",
        kppBank: String = "",
        tinOfClient: String = "",
        accessToken: String = ""
    ): Result<BankExtendedData>

    suspend fun getAmbassadorStatus(accessToken: String): Result<AmbassadorStatusData>

    suspend fun becomeSelfEmployed(accessToken: String): Result<AmbassadorStatusData>

    suspend fun uploadPassportPhotoUrl(
        accessToken: String,
        urlImage: String
    ): Result<Unit>

    suspend fun uploadSnilsPhotoUrl(
        accessToken: String,
        urlImage: String
    ): Result<Unit>

    suspend fun getContractOfAmbassador(accessToken: String): Result<Unit>

    suspend fun uploadAmbassadorContractPhotoUrl(
        accessToken: String,
        urlImage: String
    ): Result<Unit>

    suspend fun setDirectPaymentCooperationType(
        accessToken: String
    ): Result<AmbassadorData>

    suspend fun setNewNumber(
        accessToken: String,
        phone: String,
        verifiedChannelCode: String
    ): Result<AmbassadorData>
}