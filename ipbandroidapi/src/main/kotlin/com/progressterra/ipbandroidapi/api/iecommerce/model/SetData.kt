package com.progressterra.ipbandroidapi.api.iecommerce.model


import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param idrgGoodsInventory
 * @param name
 */

data class SetData(

    @SerializedName("idrgGoodsInventory")
    val idrgGoodsInventory: String? = null,

    @SerializedName("name")
    val name: String? = null

)

