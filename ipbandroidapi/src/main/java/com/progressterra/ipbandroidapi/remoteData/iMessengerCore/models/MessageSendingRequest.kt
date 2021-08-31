package com.progressterra.ipbandroidapi.remoteData.iMessengerCore.models

data class MessageSendingRequest(
    val idrgDialog: String,
    val accessToken: String,
    val contentText: String
)