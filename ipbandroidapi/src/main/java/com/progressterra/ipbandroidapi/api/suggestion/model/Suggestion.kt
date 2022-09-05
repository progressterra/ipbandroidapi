package com.progressterra.ipbandroidapi.api.suggestion.model

import com.google.gson.annotations.SerializedName

/**
 * API model
 */
data class Suggestion(
    @SerializedName("data")
    val suggestionExtended: SuggestionExtended? = null,
    @SerializedName("unrestricted_value")
    val unrestrictedValue: String? = null,
    @SerializedName("value")
    val previewOfSuggestion: String? = null
) {

    fun toSuggestionInfo(): SuggestionInfo = SuggestionInfo(
        suggestionExtended?.toSuggestionExtendedInfo() ?: SuggestionExtendedInfo(),
        unrestrictedValue ?: "",
        previewOfSuggestion ?: ""
    )
}