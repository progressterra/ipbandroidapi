package com.progressterra.ipbandroidapi.remoteData.iProBonusApi.models.cart

data class ChangeProductCountInCartRequest(
    val idGoodsInventory: String,
    val count: Int,
    val idSellerAmbassador: String
)