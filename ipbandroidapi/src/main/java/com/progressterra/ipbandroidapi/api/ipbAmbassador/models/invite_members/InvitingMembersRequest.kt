package com.progressterra.ipbandroidapi.api.ipbAmbassador.models.invite_members

import com.google.gson.annotations.SerializedName

data class InvitingMembersRequest(
    @SerializedName("accessTokenAmbassador")
    var accessTokenAmbassador: String,
    @SerializedName("listPhones")
    var listPhones: List<String>
)