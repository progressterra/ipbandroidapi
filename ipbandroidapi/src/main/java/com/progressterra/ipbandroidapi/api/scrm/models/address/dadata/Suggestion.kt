package com.progressterra.ipbandroidapi.api.scrm.models.address.dadata


import com.google.gson.annotations.SerializedName

data class Suggestion(
    @SerializedName("data")
    val suggestionExtendedInfo: SuggestionExtendedInfo? = null,
    @SerializedName("unrestricted_value")
    val unrestrictedValue: String? = null,
    @SerializedName("value")
    val previewOfSuggestion: String? = null
)