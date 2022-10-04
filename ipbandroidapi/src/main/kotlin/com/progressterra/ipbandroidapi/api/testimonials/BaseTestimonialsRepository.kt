package com.progressterra.ipbandroidapi.api.testimonials

import com.progressterra.ipbandroidapi.api.testimonials.model.TestimonialRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

internal class BaseTestimonialsRepository(
    private val testimonialsCloudDataSource: TestimonialsCloudDataSource
) : TestimonialsRepository, AbstractRepository() {

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
        val response = testimonialsCloudDataSource.addTestimonial(
            accessToken, TestimonialRequest(
                nickNameClient, message, idEmployee, idOrder, idShop, rating, typeMessage
            )
        )
        if (response.result?.status != 0)
            throw BadRequestException()
    }
}