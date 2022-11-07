package com.progressterra.ipbandroidapi.api.ipbpromocode

import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException
import com.progressterra.ipbandroidapi.exception.HandleException

internal class BaseIPBPromoCodeRepository(
    handleException: HandleException,
    private val service: IPBPromoCodeService
) : AbstractRepository(handleException), IPBPromoCodeRepository {

    override suspend fun setPromoCode(accessToken: String, promoCode: String): Result<Unit> = handle {
        val response = service.setPromoCode(accessToken, promoCode)
        if (response.status != 0)
            throw BadRequestException()
    }
}