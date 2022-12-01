package com.progressterra.ipbandroidapi.api.product

import com.progressterra.ipbandroidapi.api.product.models.ColorData
import com.progressterra.ipbandroidapi.api.product.models.ExtDataListRGGoodsInventory
import com.progressterra.ipbandroidapi.api.product.models.FiltersGoods
import com.progressterra.ipbandroidapi.api.product.models.IncomeDataForFilterAndSort
import com.progressterra.ipbandroidapi.api.product.models.StatusResult
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException

interface ProductRepository {

    suspend fun colorsForItem(id: String): Result<List<ColorData>?>

    suspend fun sizeTableForItem(id: String): Result<String?>

    suspend fun itemsFiltered(request: IncomeDataForFilterAndSort): Result<ExtDataListRGGoodsInventory?>

    suspend fun itemByColor(id: String, colorName: String): Result<String?>

    suspend fun filterData(id: String): Result<FiltersGoods?>

    class Base(
        handleException: HandleException,
        private val service: ProductService
    ) : AbstractRepository(handleException), ProductRepository {

        override suspend fun colorsForItem(id: String): Result<List<ColorData>?> = handle {
            val response = service.colorsForItem(id)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.dataList
        }

        override suspend fun sizeTableForItem(id: String): Result<String?> = handle {
            val response = service.sizeTableForItem(id)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.data
        }

        override suspend fun itemsFiltered(request: IncomeDataForFilterAndSort): Result<ExtDataListRGGoodsInventory?> =
            handle {
                val response = service.itemsFiltered(request)
                if (response.result?.status != StatusResult.ZERO)
                    throw BadRequestException()
                response.data
            }

        override suspend fun itemByColor(id: String, colorName: String): Result<String?> = handle {
            val response = service.itemByColor(id, colorName)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.data
        }

        override suspend fun filterData(id: String): Result<FiltersGoods?> = handle {
            val response = service.filterData(id)
            if (response.result?.status != StatusResult.ZERO)
                throw BadRequestException()
            response.data
        }
    }
}