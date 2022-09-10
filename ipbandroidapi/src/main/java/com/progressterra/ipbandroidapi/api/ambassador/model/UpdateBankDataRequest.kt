package com.progressterra.ipbandroidapi.api.ambassador.model

import com.google.gson.annotations.SerializedName

internal data class UpdateBankDataRequest(
    @SerializedName("typeName")
    val typeName: String = "",
    @SerializedName("bankName")
    val bankName: String,
    @SerializedName("numberAccount")
    val numberAccount: String,
    @SerializedName("bik")
    val bik: String,
    @SerializedName("correspondentAccount")
    val correspondentAccount: String,
    @SerializedName("tinOfBank")
    val tinOfBank: String,
    @SerializedName("kppBank")
    val kppBank: String,
    @SerializedName("tinOfClient")
    val tinOfClient: String
)