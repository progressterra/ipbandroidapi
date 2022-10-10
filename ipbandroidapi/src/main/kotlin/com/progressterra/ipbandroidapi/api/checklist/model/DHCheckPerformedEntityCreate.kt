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
 */
data class DHCheckPerformedEntityCreate (

    val idrfCheck: String?,
    val idBase: String?,
    val idrfComPlace: String?,
    val dateStart: LocalDateTime?,
    val targetGeoPoint: String?,
    val geoPoint: String?
)