package com.progressterra.ipbandroidapi.api.sber.model

data class PaymentData(
    val acsUrl: String,
    val error: String,
    val errorCode: String,
    val errorMessage: String,
    val info: String,
    val paReq: String,
    val redirect: String,
    val termUrl: String
) {

    constructor(data: SendCardDataResponse.Data) : this(
        data.acsUrl ?: "",
        data.error ?: "",
        data.errorCode ?: "",
        data.errorMessage ?: "",
        data.info ?: "",
        data.paReq ?: "",
        data.redirect ?: "",
        data.termUrl ?: ""
    )
}
