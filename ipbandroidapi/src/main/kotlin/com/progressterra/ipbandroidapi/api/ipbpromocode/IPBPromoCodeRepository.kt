package com.progressterra.ipbandroidapi.api.ipbpromocode

interface IPBPromoCodeRepository {

    suspend fun setPromoCode(accessToken: String, promoCode: String): Result<Unit>
}