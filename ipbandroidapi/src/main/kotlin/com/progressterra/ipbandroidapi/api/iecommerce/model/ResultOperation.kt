package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 * Универсальный результат операции
 *
 * @param status
 * @param message Сообщение, которые выдается пользователю
 * @param messageDev Внутренее сообщение для разработчиков
 * @param codeResult Код  результата. Зарезервированное поле
 * @param duration Продолжительность операции в миллисекундах
 * @param idLog Идентификатор лог файле, если есть запись об операции
 */

data class ResultOperation(

    @SerializedName("status")
    val status: Int? = null,

    /* Сообщение, которые выдается пользователю */
    @SerializedName("message")
    val message: String? = null,

    /* Внутренее сообщение для разработчиков */
    @SerializedName("messageDev")
    val messageDev: String? = null,

    /* Код  результата. Зарезервированное поле */
    @SerializedName("codeResult")
    val codeResult: Int? = null,

    /* Продолжительность операции в миллисекундах */
    @SerializedName("duration")
    val duration: Double? = null,

    /* Идентификатор лог файле, если есть запись об операции */
    @SerializedName("idLog")
    val idLog: String? = null

)

