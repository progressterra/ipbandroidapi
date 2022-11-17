package com.progressterra.ipbandroidapi.api.ipbdelivery.models

import com.google.gson.annotations.SerializedName

/**
 * Созданный заказ - заказ у службы доставки
 *
 * @param rdOrderId Идентификатор заказа
 * @param rfDeliveryService Служба доставки
 * @param rdDeliveryBarCode Штрих-код заказа
 * @param rfDeliveryMethod Способ доставки
 * @param rdCustomerName Имя покупателя
 * @param rdCustomerPhone Телефон покупателя
 * @param rdFrom Откуда доставляется
 * @param rdTo Куда происходит доставка
 * @param rdAddress Адрес доставки
 * @param rdDateDelivery Ожидаемая дата доставки
 * @param rdWeight Вес посылки
 */
data class CreatedOrder(

    /* Идентификатор заказа */
    @SerializedName("rdOrderId")
    val rdOrderId: String? = null,

    /* Служба доставки */
    @SerializedName("rfDeliveryService")
    val rfDeliveryService: String? = null,

    /* Штрих-код заказа */
    @SerializedName("rdDeliveryBarCode")
    val rdDeliveryBarCode: String? = null,

    /* Способ доставки */
    @SerializedName("rfDeliveryMethod")
    val rfDeliveryMethod: String? = null,

    /* Имя покупателя */
    @SerializedName("rdCustomerName")
    val rdCustomerName: String? = null,

    /* Телефон покупателя */
    @SerializedName("rdCustomerPhone")
    val rdCustomerPhone: String? = null,

    /* Откуда доставляется */
    @SerializedName("rdFrom")
    val rdFrom: String? = null,

    /* Куда происходит доставка */
    @SerializedName("rdTo")
    val rdTo: String? = null,

    /* Адрес доставки */
    @SerializedName("rdAddress")
    val rdAddress: String? = null,

    /* Ожидаемая дата доставки */
    @SerializedName("rdDateDelivery")
    val rdDateDelivery: String? = null,

    /* Вес посылки */
    @SerializedName("rdWeight")
    val rdWeight: Double? = null
)