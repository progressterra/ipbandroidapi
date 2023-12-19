package com.progressterra.ipbandroidapi.api.checklist.models


import com.google.gson.annotations.SerializedName

/**
 * 
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

    /* Идентификатор чек листа шаблона (RFCheck), на основе которого прездаполняются строки и рассчитываются параметры */
    @SerializedName("idrfCheck")
    val idrfCheck: String? = null,

    /* Идентификатор документа на основе которого создан данный документ */
    @SerializedName("idBase")
    val idBase: String? = null,

    /* Идентификатор коммерческого места в котором проводится проверка */
    @SerializedName("idrfComPlace")
    val idrfComPlace: String? = null,

    /* Начало проверки/выполнения задания. Если равно null - это задание на выполнение */
    @SerializedName("dateStart")
    val dateStart: String? = null,

    /* Геоточка в которой должна быть проведена проверка. Если пустая строка, то проверка не производится */
    @SerializedName("targetGeoPoint")
    val targetGeoPoint: String? = null,

    /* Геоточка в которой была проведена проверка */
    @SerializedName("geoPoint")
    val geoPoint: String? = null,

    /* Кто проводит проверку или выполняет задание */
    @SerializedName("idClient")
    val idClient: String? = null,

    /* Комментарий пользователя при окончании проверки */
    @SerializedName("finalComments")
    val finalComments: String? = null,

    /* Дата окончания проверки/выполнения задания */
    @SerializedName("dateEnd")
    val dateEnd: String? = null,

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
    val dateSoftRemoved: String? = null,

    @SerializedName("nameComPlace")
    val nameComPlace: String? = null,

    @SerializedName("nameRFCheck")
    val nameRFCheck: String? = null,

    @SerializedName("countDR")
    val countDR: Int? = null,

    @SerializedName("countDRPositiveAnswer")
    val countDRPositiveAnswer: Int? = null,

    @SerializedName("countDRNegativeAnswer")
    val countDRNegativeAnswer: Int? = null

)

