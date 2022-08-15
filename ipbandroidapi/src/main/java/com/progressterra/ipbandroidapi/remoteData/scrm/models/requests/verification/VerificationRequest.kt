package com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.verification

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remoteData.scrm.models.requests.ChannelName

internal class VerificationRequest(
    /**
     * Данные канала верификации
     */
    @SerializedName("ChannelValue")
    var channelValue: String
) {

    /**
     * Токен
     */
    @SerializedName("TokenIncome")
    var tokenIncome: String = ""

    /**
     * Канал верификации
     */
    @SerializedName("ChannelName")
    var channelName: ChannelName = ChannelName.PHONE

    /**
     * Код подтверждения
     */
    @SerializedName("ConfirmCode")
    var confirmCode: String = ""

    constructor(channelValue: String, confirmCode: String) : this(channelValue) {
        this.confirmCode = confirmCode
    }
}