package com.progressterra.ipbandroidapi.api.suggestion.model

import com.google.gson.annotations.SerializedName

internal data class SuggestionRaw(
    @SerializedName("data")
    val suggestionExtended: SuggestionExtendedRaw? = null,
    @SerializedName("unrestricted_value")
    val unrestrictedValue: String? = null,
    @SerializedName("value")
    val previewOfSuggestion: String? = null
)