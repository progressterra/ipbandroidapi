package com.progressterra.ipbandroidapi.api.iecommerce.model


import com.google.gson.annotations.SerializedName

/**
 * Параметры товаров для корзины. Используется в API V3
 *
 * @param idGoodsInventory Идентификатор регистра товара конкретного магазина
 * @param count Количество добавляемого товара
 * @param idSellerAmbassador Идентификатор продавца или амбассадора              DEPRICATED - устанавливается на основе данных из сервиса амбасадоров
 */

data class ParamGoodsToECommers(

    /* Идентификатор регистра товара конкретного магазина */
    @SerializedName("idGoodsInventory")
    val idGoodsInventory: String? = null,

    /* Количество добавляемого товара */
    @SerializedName("count")
    val count: Int? = null,

    /* Идентификатор продавца или амбассадора              DEPRICATED - устанавливается на основе данных из сервиса амбасадоров */
    @SerializedName("idSellerAmbassador")
    val idSellerAmbassador: String? = null

)

