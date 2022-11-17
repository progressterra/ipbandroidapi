package com.progressterra.ipbandroidapi.api.ipbdelivery.models

import com.google.gson.annotations.SerializedName

/**
 * Станции метро.
 *
 * @param rdStationName Название станции.
 * @param rdLineName Название линии.
 * @param rdLatitude Географическая широта.
 * @param rdLongtitude Географическая широта.
 */
data class MetroStation(

    /* Название станции. */
    @SerializedName("rdStationName")
    val rdStationName: String? = null,

    /* Название линии. */
    @SerializedName("rdLineName")
    val rdLineName: String? = null,

    /* Географическая широта. */
    @SerializedName("rdLatitude")
    val rdLatitude: Double? = null,

    /* Географическая широта. */
    @SerializedName("rdLongtitude")
    val rdLongtitude: Double? = null
)