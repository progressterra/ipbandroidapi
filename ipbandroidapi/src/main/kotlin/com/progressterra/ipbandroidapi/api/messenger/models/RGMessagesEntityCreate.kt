package com.progressterra.ipbandroidapi.api.messenger.models


import com.google.gson.annotations.SerializedName

/**
 * Минимальные данные необходимые для создания сообщения
 *
 * @param idDialog Идентификатор диалога в котором находится сообщение
 * @param contentText Сам текст сообщения
 * @param idQuotedMessage Идентификатор сообщения, которое цитируется или на которое отвечается
 */


data class RGMessagesEntityCreate (

    /* Идентификатор диалога в котором находится сообщение */
    @SerializedName("idDialog")
    val idDialog: java.util.UUID? = null,

    /* Сам текст сообщения */
    @SerializedName("contentText")
    val contentText: String? = null,

    /* Идентификатор сообщения, которое цитируется или на которое отвечается */
    @SerializedName("idQuotedMessage")
    val idQuotedMessage: java.util.UUID? = null

)

