package com.progressterra.ipbandroidapi.api.ambassador.models

import com.google.gson.annotations.SerializedName

data class BankAccountDetailsRaw(
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