package com.progressterra.ipbandroidapi.api.imessenger.model

data class MessageData(
    val agileAttachmentContent: String,
    val agileDataQuotedMessage: String,
    val agileListReactionData: String,
    val agileMediaContent: String,
    val contentText: String,
    val dataClientJSONData: String,
    val dateChange: String,
    val dateCreate: String,
    val dateRead: String,
    val idClient: String,
    val idDialog: String,
    val idEnterprise: String,
    val idLastRRGHistory: String,
    val idUnique: String,
    val timeDisappearing: Boolean
) {

    internal constructor(data: MessagesListResponse.Data) : this(
        data.agileAttachmentContent ?: "",
        data.agileDataQuotedMessage ?: "",
        data.agileListReactionData ?: "",
        data.agileMediaContent ?: "",
        data.contentText ?: "",
        data.dataClientJSONData ?: "",
        data.dateChange ?: "",
        data.dateCreate,
        data.dateRead ?: "",
        data.idClient,
        data.idDialog,
        data.idEnterprise,
        data.idLastRRGHistory ?: "",
        data.idUnique,
        data.timeDisappearing
    )
}
