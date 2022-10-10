package com.progressterra.ipbandroidapi.api.checklist.model

import java.time.LocalDateTime

/**
 * 
 * @param idrfCheck Идентификатор чек листа шаблона (RFCheck), на основе которого прездаполняются строки и рассчитываются параметры
 * @param idBase Идентификатор документа на основе которого создан данный документ
 * @param idrfComPlace Идентификатор коммерческого места в котором проводится проверка
 * @param dateStart Начало проверки/выполнения задания. Если равно null - это задание на выполнение
 * @param targetGeoPoint Геоточка в которой должна быть проведена проверка. Если пустая строка, то проверка не производится
 * @param geoPoint Геоточка в которой была проведена проверка
 * @param idClient Кто проводит проверку или выполняет задание
 * @param finalComments Комментарий пользователя при окончании проверки
 * @param dateEnd Дата окончания проверки/выполнения задания
 * @param idUnique Уникальный идентификатор
 * @param idEnterprise Идентификатор организации, которой принадлежит данная запись
 * @param dateAdded Дата добавления записи
 * @param dateUpdated Дата обновления записи
 * @param dateSoftRemoved Если дата установлена, то сущность помечена на удаление. Физически данные не удаляются  Функции Delete лишь помечают сущность на удаление устанавливая дату вызова метода
 * @param nameComPlace 
 * @param nameRFCheck 
 * @param countDR 
 * @param countDRPositiveAnswer 
 * @param countDRNegativeAnswer 
 */
data class DHCheckPerformedFullDataViewModel (

    val idrfCheck: String?,
    val idBase: String?,
    val idrfComPlace: String?,
    val dateStart: LocalDateTime?,
    val targetGeoPoint: String?,
    val geoPoint: String?,
    val idClient: String?,
    val finalComments: String?,
    val dateEnd: LocalDateTime?,
    val idUnique: String?,
    val idEnterprise: String?,
    val dateAdded: LocalDateTime?,
    val dateUpdated: LocalDateTime?,
    val dateSoftRemoved: LocalDateTime?,
    val nameComPlace: String?,
    val nameRFCheck: String?,
    val countDR: Int?,
    val countDRPositiveAnswer: Int?,
    val countDRNegativeAnswer: Int?
)