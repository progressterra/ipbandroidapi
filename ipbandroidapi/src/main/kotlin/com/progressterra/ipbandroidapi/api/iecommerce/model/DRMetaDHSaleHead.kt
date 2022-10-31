package com.progressterra.ipbandroidapi.api.iecommerce.model


import com.google.gson.annotations.SerializedName

/**
 * Содержит дополнитеульную информацию о документе в виде пар ключ-значение
 *
 * @param idUnique
 * @param iddhSaleHead
 * @param key
 * @param `value` Значение в текстовом формате. Может быть AgileModel
 */

data class DRMetaDHSaleHead(

    @SerializedName("idUnique")
    val idUnique: String? = null,

    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,

    @SerializedName("key")
    val key: String? = null,

    /* Значение в текстовом формате. Может быть AgileModel */
    @SerializedName("value")
    val `value`: String? = null

)

