package com.progressterra.ipbandroidapi.api.iecommerce.model

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param count
 * @param idrgGoodsInventoty
 */
data class DataRowInCart(

    @SerializedName("count")
    val count: Int? = null,

    @SerializedName("idrgGoodsInventoty")
    val idrgGoodsInventoty: String? = null

)

