package com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi

import com.progressterra.ipbandroidapi.remoteData.iECommersCoreApi.models.ProductPageResponse


/**
 *  http://84.201.184.154:6023/docsapi/v1/index.html
 */
interface IECommersCore {

    interface Product {

        /**
         * @param idsList - список уникальный идентификаторов RGGoodsInventory товары которых хотим получить
         */
        suspend fun getRGGoodsInventoryExtListByIds(
            accessToken: String,
            idsList: List<String>
        ): ProductPageResponse
    }

    companion object {
        fun Product(): Product = IECommersCoreImpl()
    }
}