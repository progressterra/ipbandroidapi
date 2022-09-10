package com.progressterra.ipbandroidapi.api.ipbpromocode

import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseIPBPromoCodeRepository(
    private val cloudDataSource: IPBPromoCodeCloudDataSource
) : AbstractRepository(), IPBPromoCodeRepository {

    override suspend fun setPromoCode(accessToken: String, promoCode: String): Result<Unit> = handle {
        val response = cloudDataSource.setPromoCode(accessToken, promoCode)
        if (response.status != 0)
            throw BadRequestException()
    }
}