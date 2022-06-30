package com.progressterra.ipbandroidapi.api.color

import com.progressterra.ipbandroidapi.api.color.models.ColorResponse

interface IPBColor {

    suspend fun getColorsForItem(idRGGoodsInventory: String): ColorResponse

    companion object {
        fun Color(): IPBColor = IPBColorImpl()
    }
}