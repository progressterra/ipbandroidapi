package com.progressterra.ipbandroidapi.remoteData.unknown

import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.client_info_response.ClientInfoResponse

interface Unknown {
    suspend fun getClientInfo(accessToken: String): ClientInfoResponse
}

fun Unknown(): Unknown = UnknownApiImpl()