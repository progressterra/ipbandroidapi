package com.progressterra.ipbandroidapi.remoteData.ipbPromoCodeApi

import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse


/**
 * http://84.201.184.154:5025/docsapi/v1/index.html
 */
interface IPBPromoCode {

    suspend fun setPromoCode(accessToken: String, promoCode: String): BaseResponse
}

fun IPBPromoCode(): IPBPromoCode = IPBPromoCodeImpl()