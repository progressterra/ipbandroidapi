package com.progressterra.ipbandroidapi.api.product.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param characteristicType
 * @param characteristicValue
 */
data class CharacteristicData(

    @SerializedName("characteristicType") val characteristicType: RFCharacteristicTypeViewModel? = null,

    @SerializedName("characteristicValue") val characteristicValue: RFCharacteristicValueViewModel? = null
)
