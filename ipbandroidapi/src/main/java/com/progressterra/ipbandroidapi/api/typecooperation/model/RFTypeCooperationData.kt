package com.progressterra.ipbandroidapi.api.typecooperation.model

import com.progressterra.ipbandroidapi.api.ambassador.CooperationType
import com.progressterra.ipbandroidapi.utils.toCooperationType

data class RFTypeCooperationData(
    val idTypeCooperationRecomendates: String?,
    val idUnique: String?,
    val isEnabled: Boolean?,
    val name: String?,
    val textGeneral: String?,
    val textInstruction: String?,
    val textInvite: String?,
    val textReasonForTermination: String?,
    val textRecomendation: String?,
    val type: CooperationType
) {

    constructor(data: CooperationListResponse.Data?) : this(
        data?.idTypeCooperationRecomendates ?: "",
        data?.idUnique ?: "",
        data?.isEnabled ?: false,
        data?.name ?: "",
        data?.textGeneral ?: "",
        data?.textInstruction ?: "",
        data?.textInvite ?: "",
        data?.textReasonForTermination ?: "",
        data?.textRecomendation ?: "",
        data?.idUnique?.toCooperationType() ?: CooperationType.OTHER
    )
}