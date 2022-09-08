package com.progressterra.ipbandroidapi.api.imessenger.model

import com.google.gson.annotations.SerializedName

data class MessageSendingRequest(
    @SerializedName("idrgDialog")
    val idrgDialog: String,
    @SerializedName("accessToken")
    val accessToken: String,
    @SerializedName("contentText")
    val contentText: String
)