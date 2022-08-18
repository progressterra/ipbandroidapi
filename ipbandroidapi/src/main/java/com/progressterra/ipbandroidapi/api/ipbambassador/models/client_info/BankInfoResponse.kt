package com.progressterra.ipbandroidapi.api.ipbambassador.models.client_info

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

data class BankInfoResponse(
    @SerializedName("data")
    val clientBankData: BankData
) : BaseResponse()

data class BankData(
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

