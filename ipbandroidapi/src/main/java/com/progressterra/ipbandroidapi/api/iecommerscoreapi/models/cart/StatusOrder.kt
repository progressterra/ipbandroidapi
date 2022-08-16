package com.progressterra.ipbandroidapi.api.iecommerscoreapi.models.cart

import com.google.gson.annotations.SerializedName

/**
 * Статусы заказа: Order/0. Заказ оформлен IPB->ERP
 * ConfirmFromStore/1. Статус подтверждения/резервироания наличия товара на складе ERP->IPB
 * ConfirmFromCallCenter/2. Заказ подтвержден по колцецтру ERP->IPB
 * SentToWarehouse/3. Статус передано в сборку ERP->IPB
 * SentDeliveryService/4. Статус собран и передан в курьерскую службу ERP->IPB
 * OnPickUpPoint/5. Статус товар в пункте выдачи КУРС->IPB->ERP
 * Delivered/6. Заказ получен КУРС->IPB->ERP
 * Canceled/7. Или заказ вернули/не забыли/отказались КУРС->IPB->ERP
 */
enum class StatusOrder(val value: Int) {
    @SerializedName("0")
    ORDER(0),
    @SerializedName("1")
    CONFIRM_FROM_STORE(1),
    @SerializedName("2")
    CONFIRM_FROM_CALL_CENTER(2),
    @SerializedName("3")
    SENT_TO_WAREHOUSE(3),
    @SerializedName("4")
    SENT_DELIVERY_SERVICE(4),
    @SerializedName("5")
    ON_PICK_UP_POINT(5),
    @SerializedName("6")
    DELIVERED(6),
    @SerializedName("7")
    CANCELED(7)
}