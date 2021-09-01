package com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.cart

data class ChangeProductCountInCartRequest(
    val idGoodsInventory: String,
    val count: Int,
    val idSellerAmbassador: String
)