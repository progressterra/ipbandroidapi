package com.progressterra.ipbandroidapi.api.checklist.model

import java.util.*

/**
 * Выполненная проверка
 * @param idClient Кто проводит проверку или выполняет задание
 * @param idrfCheck Идентификатор чек листа шаблона (RFCheck), на основе которого прездаполняются строки и рассчитываются параметры
 * @param idBase Идентификатор документа на основе которого создан данный документ
 * @param idrfComPlace Идентификатор коммерческого места в котором проводится проверка
 * @param dateStart Начало проверки/выполнения задания. Если равно null - это задание на выполнение
 * @param dateEnd Дата окончания проверки/выполнения задания
 * @param targetGeoPoint Геоточка в которой должна быть проведена проверка. Если пустая строка, то проверка не производится
 * @param geoPoint Геоточка в которой была проведена проверка
 * @param finalComments Комментарий пользователя при окончании проверки
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 */
internal data class DHCheckPerformed(

    val idClient: UUID?,
    val idrfCheck: UUID?,
    val idBase: UUID?,
    val idrfComPlace: UUID?,
    val dateStart: java.time.LocalDateTime?,
    val dateEnd: java.time.LocalDateTime?,
    val targetGeoPoint: String?,
    val geoPoint: String?,
    val finalComments: String?,
    val idUnique: UUID?,
    val idEnterprise: UUID?,
    val dateAdded: java.time.LocalDateTime?,
    val dateUpdated: java.time.LocalDateTime?,
    val dateSoftRemoved: java.time.LocalDateTime?
)