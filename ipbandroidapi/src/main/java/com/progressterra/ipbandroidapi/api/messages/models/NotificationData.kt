package com.progressterra.ipbandroidapi.api.messages.models

data class NotificationData(
    val idUnique: String,
    val idEnterprise: String,
    val idClient: String,
    val idMarketingEvent: String,
    val deliveryData: String,
    val channel: Int,
    val description: String,
    val message: String,
    val messageSecond: String,
    val statusSended: String,
    val dateRead: String,
    val maxDateActual: String,
    val dateLoad: String,
    val dateToSend: String,
    val dateSent: String,
    val mediaDataLink: String
) {

    constructor(data: NotificationsResponse.Data) : this(
        data.idUnique ?: "",
        data.idEnterprise ?: "",
        data.idClient ?: "",
        data.idMarketingEvent ?: "",
        data.deliveryData ?: "",
        data.channel ?: 0,
        data.description ?: "",
        data.message ?: "",
        data.messageSecond ?: "",
        data.statusSended ?: "",
        data.dateRead ?: "",
        data.maxDateActual ?: "",
        data.dateLoad ?: "",
        data.dateToSend ?: "",
        data.dateSent ?: "",
        data.mediaDataLink ?: ""
    )
}