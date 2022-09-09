package com.progressterra.ipbandroidapi.api.ambassador.model

import com.google.gson.annotations.SerializedName

data class AmbassadorDetailsRaw(
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
    @SerializedName("queryStatusWork")
    val queryStatusWork: Int?,
    @SerializedName("statusWork")
    val statusWork: Int?,
    @SerializedName("urlImagePassport")
    val urlImagePassport: String?,
    @SerializedName("urlImageSNILS")
    val urlImageSNILS: String?,
    @SerializedName("urlImageContractGPH")
    val urlImagesContract: String?,
)