package com.progressterra.ipbandroidapi.api.ipbdelivery.model

import com.google.gson.annotations.SerializedName

internal data class DhPickupPointRaw(
    @SerializedName("drrdAddress")
    val drrdAddress: String?,
    @SerializedName("drrdSite")
    val drrdSite: String?,
    @SerializedName("drrdWorkHour")
    val drrdWorkHour: String?,
    @SerializedName("drrfLatitude")
    val drrfLatitude: Double?,
    @SerializedName("drrfLongitude")
    val drrfLongitude: Double?,
    @SerializedName("drrfPickupPointCode")
    val drrfPickupPointCode: String?,
    @SerializedName("drrfType")
    val drrfType: String?,
    @SerializedName("drrfPaymentAvaliable")
    val drrfPaymentAvaliable: Int?,
    @SerializedName("drrdDressingRoom")
    val drrdDressingRoom: Boolean?,
    @SerializedName("drrdCanTake")
    val drrdCanTake: Boolean?,
    @SerializedName("drrdWhereIs")
    val drrdWhereIs: String?,
    @SerializedName("drrdMetroStation")
    val drrdMetroStation: String?
)