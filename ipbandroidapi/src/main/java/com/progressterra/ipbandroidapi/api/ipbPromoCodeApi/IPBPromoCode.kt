package com.progressterra.ipbandroidapi.api.ipbPromoCodeApi

import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse


/**
 * http://84.201.184.154:5025/docsapi/v1/index.html
 */
interface IPBPromoCode {

    interface PromoCodeUse {
        suspend fun setPromoCode(accessToken: String, promoCode: String): BaseResponse
    }

    companion object {
        fun PromoCodeUse(): PromoCodeUse = IPBPromoCodeImpl()
    }
}