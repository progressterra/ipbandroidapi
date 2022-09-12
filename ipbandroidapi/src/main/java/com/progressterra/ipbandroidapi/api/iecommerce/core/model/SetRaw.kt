package com.progressterra.ipbandroidapi.api.iecommerce.core.model

import com.google.gson.annotations.SerializedName

internal data class SetRaw(
    @SerializedName("idrgGoodsInventory") val idrgGoodsInventory: String?,
    @SerializedName("name") val name: String?
)