package com.progressterra.ipbandroidapi.remoteData.ipbAmbassador.models.ambassador_status


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class AmbassadorStatusResponse(
    @SerializedName("data")
    val ambassadorInfo: AmbassadorInfo,
) : BaseResponse()

data class AmbassadorInfo(
    @SerializedName("dataAmbassador")
    val dataAmbassador: DataAmbassador? = null,
    @SerializedName("message")
    val message: String? = null,
    @SerializedName("statusText")
    val statusText: String? = null,
    @SerializedName("statusWork")
    val statusWork: Int? = null
)

data class DataAmbassador(
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
    @SerializedName("queryStatusWork")
    val queryStatusWork: Int? = null,
    @SerializedName("statusWork")
    val statusWork: Int? = null,
    @SerializedName("urlImagePassport")
    val urlImagePassport: String? = null,
    @SerializedName("urlImageSNILS")
    val urlImageSNILS: String? = null,
    @SerializedName("urlImageContractGPH")
    val urlImagesContract: String? = null,
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
    val typeName: String? = null
)