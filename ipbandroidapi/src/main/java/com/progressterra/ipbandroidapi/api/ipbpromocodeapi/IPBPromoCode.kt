package com.progressterra.ipbandroidapi.api.ipbpromocodeapi

import com.progressterra.ipbandroidapi.base.BaseResponse


/**
 * http://84.201.188.117:5025/docsapi/v1/index.html
 */
interface IPBPromoCode {

    interface PromoCodeUse {
        suspend fun setPromoCode(accessToken: String, promoCode: String): BaseResponse
    }

    companion object {
        fun PromoCodeUse(): PromoCodeUse = IPBPromoCodeImpl()
    }
}