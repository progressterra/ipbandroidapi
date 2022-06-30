package com.progressterra.ipbandroidapi.api.sizetable

import com.progressterra.ipbandroidapi.api.filter.IPBFilterApi
import com.progressterra.ipbandroidapi.api.sizetable.models.SizeTableResponse
import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings

class IPBSizeTableImpl : IPBSizeTable {
    private val networkService: NetworkService = NetworkServiceImpl()
    private val api = networkService.createService(
        IPBSizeTableApi::class.java,
        NetworkSettings.IPB_PRODUCT_URL
    )

    override suspend fun getSizeTableForItem(idRGGoodsInventory: String): SizeTableResponse = api.getSizeTable(idRGGoodsInventory)

}