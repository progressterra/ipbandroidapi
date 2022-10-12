package com.progressterra.ipbandroidapi.api.checklist.model

/**
 *
 * @param language
 * @param name
 * @param description
 * @param urlImage
 * @param urlVideo
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 */
data class RFCheckViewModel(

    val language: String?,
    val name: String?,
    val description: String?,
    val urlImage: String?,
    val urlVideo: String?,
    val idUnique: String?,
    val idEnterprise: String?,
    val dateAdded: String?,
    val dateUpdated: String?,
    val dateSoftRemoved: String?
)