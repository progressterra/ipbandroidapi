package com.progressterra.ipbandroidapi.api.iecommerce.cart.model

data class CommentData(
    val comment: String,
    val dateComment: String,
    val idUnique: String,
    val idUser: String,
    val iddhSaleHead: String,
    val messageForClient: String,
    val userString: String
) {

    internal constructor(data: DrComment?) : this(
        data?.comment ?: "",
        data?.dateComment ?: "",
        data?.idUnique ?: "",
        data?.idUser ?: "",
        data?.iddhSaleHead ?: "",
        data?.messageForClient ?: "",
        data?.userString ?: ""
    )
}
