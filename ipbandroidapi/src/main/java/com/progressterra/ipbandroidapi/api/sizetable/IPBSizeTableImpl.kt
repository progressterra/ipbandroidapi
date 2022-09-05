package com.progressterra.ipbandroidapi.api.sizetable

import com.progressterra.ipbandroidapi.api.URL
import com.progressterra.ipbandroidapi.api.sizetable.models.SizeTableResponse
import com.progressterra.ipbandroidapi.core.NetworkService

class IPBSizeTableImpl : IPBSizeTable {
    private val networkService: NetworkService = NetworkService.Base()
    private val api = networkService.createService(
        IPBSizeTableApi::class.java,
        URL.IPB_PRODUCT_URL
    )

    override suspend fun getSizeTableForItem(idRGGoodsInventory: String): SizeTableResponse = api.getSizeTable(idRGGoodsInventory)

}