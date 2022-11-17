package com.progressterra.ipbandroidapi.api.ipbdelivery.models

import com.google.gson.annotations.SerializedName

/**
 * Способ доставки
 *
 * @param rdDestinationPoint Адрес доставки
 * @param rfDeliveryType Тип доставки
 * @param rdPrice Предполагаемая цена
 * @param rdDeliveryTime Предполагаемиая дата
 * @param dhPickupPointInfo
 */
data class DeliveryMethod(

    /* Адрес доставки */
    @SerializedName("rdDestinationPoint")
    val rdDestinationPoint: String? = null,

    /* Тип доставки */
    @SerializedName("rfDeliveryType")
    val rfDeliveryType: String? = null,

    /* Предполагаемая цена */
    @SerializedName("rdPrice")
    val rdPrice: Double? = null,

    /* Предполагаемиая дата */
    @SerializedName("rdDeliveryTime")
    val rdDeliveryTime: String? = null,

    @SerializedName("dhPickupPointInfo")
    val dhPickupPointInfo: PickupPoint? = null
)