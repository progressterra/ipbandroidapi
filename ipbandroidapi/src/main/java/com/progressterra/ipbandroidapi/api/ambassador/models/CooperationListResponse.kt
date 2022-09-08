package com.progressterra.ipbandroidapi.api.ambassador.models

import com.google.gson.annotations.SerializedName
import com.progressterra.ipbandroidapi.base.BaseResponse

data class CooperationListResponse(
    @SerializedName("dataList")
    val dataList: List<Data>?
): BaseResponse() {

    data class Data(
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
    )
}

