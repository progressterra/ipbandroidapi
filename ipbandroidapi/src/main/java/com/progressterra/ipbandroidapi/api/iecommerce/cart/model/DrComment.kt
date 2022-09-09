package com.progressterra.ipbandroidapi.api.iecommerce.cart.model


import com.google.gson.annotations.SerializedName

data class DrComment(
    @SerializedName("comment")
    val comment: String? = null,
    @SerializedName("dateComment")
    val dateComment: String? = null,
    @SerializedName("idUnique")
    val idUnique: String? = null,
    @SerializedName("idUser")
    val idUser: String? = null,
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String? = null,
    @SerializedName("messageForClient")
    val messageForClient: String? = null,
    @SerializedName("userString")
    val userString: String? = null
)