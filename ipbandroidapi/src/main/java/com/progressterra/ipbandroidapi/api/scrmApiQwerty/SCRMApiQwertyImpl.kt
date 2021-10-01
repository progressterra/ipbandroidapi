package com.progressterra.ipbandroidapi.api.scrmApiQwerty

import com.progressterra.ipbandroidapi.interfaces.internal.NetworkService
import com.progressterra.ipbandroidapi.remoteData.NetworkServiceImpl
import com.progressterra.ipbandroidapi.remoteData.NetworkSettings
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import com.progressterra.ipbandroidapi.api.scrmApiQwerty.models.requests.RemoveClientRequest

internal class SCRMApiQwertyImpl : SCRMApiQwerty.ClientManagement {

    private val networkService: NetworkService = NetworkServiceImpl()
    private val api = networkService.createService(
        SCRMApiQwertyApi::class.java,
        NetworkSettings.SCRMAPIQWERTY_ROOT_URL
    )

    /**
     *  ClientManagement
     */
    override suspend fun removeClientBegin(accessToken: String): BaseResponse {
        return api.removeClientBegin(accessToken)
    }

    override suspend fun removeClientEnd(
        accessToken: String,
        verificationCode: String
    ): BaseResponse {
        return api.removeClientEnd(
            accessToken,
            RemoveClientRequest(accessToken = accessToken, verifiedCode = verificationCode)
        )
    }
}