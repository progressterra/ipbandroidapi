package com.progressterra.ipbandroidapi.api.cart.models


import com.google.gson.annotations.SerializedName

/**
 * Статусы заказа:<para />  Order/0. Заказ оформлен IPB->ERP<para />  ConfirmFromStore/1. Статус подтверждения/резервироания наличия товара на складе ERP->IPB<para />  ConfirmFromCallCenter/2. Заказ подтвержден по колцецтру  ERP->IPB<para />  SentToWarehouse/3. Статус передано в сборку  ERP->IPB<para />  SentDeliveryService/4. Статус собран и передан в курьерскую службу  ERP->IPB<para />  OnPickUpPoint/5. Статус товар в пункте выдачи КУРС->IPB->ERP<para />  Delivered/6. Заказ получен КУРС->IPB->ERP<para />  Canceled/7. Или заказ вернули/не забыли/отказались КУРС->IPB->ERP<para />
 *
 * Values: oneClick,cart,order,confirmFromStore,confirmFromCallCenter,sentToWarehouse,sentDeliveryService,onPickUpPoint,delivered,canceled
 */

enum class TypeStatusOrder {

    @SerializedName("oneClick")
    ONE_CLICK,

    @SerializedName("cart")
    CART,

    @SerializedName("order")
    ORDER,

    @SerializedName("confirmFromStore")
    CONFIRM_FROM_STORE,

    @SerializedName("confirmFromCallCenter")
    CONFIRM_FROM_CALL_CENTER,

    @SerializedName("sentToWarehouse")
    SENT_TO_WAREHOUSE,

    @SerializedName("sentDeliveryService")
    SENT_DELIVERY_SERVICE,

    @SerializedName("onPickUpPoint")
    ON_PICK_UP_POINT,

    @SerializedName("delivered")
    DELIVERED,

    @SerializedName("canceled")
    CANCELED
}
