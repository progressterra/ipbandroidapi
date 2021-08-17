package com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.client_info

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class UpdateBankInfoResponse(
    @SerializedName("data")
    val data: BankDataExtended
) : BaseResponse()

data class BankDataExtended(
    @SerializedName("bankAccountDetails")
    val bankAccountDetails: BankAccountDetails,
    @SerializedName("dateLastUpdate")
    val dateLastUpdate: String,
    @SerializedName("idAmbassadorClient")
    val idAmbassadorClient: String,
    @SerializedName("idEnterprise")
    val idEnterprise: String,
    @SerializedName("idOfficerConfirmation")
    val idOfficerConfirmation: String,
    @SerializedName("idUnique")
    val idUnique: String,
    @SerializedName("jsonDataBankAccountDetails")
    val jsonDataBankAccountDetails: String,
    @SerializedName("statusWork")
    val statusWork: Int
)

data class BankAccountDetails(
    @SerializedName("bankName")
    val bankName: String,
    @SerializedName("bik")
    val bik: String,
    @SerializedName("correspondentAccount")
    val correspondentAccount: String,
    @SerializedName("kppBank")
    val kppBank: String,
    @SerializedName("numberAccount")
    val numberAccount: String,
    @SerializedName("tinOfBank")
    val tinOfBank: String,
    @SerializedName("typeName")
    val typeName: String
)
