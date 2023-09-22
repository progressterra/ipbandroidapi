package com.progressterra.ipbandroidapi.api.iamhere.models

import com.google.gson.annotations.SerializedName

/**
 * Геоточка пользователя
 *
 * @param namePlace Название места
 * @param addressPlace Адрес места, где находится пользователь
 * @param idrfPlace Коммерческое место из сервиса коммерческих точек
 * @param geoPointPlace 
 * @param geoPointReal 
 */


data class GeoData (

    /* Название места */
    @SerializedName("namePlace")
    val namePlace: String? = null,

    /* Адрес места, где находится пользователь */
    @SerializedName("addressPlace")
    val addressPlace: String? = null,

    /* Коммерческое место из сервиса коммерческих точек */
    @SerializedName("idrfPlace")
    val idrfPlace: String? = null,

    @SerializedName("geoPointPlace")
    val geoPointPlace: GeoPoint? = null,

    @SerializedName("geoPointReal")
    val geoPointReal: GeoPoint? = null

)

