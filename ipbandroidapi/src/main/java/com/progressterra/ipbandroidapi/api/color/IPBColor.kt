package com.progressterra.ipbandroidapi.api.color

import com.progressterra.ipbandroidapi.api.color.models.ColorResponse
import com.progressterra.ipbandroidapi.api.color.models.ColoredResponse

interface IPBColor {

    suspend fun getColorsForItem(idRGGoodsInventory: String): ColorResponse

    suspend fun getColoredItem(idRGGoodsInventory: String, colorName: String): ColoredResponse

    companion object {
        fun Color(): IPBColor = IPBColorImpl()
    }
}