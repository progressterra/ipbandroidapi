package com.progressterra.ipbandroidapi.api.checklist.models


import com.google.gson.annotations.SerializedName

/**
 * Справочник проверок/тестов
 *
 * @param language Язык чек листа
 * @param name Наименование чек листа
 * @param description Описание чек листа
 * @param urlImage Прикрепленное изображение (но лучше использоваться сервис медиаданных)
 * @param urlVideo Прикрепленное видео (но лучше использоваться сервис медиаданных)
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 */


data class RFCheck (

    /* Язык чек листа */
    @SerializedName("language")
    val language: String? = null,

    /* Наименование чек листа */
    @SerializedName("name")
    val name: String? = null,

    /* Описание чек листа */
    @SerializedName("description")
    val description: String? = null,

    /* Прикрепленное изображение (но лучше использоваться сервис медиаданных) */
    @SerializedName("urlImage")
    val urlImage: String? = null,

    /* Прикрепленное видео (но лучше использоваться сервис медиаданных) */
    @SerializedName("urlVideo")
    val urlVideo: String? = null,

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

