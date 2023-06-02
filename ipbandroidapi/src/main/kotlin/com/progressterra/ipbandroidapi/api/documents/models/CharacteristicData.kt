package com.progressterra.ipbandroidapi.api.documents.models

import com.google.gson.annotations.SerializedName

/**
 *
 *
 * @param characteristicType
 * @param characteristicValue
 * @param isMandatory Признак обязательной характеристики, которую нужно обязательно заполнить
 * @param imageRequired Признак того, что требуется фото для документа
 */
data class CharacteristicData(

    @SerializedName("characteristicType")
    val characteristicType: RFCharacteristicTypeViewModel? = null,

    @SerializedName("characteristicValue")
    val characteristicValue: RFCharacteristicValueViewModel? = null,

    /* Признак обязательной характеристики, которую нужно обязательно заполнить */
    @SerializedName("isMandatory")
    val isMandatory: Boolean? = null,

    /* Признак того, что требуется фото для документа */
    @SerializedName("imageRequired")
    val imageRequired: Boolean? = null

)
