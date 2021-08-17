package com.progressterra.ipbandroidapi.remoteData.unknown

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.ipbAambassador.models.client_info.UpdateUserInfoRequest
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.client_info_response.ClientInfoResponse

internal class UnknownApiImpl : Unknown {
    private val apbNetworkService: NetworkService = NetworkServiceImpl()
    private val ipbApi =
        apbNetworkService.createService(
            UnknownApi::class.java,
            NetworkSettings.AMBASSADOR_URL
        )

    override suspend fun getClientInfo(accessToken: String): ClientInfoResponse {
        return ipbApi.getClientInfo(accessToken)
    }

    override suspend fun updateClientInfo(
        accessToken: String,
        name: String,
        soname: String,
        patronymic: String
    ): ClientInfoResponse {
        return ipbApi.updatePersonalInfo(
            accessToken,
            UpdateUserInfoRequest(soname, name, patronymic)
        )
    }
}

