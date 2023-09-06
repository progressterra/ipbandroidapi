package com.progressterra.ipbandroidapi.api.collaboration.models


import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param name Наименование торговой точки
 * @param address Адрес точки
 * @param idCtiy Город в котором находится торговая точка
 * @param contacts Контакты
 * @param latitude Широта
 * @param longitude Долгота
 * @param imageURL Изображение торговой точки
 * @param shopType Тип магазина
 * @param idUnique
 * @param idEnterprise
 * @param dateOpen
 * @param dateClose
 */


data class RFShop(

    /* Наименование торговой точки */
    @SerializedName("name") val name: String? = null,

    /* Адрес точки */
    @SerializedName("address") val address: String? = null,

    /* Город в котором находится торговая точка */
    @SerializedName("idCtiy") val idCtiy: String? = null,

    /* Контакты */
    @SerializedName("contacts") val contacts: String? = null,

    /* Широта */
    @SerializedName("latitude") val latitude: Double? = null,

    /* Долгота */
    @SerializedName("longitude") val longitude: Double? = null,

    /* Изображение торговой точки */
    @SerializedName("imageURL") val imageURL: String? = null,

    /* Тип магазина */
    @SerializedName("shopType") val shopType: Int? = null,

    @SerializedName("idUnique") val idUnique: String? = null,

    @SerializedName("idEnterprise") val idEnterprise: String? = null,

    @SerializedName("dateOpen") val dateOpen: String? = null,

    @SerializedName("dateClose") val dateClose: String? = null

)

