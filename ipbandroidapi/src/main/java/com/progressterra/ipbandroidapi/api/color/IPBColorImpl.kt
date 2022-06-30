package com.progressterra.ipbandroidapi.api.color

import com.progressterra.ipbandroidapi.api.color.models.ColorResponse
import com.progressterra.ipbandroidapi.api.color.models.ColoredResponse
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings

class IPBColorImpl : IPBColor {
    private val networkService: NetworkService = NetworkServiceImpl()
    private val api = networkService.createService(
        IPBColorApi::class.java,
        NetworkSettings.IPB_PRODUCT_URL
    )

    override suspend fun getColoredItem(idRGGoodsInventory: String, colorName: String): ColoredResponse = api.getIdByColor(idRGGoodsInventory, colorName)

    override suspend fun getColorsForItem(idRGGoodsInventory: String): ColorResponse = api.getColors(idRGGoodsInventory)
}