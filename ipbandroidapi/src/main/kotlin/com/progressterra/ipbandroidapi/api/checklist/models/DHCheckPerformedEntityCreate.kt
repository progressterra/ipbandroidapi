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
 */


data class DHCheckPerformedEntityCreate (

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
    val geoPoint: String? = null

)

