package com.progressterra.ipbandroidapi.api.checklist.model

import java.time.LocalDateTime
import java.util.*

/**
 * Справочник проверок/тестов
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
internal data class RFCheck(

    val language: String?,
    val name: String?,
    val description: String?,
    val urlImage: String?,
    val urlVideo: String?,
    val idUnique: UUID?,
    val idEnterprise: UUID?,
    val dateAdded: LocalDateTime?,
    val dateUpdated: LocalDateTime?,
    val dateSoftRemoved: LocalDateTime?
)