package com.progressterra.ipbandroidapi.api.suggestion.model

import com.google.gson.annotations.SerializedName

internal data class DadataSuggestionResponse(
    @SerializedName("suggestions") val suggestions: List<SuggestionRaw>?
)