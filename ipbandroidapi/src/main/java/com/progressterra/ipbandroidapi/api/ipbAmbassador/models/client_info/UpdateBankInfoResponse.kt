package com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class UpdateBankInfoResponse(
    @SerializedName("data")
    val data: BankDataExtended? = null
) : BaseResponse()

data class BankDataExtended(
    @SerializedName("bankAccountDetails")
    val bankAccountDetails: BankAccountDetails? = null,
    @SerializedName("dateLastUpdate")
    val dateLastUpdate: String? = null,
    @SerializedName("idAmbassadorClient")
    val idAmbassadorClient: String? = null,
    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,
    @SerializedName("idOfficerConfirmation")
    val idOfficerConfirmation: String? = null,
    @SerializedName("idUnique")
    val idUnique: String? = null,
    @SerializedName("jsonDataBankAccountDetails")
    val jsonDataBankAccountDetails: String? = null,
    @SerializedName("statusWork")
    val statusWork: Int? = null
)

data class BankAccountDetails(
    @SerializedName("bankName")
    val bankName: String? = null,
    @SerializedName("bik")
    val bik: String? = null,
    @SerializedName("correspondentAccount")
    val correspondentAccount: String? = null,
    @SerializedName("kppBank")
    val kppBank: String? = null,
    @SerializedName("numberAccount")
    val numberAccount: String? = null,
    @SerializedName("tinOfBank")
    val tinOfBank: String? = null,
    @SerializedName("typeName")
    val typeName: String? = null,
    @SerializedName("tinOfClient")
    val tinOfClient: String? = null
)
