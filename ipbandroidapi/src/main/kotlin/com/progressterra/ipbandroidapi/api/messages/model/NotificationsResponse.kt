package com.progressterra.ipbandroidapi.api.messages.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

internal data class NotificationsResponse(
    @SerializedName("dataList") val dataList: List<Data>?
) : BaseResponse() {

    data class Data(
        @SerializedName("idUnique") val idUnique: String?,
        @SerializedName("idEnterprise") val idEnterprise: String?,
        @SerializedName("idClient") val idClient: String?,
        @SerializedName("idMarketingEvent") val idMarketingEvent: String?,
        @SerializedName("deliveryData") val deliveryData: String?,
        @SerializedName("channel") val channel: Int?,
        @SerializedName("description") val description: String?,
        @SerializedName("message") val message: String?,
        @SerializedName("messageSecond") val messageSecond: String?,
        @SerializedName("statusSended") val statusSended: String?,
        @SerializedName("dateRead") val dateRead: String?,
        @SerializedName("maxDateActual") val maxDateActual: String?,
        @SerializedName("dateLoad") val dateLoad: String?,
        @SerializedName("dateToSend") val dateToSend: String?,
        @SerializedName("dateSent") val dateSent: String?,
        @SerializedName("mediaDataLink") val mediaDataLink: String?
    )
}