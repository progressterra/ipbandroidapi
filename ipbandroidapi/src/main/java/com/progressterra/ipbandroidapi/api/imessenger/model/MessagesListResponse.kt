package com.progressterra.ipbandroidapi.api.imessenger.model

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class MessagesListResponse(
    @SerializedName("countPage")
    val countPage: Int,
    @SerializedName("dataList")
    val dataList: List<Data>?,
) : BaseResponse() {

    data class Data(
        @SerializedName("agileAttachmentContent")
        val agileAttachmentContent: String?,
        @SerializedName("agileDataQuotedMessage")
        val agileDataQuotedMessage: String?,
        @SerializedName("agileListReactionData")
        val agileListReactionData: String?,
        @SerializedName("agileMediaContent")
        val agileMediaContent: String?,
        @SerializedName("contentText")
        val contentText: String?,
        @SerializedName("dataClientJSONData")
        val dataClientJSONData: String?,
        @SerializedName("dateChange")
        val dateChange: String?,
        @SerializedName("dateCreate")
        val dateCreate: String,
        @SerializedName("dateRead")
        val dateRead: String?,
        @SerializedName("idClient")
        val idClient: String,
        @SerializedName("idDialog")
        val idDialog: String,
        @SerializedName("idEnterprise")
        val idEnterprise: String,
        @SerializedName("idLastRRGHistory")
        val idLastRRGHistory: String?,
        @SerializedName("idUnique")
        val idUnique: String,
        @SerializedName("timeDisappearing")
        val timeDisappearing: Boolean
    )
}


