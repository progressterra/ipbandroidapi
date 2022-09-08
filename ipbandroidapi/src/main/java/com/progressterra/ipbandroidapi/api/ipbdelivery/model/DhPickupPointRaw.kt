package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName

data class DhPickupPointRaw(
    @SerializedName("drrdAddress")
    val drrdAddress: String? = null,
    @SerializedName("drrdSite")
    val drrdSite: String? = null,
    @SerializedName("drrdWorkHour")
    val drrdWorkHour: String? = null,
    @SerializedName("drrfLatitude")
    val drrfLatitude: Double? = null,
    @SerializedName("drrfLongitude")
    val drrfLongitude: Double? = null,
    @SerializedName("drrfPickupPointCode")
    val drrfPickupPointCode: String? = null,
    @SerializedName("drrfType")
    val drrfType: String? = null,
    @SerializedName("drrfPaymentAvaliable")
    val drrfPaymentAvaliable: Int? = null,
    @SerializedName("drrdDressingRoom")
    val drrdDressingRoom: Boolean? = null,
    @SerializedName("drrdCanTake")
    val drrdCanTake: Boolean? = null,
    @SerializedName("drrdWhereIs")
    val drrdWhereIs: String? = null,
    @SerializedName("drrdMetroStation")
    val drrdMetroStation: String? = null
)