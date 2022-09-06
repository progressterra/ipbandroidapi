package com.progressterra.ipbandroidapi.api.testimonials

import com.progressterra.ipbandroidapi.api.testimonials.model.TestimonialRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.exception.BadRequestException

interface TestimonialsRepository {

    suspend fun addTestimonial(
        accessToken: String,
        testimonialRequest: TestimonialRequest
    ): Result<Unit>

    class Base(
        private val testimonialsCloudDataSource: TestimonialsCloudDataSource
    ) : TestimonialsRepository, AbstractRepository() {

        override suspend fun addTestimonial(
            accessToken: String,
            testimonialRequest: TestimonialRequest
        ): Result<Unit> = handle {
            val response = testimonialsCloudDataSource.addTestimonial(accessToken, testimonialRequest)
            if (response.result?.status != 0)
                throw BadRequestException()
        }
    }
}