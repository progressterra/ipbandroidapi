package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

import com.google.gson.annotations.SerializedName

internal data class DrComment(
    @SerializedName("comment")
    val comment: String?,
    @SerializedName("dateComment")
    val dateComment: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("idUser")
    val idUser: String?,
    @SerializedName("iddhSaleHead")
    val iddhSaleHead: String?,
    @SerializedName("messageForClient")
    val messageForClient: String?,
    @SerializedName("userString")
    val userString: String?
)