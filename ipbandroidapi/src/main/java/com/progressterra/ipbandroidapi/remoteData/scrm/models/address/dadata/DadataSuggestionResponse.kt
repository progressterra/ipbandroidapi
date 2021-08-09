package com.progressterra.ipbandroidapi.remoteData.scrm.models.address.dadata


import com.google.gson.annotations.SerializedName

data class DadataSuggestionResponse(
    @SerializedName("suggestions")
    val suggestions: List<Suggestion>? = null
)