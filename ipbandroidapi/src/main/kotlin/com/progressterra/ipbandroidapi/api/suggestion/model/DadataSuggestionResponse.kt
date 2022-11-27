package com.progressterra.ipbandroidapi.api.suggestion.model


import com.google.gson.annotations.SerializedName

data class DadataSuggestionResponse(
    @SerializedName("suggestions")
    val suggestions: List<Suggestion>? = null
)