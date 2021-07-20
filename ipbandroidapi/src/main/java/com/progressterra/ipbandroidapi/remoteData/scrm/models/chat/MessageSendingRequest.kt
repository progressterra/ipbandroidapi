package com.progressterra.ipbandroidapi.remoteData.scrm.models.chat

data class MessageSendingRequest(
    val idrgDialog:String,
    val accessToken:String,
    val contentText:String
)