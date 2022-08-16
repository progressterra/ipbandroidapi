package com.progressterra.ipbandroidapi.api.imessengercore.models

import com.google.gson.annotations.SerializedName

data class DialogInfoRequest(
    @SerializedName("listId")
    var listId: List<String>,
    @SerializedName("descriptionDialog")
    var descriptionDialog: String,
    @SerializedName("additionalData")
    var additionalData: String = "",
    @SerializedName("additionalDataJSON")
    var additionalDataJSON: String
)

data class AdditionalDataJSON(
    var IDEnterprise: String,
    var URLImage: String
)