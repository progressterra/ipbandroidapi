package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idrgGoodsInventory Идентификатор регистра товаров для данной службы доставки
 * @param displayName Наименование, которое показывается клиенту
 * @param calculatedPrice Рассчитанная цена. Если доставка бесплатная, то возвращается 0
 * @param comment Комментарий
 * @param methodType Данные по выбранному варианту доставки.
 * @param serviceType Служба доставки (0 - IML)
 * @param pickUpPoint PickUpPoint - код (имя) пункта выдачи у выбранной службы
 */
data class DeliveryData(

    /* Идентификатор регистра товаров для данной службы доставки */
    @SerializedName("idrgGoodsInventory")
    val idrgGoodsInventory: String? = null,

    /* Наименование, которое показывается клиенту */
    @SerializedName("displayName")
    val displayName: String? = null,

    /* Рассчитанная цена. Если доставка бесплатная, то возвращается 0 */
    @SerializedName("calculatedPrice")
    val calculatedPrice: Double? = null,

    /* Комментарий */
    @SerializedName("comment")
    val comment: String? = null,

    /* Данные по выбранному варианту доставки. */
    @SerializedName("methodType")
    val methodType: Int? = null,

    /* Служба доставки (0 - IML) */
    @SerializedName("serviceType")
    val serviceType: Int? = null,

    /* PickUpPoint - код (имя) пункта выдачи у выбранной службы */
    @SerializedName("pickUpPoint")
    val pickUpPoint: String? = null

)

