package com.progressterra.ipbandroidapi.api.ipbAmbassador.models.invite_members

import com.google.gson.annotations.SerializedName

data class InvitingMembersRequest(
    @SerializedName("accessTokenAmbassador")
    val accessTokenAmbassador: String,
    @SerializedName("listPhones")
    val listPhones: List<String>
)