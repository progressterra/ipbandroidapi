package com.progressterra.ipbandroidapi.api.iecommerce.cart

import com.progressterra.ipbandroidapi.core.AbstractRepository

internal class BaseCartRepository(
    private val cloudDataSource: CartCloudDataSource
) : AbstractRepository(), CartRepository {


}