package com.progressterra.ipbandroidapi.api.suggestion.model

data class SuggestionData(
    val suggestionExtendedInfo: SuggestionExtendedData,
    val unrestrictedValue: String,
    val previewOfSuggestion: String
) {

    internal constructor(data: SuggestionRaw?) : this(
        SuggestionExtendedData(data?.suggestionExtended),
        data?.unrestrictedValue ?: "",
        data?.previewOfSuggestion ?: ""
    )
}
