package com.progressterra.ipbandroidapi.api.iMessengerCore.models

data class MessageSendingRequest(
    val idrgDialog: String,
    val accessToken: String,
    val contentText: String
)