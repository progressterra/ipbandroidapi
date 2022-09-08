package com.progressterra.ipbandroidapi.api.ambassador.models

import com.google.gson.annotations.SerializedName

data class AmbassadorDataRaw(
    @SerializedName("address")
    val address: String?,
    @SerializedName("bankAccountDetails")
    val bankAccountDetails: BankAccountDetailsRaw?,
    @SerializedName("dataForDirectPayment")
    val dataForDirectPayment: String?,
    @SerializedName("dateGPH")
    val dateGPH: String?,
    @SerializedName("dateLastUpdate")
    val dateLastUpdate: String?,
    @SerializedName("dateOfBirth")
    val dateOfBirth: String?,
    @SerializedName("idAmbassadorClient")
    val idAmbassadorClient: String?,
    @SerializedName("idEnterprise")
    val idEnterprise: String?,
    @SerializedName("idOfficerConfirmation")
    val idOfficerConfirmation: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("idrfTypeCooperation")
    val idrfTypeCooperation: String?,
    @SerializedName("jsonDataBankAccountDetails")
    val jsonDataBankAccountDetails: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("numberGPH")
    val numberGPH: String?,
    @SerializedName("officialData")
    val officialData: String?,
    @SerializedName("passportGet")
    val passportGet: String?,
    @SerializedName("passportNumber")
    val passportNumber: String?,
    @SerializedName("passportSerial")
    val passportSerial: String?,
    @SerializedName("patronicName")
    val patronicName: String?,
    @SerializedName("queryStatusWork")
    val queryStatusWork: Int?,
    @SerializedName("soname")
    val soname: String?,
    @SerializedName("stateAmbassador")
    val stateAmbassador: Int?,
    @SerializedName("statusWork")
    val statusWork: Int?,
    @SerializedName("tin")
    val tin: String?,
    @SerializedName("urlImageContractGPH")
    val urlImageContractGPH: String?,
    @SerializedName("urlImagePassport")
    val urlImagePassport: String?,
    @SerializedName("urlImageSNILS")
    val urlImageSNILS: String?
)