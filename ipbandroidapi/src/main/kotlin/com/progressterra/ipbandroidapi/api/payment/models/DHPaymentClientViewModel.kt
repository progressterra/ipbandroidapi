package com.progressterra.ipbandroidapi.api.payment.models

import com.google.gson.annotations.SerializedName

/**
 * 
 *
 * @param idPaymentData Идентификатор данных оплаты
 * @param amount Сумма, которая выплачивается
 * @param status 
 * @param previewPaymentMethod Строковое представление данных оплаты
 * @param errorDescription Ошибка, которую транслируем клиенту, если статус не успешен
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 */


data class DHPaymentClientViewModel (

    /* Идентификатор данных оплаты */
    @SerializedName("idPaymentData")
    val idPaymentData: String? = null,

    /* Сумма, которая выплачивается */
    @SerializedName("amount")
    val amount: Double? = null,

    @SerializedName("status")
    val status: TypeResultOperationBisinessArea? = null,

    /* Строковое представление данных оплаты */
    @SerializedName("previewPaymentMethod")
    val previewPaymentMethod: String? = null,

    /* Ошибка, которую транслируем клиенту, если статус не успешен */
    @SerializedName("errorDescription")
    val errorDescription: String? = null,

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
    val dateSoftRemoved: String? = null

)

