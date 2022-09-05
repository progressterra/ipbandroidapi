package com.progressterra.ipbandroidapi.api.color

import com.progressterra.ipbandroidapi.api.URL
import com.progressterra.ipbandroidapi.api.color.models.ColorResponse
import com.progressterra.ipbandroidapi.api.color.models.ColoredResponse
import com.progressterra.ipbandroidapi.core.NetworkService

class IPBColorImpl : IPBColor {
    private val networkService: NetworkService = NetworkService.Base()
    private val api = networkService.createService(
        IPBColorApi::class.java,
        URL.IPB_PRODUCT_URL
    )

    override suspend fun getColoredItem(idRGGoodsInventory: String, colorName: String): ColoredResponse = api.getIdByColor(idRGGoodsInventory, colorName)

    override suspend fun getColorsForItem(idRGGoodsInventory: String): ColorResponse = api.getColors(idRGGoodsInventory)
}