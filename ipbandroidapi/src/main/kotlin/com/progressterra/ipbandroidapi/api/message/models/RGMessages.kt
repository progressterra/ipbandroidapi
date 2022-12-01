package com.progressterra.ipbandroidapi.api.message.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idUnique
 * @param idEnterprise
 * @param idClient Идентификатор пользовавтеля, который создал сообщение
 * @param dataClientJSONData Данные текущего пользователя (его никнейм, ссылка на фото аватара). Необходим для того, чтобы каждый раз не обращаться к сервису пользователей за никнеймом
 * @param idDialog Идентификатор диалога в котором находится сообщение
 * @param timeDisappearing Время в секундах которое живет сообщение. Если 0, но не исчезающее того, что сообщения исчезающие. Работает только в личных переписках не групповых
 * @param agileDataQuotedMessage Данные превью цитируемого сообщения
 * @param contentText Сам текст сообщения
 * @param agileMediaContent Изображения, видео
 * @param dateCreate Дата создания сообщения
 * @param dateRead В основмно имеет смысл при диалоге между двумя пользователями
 * @param agileAttachmentContent У сообщения может быть несколько приложенных файлов. А это значит, что нужны ссылки на несколько приложенных файлов
 * @param agileListReactionData Реакция пользователей на сообщения параллельно записываем в очередь реакций, чтобы можно было считать рейтинг клиента
 * @param dateChange Дата изменения сообщения
 * @param idLastRRGHistory Ссылка на последнее историческое сообщение, если оно было изменено
 */
data class RGMessages(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("idEnterprise")
    val idEnterprise: String? = null,

    /* Идентификатор пользовавтеля, который создал сообщение */
    @SerializedName("idClient")
    val idClient: String? = null,

    /* Данные текущего пользователя (его никнейм, ссылка на фото аватара). Необходим для того, чтобы каждый раз не обращаться к сервису пользователей за никнеймом */
    @SerializedName("dataClientJSONData")
    val dataClientJSONData: String? = null,

    /* Идентификатор диалога в котором находится сообщение */
    @SerializedName("idDialog")
    val idDialog: String? = null,

    /* Время в секундах которое живет сообщение. Если 0, но не исчезающее того, что сообщения исчезающие. Работает только в личных переписках не групповых */
    @SerializedName("timeDisappearing")
    val timeDisappearing: Boolean? = null,

    /* Данные превью цитируемого сообщения */
    @SerializedName("agileDataQuotedMessage")
    val agileDataQuotedMessage: String? = null,

    /* Сам текст сообщения */
    @SerializedName("contentText")
    val contentText: String? = null,

    /* Изображения, видео */
    @SerializedName("agileMediaContent")
    val agileMediaContent: String? = null,

    /* Дата создания сообщения */
    @SerializedName("dateCreate")
    val dateCreate: String? = null,

    /* В основмно имеет смысл при диалоге между двумя пользователями */
    @SerializedName("dateRead")
    val dateRead: String? = null,

    /* У сообщения может быть несколько приложенных файлов. А это значит, что нужны ссылки на несколько приложенных файлов */
    @SerializedName("agileAttachmentContent")
    val agileAttachmentContent: String? = null,

    /* Реакция пользователей на сообщения параллельно записываем в очередь реакций, чтобы можно было считать рейтинг клиента */
    @SerializedName("agileListReactionData")
    val agileListReactionData: String? = null,

    /* Дата изменения сообщения */
    @SerializedName("dateChange")
    val dateChange: String? = null,

    /* Ссылка на последнее историческое сообщение, если оно было изменено */
    @SerializedName("idLastRRGHistory")
    val idLastRRGHistory: String? = null
)
