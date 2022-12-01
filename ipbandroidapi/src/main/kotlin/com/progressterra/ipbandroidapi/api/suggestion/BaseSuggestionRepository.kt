package com.progressterra.ipbandroidapi.api.suggestion

import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionsFromLocationRequest
import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.api.suggestion.model.Suggestion
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.HandleException

internal class BaseSuggestionRepository(
    handleException: HandleException,
    private val service: SuggestionService
) : AbstractRepository(handleException), SuggestionRepository {

    override suspend fun getSuggestionsAddressFromDadata(
        dadataSuggestionsRequest: DadataSuggestionsRequest
    ): Result<List<Suggestion>?> = handle {
        service.getSuggestionsAddressFromDadata(dadataSuggestionsRequest).suggestions
    }

    override suspend fun getSuggestionsAddressFromLocation(
        dadataSuggestionsRequest: DadataSuggestionsFromLocationRequest
    ): Result<List<Suggestion>?> = handle {
        service.getSuggestionsAddressFromLocation(dadataSuggestionsRequest).suggestions
    }
}