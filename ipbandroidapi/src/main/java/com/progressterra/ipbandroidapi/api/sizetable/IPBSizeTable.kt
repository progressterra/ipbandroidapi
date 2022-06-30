package com.progressterra.ipbandroidapi.api.sizetable

import com.progressterra.ipbandroidapi.api.sizetable.models.SizeTableResponse

interface IPBSizeTable {

    suspend fun getSizeTableForItem(idRGGoodsInventory: String): SizeTableResponse

    companion object {
        fun SizeTable(): IPBSizeTable = IPBSizeTableImpl()
    }
}