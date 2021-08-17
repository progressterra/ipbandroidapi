package com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.client_info


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class BankInfoResponse(
    @SerializedName("data")
    val clientBankData: BankData
) : BaseResponse()

data class BankData(
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

