package com.progressterra.ipbandroidapi.api.ipbambassador.models.cooperation_type

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

data class CooperationListResponse(
    @SerializedName("dataList")
    val dataList: List<RFTypeCooperation>?
): BaseResponse()

data class RFTypeCooperation(
    @SerializedName("idTypeCooperationRecomendates")
    val idTypeCooperationRecomendates: String?,
    @SerializedName("idUnique")
    val idUnique: String?,
    @SerializedName("isEnabled")
    val isEnabled: Boolean?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("textGeneral")
    val textGeneral: String?,
    @SerializedName("textInstruction")
    val textInstruction: String?,
    @SerializedName("textInvite")
    val textInvite: String?,
    @SerializedName("textReasonForTermination")
    val textReasonForTermination: String?,
    @SerializedName("textRecomendation")
    val textRecomendation: String?
) {
    val type: CooperationType
    get() = when (idUnique) {
        "abcac371-62e1-4b4c-a37c-505f4adc6bd2" -> CooperationType.SELF_EMPLOYER
        "c0103bed-bfba-4979-9a66-3f6cc70bcb05" -> CooperationType.DIRECT_INCOME
        else -> CooperationType.OTHER
    }
}

enum class CooperationType {
    SELF_EMPLOYER,
    DIRECT_INCOME,
    OTHER
}

