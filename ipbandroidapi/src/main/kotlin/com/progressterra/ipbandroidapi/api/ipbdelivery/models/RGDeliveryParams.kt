package com.progressterra.ipbandroidapi.api.ipbdelivery.models

import com.google.gson.annotations.SerializedName

/**
 * Параметры создания заказа.
 *
 * @param rfMethodType
 * @param rfServiceType
 * @param rdPickUpPoint Имя пункта выдачи.
 */
data class RGDeliveryParams(

    @SerializedName("rfMethodType")
    val rfMethodType: DeliveryMethondTypeEnum? = null,

    @SerializedName("rfServiceType")
    val rfServiceType: DeliverySeriviceTypeEnum? = null,

    /* Имя пункта выдачи. */
    @SerializedName("rdPickUpPoint")
    val rdPickUpPoint: String? = null
)