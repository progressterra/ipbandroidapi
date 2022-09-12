package com.progressterra.ipbandroidapi.api.ambassador.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class UpdateBankInfoResponse(
    @SerializedName("data")
    val data: Data?
) : BaseResponse() {

    data class Data(
        @SerializedName("bankAccountDetails")
        val bankAccountDetails: BankAccountDetailsRaw?,
        @SerializedName("dateLastUpdate")
        val dateLastUpdate: String?,
        @SerializedName("idAmbassadorClient")
        val idAmbassadorClient: String?,
        @SerializedName("idEnterprise")
        val idEnterprise: String?,
        @SerializedName("idOfficerConfirmation")
        val idOfficerConfirmation: String?,
        @SerializedName("idUnique")
        val idUnique: String?,
        @SerializedName("jsonDataBankAccountDetails")
        val jsonDataBankAccountDetails: String?,
        @SerializedName("statusWork")
        val statusWork: Int?
    )
}


