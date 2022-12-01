package com.progressterra.ipbandroidapi.api.testimonials

import com.progressterra.ipbandroidapi.api.testimonials.model.TestimonialRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException

internal class BaseTestimonialsRepository(
    handleException: HandleException,
    private val service: TestimonialsService
) : TestimonialsRepository, AbstractRepository(handleException) {

    override suspend fun addTestimonial(
        accessToken: String,
        nickNameClient: String,
        message: String,
        idEmployee: String,
        idOrder: String,
        idShop: String,
        rating: Int,
        typeMessage: String
    ): Result<Unit> = handle {
        val response = service.addTestimonial(
            accessToken, TestimonialRequest(
                nickNameClient, message, idEmployee, idOrder, idShop, rating, typeMessage
            )
        )
        if (response.result?.status != 0)
            throw BadRequestException()
    }
}