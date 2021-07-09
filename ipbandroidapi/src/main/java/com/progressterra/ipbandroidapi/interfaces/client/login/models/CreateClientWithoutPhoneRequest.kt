package com.progressterra.ipbandroidapi.interfaces.client.login.models

data class CreateClientWithoutPhoneRequest(
    val channelName: String = "",
    val channelValue: String = "",
    val tokenIncome: String = "",
    val confirmCode: String = ""
)