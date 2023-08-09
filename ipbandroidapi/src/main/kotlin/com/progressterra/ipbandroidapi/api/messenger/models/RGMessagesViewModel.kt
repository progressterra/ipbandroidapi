package com.progressterra.ipbandroidapi.api.messenger.models


import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idDialog Идентификатор диалога в котором находится сообщение
 * @param contentText Сам текст сообщения
 * @param idQuotedMessage Идентификатор сообщения, которое цитируется или на которое отвечается
 * @param idClient Идентификатор пользовавтеля, который создал сообщение
 * @param dataClientJSONData Данные текущего пользователя (его никнейм, ссылка на фото аватара). Необходим для того, чтобы каждый раз не обращаться к сервису пользователей за никнеймом
 * @param quotedMessageJSONData Данные превью цитируемого сообщения
 * @param dateRead В основмно имеет смысл при диалоге между двумя пользователями
 * @param agileListReactionData Реакция пользователей на сообщения параллельно записываем в очередь реакций, чтобы можно было считать рейтинг клиента
 * @param idLastRRGHistory Ссылка на последнее историческое сообщение, если оно было изменено
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 */


data class RGMessagesViewModel (

    /* Идентификатор диалога в котором находится сообщение */
    @SerializedName("idDialog")
    val idDialog: String? = null,

    /* Сам текст сообщения */
    @SerializedName("contentText")
    val contentText: String? = null,

    /* Идентификатор сообщения, которое цитируется или на которое отвечается */
    @SerializedName("idQuotedMessage")
    val idQuotedMessage: String? = null,

    /* Идентификатор пользовавтеля, который создал сообщение */
    @SerializedName("idClient")
    val idClient: String? = null,

    /* Данные текущего пользователя (его никнейм, ссылка на фото аватара). Необходим для того, чтобы каждый раз не обращаться к сервису пользователей за никнеймом */
    @SerializedName("dataClientJSONData")
    val dataClientJSONData: String? = null,

    /* Данные превью цитируемого сообщения */
    @SerializedName("quotedMessageJSONData")
    val quotedMessageJSONData: String? = null,

    /* В основмно имеет смысл при диалоге между двумя пользователями */
    @SerializedName("dateRead")
    val dateRead: String? = null,

    /* Реакция пользователей на сообщения параллельно записываем в очередь реакций, чтобы можно было считать рейтинг клиента */
    @SerializedName("agileListReactionData")
    val agileListReactionData: String? = null,

    /* Ссылка на последнее историческое сообщение, если оно было изменено */
    @SerializedName("idLastRRGHistory")
    val idLastRRGHistory: String? = null,

    /* Уникальный идентификатор */
    @SerializedName("idUnique")
    val idUnique: String? = null,

    /* Идентификатор организации, которой принадлежит данная запись */
    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    /* Дата добавления записи */
    @SerializedName("dateAdded")
    val dateAdded: String? = null,

    /* Дата обновления записи */
    @SerializedName("dateUpdated")
    val dateUpdated: String? = null,

    /* Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода */
    @SerializedName("dateSoftRemoved")
    val dateSoftRemoved: String? = null,

    @SerializedName("isOwnMessage")
    val isOwnMessage: Boolean? = null

)

