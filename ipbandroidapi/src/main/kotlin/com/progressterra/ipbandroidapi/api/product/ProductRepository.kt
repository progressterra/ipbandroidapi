package com.progressterra.ipbandroidapi.api.product

import com.progressterra.ipbandroidapi.api.product.models.FilterAndSort
import com.progressterra.ipbandroidapi.api.product.models.ProductView
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException

interface ProductRepository {

    suspend fun productList(filterAndSort: FilterAndSort): Result<List<ProductView>?>

    suspend fun productByNomenclatureId(id: String): Result<List<ProductView>?>

    suspend fun productByGoodsInventoryId(id: String): Result<List<ProductView>?>


    class Base(
        handleException: HandleException, private val service: ProductService
    ) : AbstractRepository(handleException), ProductRepository {

        override suspend fun productList(filterAndSort: FilterAndSort): Result<List<ProductView>?> =
            handle {
                val response = service.productList(filterAndSort)
                if (response.result?.status != "success") {
                    throw BadRequestException()
                }
                response.dataList
            }

        override suspend fun productByNomenclatureId(id: String): Result<List<ProductView>?> =
            handle {
                val response = service.productByNomenclatureId(id)
                if (response.result?.status != "success") {
                    throw BadRequestException()
                }
                response.dataList
            }

        override suspend fun productByGoodsInventoryId(id: String): Result<List<ProductView>?> =
            handle {
                val response = service.productByGoodsInventoryId(id)
                if (response.result?.status != "success") {
                    throw BadRequestException()
                }
                response.dataList
            }
    }
}