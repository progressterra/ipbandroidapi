package com.progressterra.ipbandroidapi.api.iProBonusApi.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse

data class NotificationsResponse(
    @SerializedName("dataList") val dataList: List<NotificationDTO>? = null
) : BaseResponse()

data class NotificationDTO(
    @SerializedName("idUnique") val idUnique: String? = null,
    @SerializedName("idEnterprise") val idEnterprise: String? = null,
    @SerializedName("idClient") val idClient: String? = null,
    @SerializedName("idMarketingEvent") val idMarketingEvent: String? = null,
    @SerializedName("deliveryData") val deliveryData: String? = null,
    @SerializedName("channel") val channel: Int? = null,
    @SerializedName("description") val description: String? = null,
    @SerializedName("message") val message: String? = null,
    @SerializedName("messageSecond") val messageSecond: String? = null,
    @SerializedName("statusSended") val statusSended: String? = null,
    @SerializedName("dateRead") val dateRead: String? = null,
    @SerializedName("maxDateActual") val maxDateActual: String? = null,
    @SerializedName("dateLoad") val dateLoad: String? = null,
    @SerializedName("dateToSend") val dateToSend: String? = null,
    @SerializedName("dateSent") val dateSent: String? = null,
    @SerializedName("mediaDataLink") val mediaDataLink: String? = null
)