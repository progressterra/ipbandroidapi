package com.progressterra.ipbandroidapi.api.ambassador.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class UpdateBankInfoResponse(
    @SerializedName("data")
    val data: Data? = null
) : BaseResponse() {

    data class Data(
        @SerializedName("bankAccountDetails")
        val bankAccountDetails: BankAccountDetailsRaw? = null,
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
}


