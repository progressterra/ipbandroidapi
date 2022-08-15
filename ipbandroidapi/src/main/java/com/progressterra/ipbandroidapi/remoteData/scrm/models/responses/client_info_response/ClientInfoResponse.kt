package com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.client_info_response

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.models.base.BaseResponse
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.clientinfo.ClientAdditionalInfoModel
import com.progressterra.ipbandroidapi.remoteData.scrm.models.responses.clientinfo.ClientInfoModel

data class ClientInfoResponse(
    /**
     * Данные клиента
     */
    @SerializedName("client")
    val client: ClientInfoModel? = null,

    /**
     * Дополнительные данные клиента
     */
    @SerializedName("clientAdditionalInfo")
    val clientAdditionalInfo: ClientAdditionalInfoModel? = null
) : BaseResponse()