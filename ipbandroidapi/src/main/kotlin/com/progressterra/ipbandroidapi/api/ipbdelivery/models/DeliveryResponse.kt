package com.progressterra.ipbandroidapi.api.ipbdelivery.models

import com.google.gson.annotations.SerializedName

/**
 * Ответ от службы достаки о принятии груза
 *
 * @param status Статус принятия заказа  Создан - принято к исполнению  Ошибка - в иных случаях
 * @param errors Описание ошибки
 * @param order
 */
data class DeliveryResponse(

    /* Статус принятия заказа  Создан - принято к исполнению  Ошибка - в иных случаях */
    @SerializedName("status")
    val status: String? = null,

    /* Описание ошибки */
    @SerializedName("errors")
    val errors: List<ErrorMessage>? = null,

    @SerializedName("order")
    val order: CreatedOrder? = null
)