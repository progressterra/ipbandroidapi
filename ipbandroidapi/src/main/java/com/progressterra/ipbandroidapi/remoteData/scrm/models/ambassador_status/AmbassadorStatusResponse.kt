package com.progressterra.ipbandroidapi.remoteData.scrm.models.ambassador_status


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class AmbassadorStatusResponse(
    @SerializedName("data")
    val ambassadorInfo: AmbassadorInfo,
) : BaseResponse()

data class AmbassadorInfo(
    @SerializedName("dataAmbassador")
    val dataAmbassador: DataAmbassador?,
    @SerializedName("message")
    val message: String,
    @SerializedName("statusText")
    val statusText: String,
    @SerializedName("statusWork")
    val statusWork: Int
)

data class DataAmbassador(
    @SerializedName("bankAccountDetails")
    val bankAccountDetails: BankAccountDetails?,
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