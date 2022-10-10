package com.progressterra.ipbandroidapi.api.checklist.model

import java.time.LocalDateTime

/**
 * Универсальная структура, которая позволяет разбивать тесты на показатели и производить универсальное представление по языкам
 * @param idrfCheck Какому чек листу/тесту принадлежит параметр
 * @param indexName Индекс параметра
 * @param internalName Представление параметра
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 */
data class RFTestParameters (

    val idrfCheck: String?,
    val indexName: String?,
    val internalName: String?,
    val idUnique: String?,
    val idEnterprise: String?,
    val dateAdded: LocalDateTime?,
    val dateUpdated: LocalDateTime?,
    val dateSoftRemoved: LocalDateTime?
)