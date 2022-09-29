package com.progressterra.ipbandroidapi.api.suggestion

import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionResponse
import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionsFromLocationRequest
import com.progressterra.ipbandroidapi.api.suggestion.model.DadataSuggestionsRequest
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.exception.HandleException

internal interface SuggestionCloudDataSource {

    suspend fun getSuggestionsAddressFromDadata(dadataSuggestionsRequest: DadataSuggestionsRequest): DadataSuggestionResponse

    suspend fun getSuggestionsAddressFromLocation(dadataSuggestionsRequest: DadataSuggestionsFromLocationRequest): DadataSuggestionResponse


    class Base(
        private val service: SuggestionService, handleException: HandleException
    ) : AbstractCloudDataSource(handleException), SuggestionCloudDataSource {

        override suspend fun getSuggestionsAddressFromDadata(dadataSuggestionsRequest: DadataSuggestionsRequest): DadataSuggestionResponse =
            handle {
                service.getSuggestionsAddressFromDadata(dadataSuggestionsRequest)
            }

        override suspend fun getSuggestionsAddressFromLocation(dadataSuggestionsRequest: DadataSuggestionsFromLocationRequest): DadataSuggestionResponse =
            handle {
                service.getSuggestionsAddressFromLocation(dadataSuggestionsRequest)
            }
    }
}