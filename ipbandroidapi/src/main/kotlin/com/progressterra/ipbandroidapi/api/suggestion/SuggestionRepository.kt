package com.progressterra.ipbandroidapi.api.suggestion

import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionsFromLocationRequest
import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.api.suggestion.model.Suggestion

interface SuggestionRepository {

    suspend fun getSuggestionsAddressFromDadata(dadataSuggestionsRequest: DadataSuggestionsRequest): Result<List<Suggestion>?>

    suspend fun getSuggestionsAddressFromLocation(dadataSuggestionsRequest: DadataSuggestionsFromLocationRequest): Result<List<Suggestion>?>
}