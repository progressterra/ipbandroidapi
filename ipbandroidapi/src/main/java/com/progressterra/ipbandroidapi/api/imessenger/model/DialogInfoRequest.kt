package com.progressterra.ipbandroidapi.api.imessenger.model

import com.google.gson.annotations.SerializedName

internal data class DialogInfoRequest(
    @SerializedName("listId")
    val listId: List<String>,
    @SerializedName("descriptionDialog")
    val descriptionDialog: String,
    @SerializedName("additionalData")
    val additionalData: String,
    @SerializedName("additionalDataJSON")
    val additionalDataJSON: String
)