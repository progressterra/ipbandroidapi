package com.progressterra.ipbandroidapi.api.email

interface ConfirmEmailRepository {

    suspend fun confirmEmail(
        accessToken: String,
        email: String
    ): Result<Unit>
}