package com.progressterra.ipbandroidapi.api.ambassador.model

import com.google.gson.annotations.SerializedName

internal data class BankAccountDetailsRaw(
    @SerializedName("bankName")
    val bankName: String?,
    @SerializedName("bik")
    val bik: String?,
    @SerializedName("correspondentAccount")
    val correspondentAccount: String?,
    @SerializedName("kppBank")
    val kppBank: String?,
    @SerializedName("numberAccount")
    val numberAccount: String?,
    @SerializedName("tinOfBank")
    val tinOfBank: String?,
    @SerializedName("typeName")
    val typeName: String?,
    @SerializedName("tinOfClient")
    val tinOfClient: String?
)