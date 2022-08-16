package com.progressterra.ipbandroidapi.api.imessengercore.models

data class MessageSendingRequest(
    val idrgDialog: String,
    val accessToken: String,
    val contentText: String
)