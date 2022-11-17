package com.progressterra.ipbandroidapi.api.ipbdelivery.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param rfDeliveryService Служба доставки
 * @param rdOrderNumber Номер заказа.
 * @param rfOrderStatus Состояние заказа.
 * @param rfOrderStatusDescription Статус заказа.
 * @param rdStatusDate Последние обновление статуса.
 * @param rdDeliveryDate Дата доставки.
 * @param rdCreationDate Дата создания
 * @param rdAmount Стоимость заказа
 * @param rdAddress Адресс
 * @param rdNumberPosition Количество позиций
 */
data class OrderStatusInfo(

    /* Служба доставки */
    @SerializedName("rfDeliveryService")
    val rfDeliveryService: String? = null,

    /* Номер заказа. */
    @SerializedName("rdOrderNumber")
    val rdOrderNumber: String? = null,

    /* Состояние заказа. */
    @SerializedName("rfOrderStatus")
    val rfOrderStatus: String? = null,

    /* Статус заказа. */
    @SerializedName("rfOrderStatusDescription")
    val rfOrderStatusDescription: String? = null,

    /* Последние обновление статуса. */
    @SerializedName("rdStatusDate")
    val rdStatusDate: String? = null,

    /* Дата доставки. */
    @SerializedName("rdDeliveryDate")
    val rdDeliveryDate: String? = null,

    /* Дата создания */
    @SerializedName("rdCreationDate")
    val rdCreationDate: String? = null,

    /* Стоимость заказа */
    @SerializedName("rdAmount")
    val rdAmount: Double? = null,

    /* Адресс */
    @SerializedName("rdAddress")
    val rdAddress: String? = null,

    /* Количество позиций */
    @SerializedName("rdNumberPosition")
    val rdNumberPosition: Int? = null
)