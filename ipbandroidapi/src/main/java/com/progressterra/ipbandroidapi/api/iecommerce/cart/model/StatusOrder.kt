package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName

/**
 * Статусы заказа.
 */
enum class StatusOrder {

    /**
     * Заказ оформлен IPB->ERP.
     */
    @SerializedName("0")
    ORDER,

    /**
     * Статус подтверждения/резервироания наличия товара на складе ERP->IPB.
     */
    @SerializedName("1")
    CONFIRM_FROM_STORE,

    /**
     * Заказ подтвержден по колцецтру ERP->IPB.
     */
    @SerializedName("2")
    CONFIRM_FROM_CALL_CENTER,

    /**
     * Статус передано в сборку ERP->IPB.
     */
    @SerializedName("3")
    SENT_TO_WAREHOUSE,

    /**
     * Статус собран и передан в курьерскую службу ERP->IPB.
     */
    @SerializedName("4")
    SENT_DELIVERY_SERVICE,

    /**
     * Статус товар в пункте выдачи КУРС->IPB->ERP.
     */
    @SerializedName("5")
    ON_PICK_UP_POINT,

    /**
     * Заказ получен КУРС->IPB->ERP.
     */
    @SerializedName("6")
    DELIVERED,

    /**
     * Или заказ вернули/не забыли/отказались КУРС->IPB->ERP.
     */
    @SerializedName("7")
    CANCELED
}