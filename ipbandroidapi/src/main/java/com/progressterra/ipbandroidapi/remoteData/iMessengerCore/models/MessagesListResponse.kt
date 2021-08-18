package com.progressterra.ipbandroidapi.remoteData.iMessengerCore.models


import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse


data class MessagesListResponse(
    @SerializedName("countPage")
    val countPage: Int? = null,
    @SerializedName("dataList")
    val dataList: List<MessageData>? = null,
) : BaseResponse()

data class MessageData(
    @SerializedName("agileAttachmentContent")
    val agileAttachmentContent: String? = null,
    @SerializedName("agileDataQuotedMessage")
    val agileDataQuotedMessage: String? = null,
    @SerializedName("agileListReactionData")
    val agileListReactionData: String? = null,
    @SerializedName("agileMediaContent")
    val agileMediaContent: String? = null,
    @SerializedName("contentText")
    val contentText: String? = null,
    @SerializedName("dataClientJSONData")
    val dataClientJSONData: String? = null,
    @SerializedName("dateChange")
    val dateChange: String? = null,
    @SerializedName("dateCreate")
    val dateCreate: String? = null,
    @SerializedName("dateRead")
    val dateRead: String? = null,
    @SerializedName("idClient")
    val idClient: String? = null,
    @SerializedName("idDialog")
    val idDialog: String? = null,
    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,
    @SerializedName("idLastRRGHistory")
    val idLastRRGHistory: String? = null,
    @SerializedName("idUnique")
    val idUnique: String? = null,
    @SerializedName("timeDisappearing")
    val timeDisappearing: Boolean? = null
)

