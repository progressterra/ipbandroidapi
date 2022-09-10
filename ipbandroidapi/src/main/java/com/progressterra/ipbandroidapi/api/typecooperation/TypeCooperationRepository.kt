package com.progressterra.ipbandroidapi.api.typecooperation

import com.progressterra.ipbandroidapi.api.typecooperation.model.RFTypeCooperationData

interface TypeCooperationRepository {

    suspend fun getCooperationTypeList(accessToken: String): Result<List<RFTypeCooperationData>>
}