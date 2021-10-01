package com.progressterra.ipbandroidapi.api.ipbAmbassador.models.client_info

import com.google.gson.annotations.SerializedName

data class UpdateBankDataRequest(
    @SerializedName("typeName")
    var typeName: String = "",
    @SerializedName("bankName")
    var bankName: String,
    @SerializedName("numberAccount")
    var numberAccount: String,
    @SerializedName("bik")
    var bik: String,
    @SerializedName("correspondentAccount")
    var correspondentAccount: String,
    @SerializedName("tinOfBank")
    var tinOfBank: String,
    @SerializedName("kppBank")
    var kppBank: String,
    @SerializedName("tinOfClient")
    val tinOfClient: String
)