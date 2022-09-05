package com.progressterra.ipbandroidapi.api.testimonials

import com.progressterra.ipbandroidapi.api.testimonials.model.TestimonialRequest
import com.progressterra.ipbandroidapi.core.AbstractRepository

interface TestimonialsRepository {

    suspend fun addTestimonial(
        accessToken: String,
        testimonialRequest: TestimonialRequest
    ): Result<Boolean>

    class Base(
        private val testimonialsCloudDataSource: TestimonialsCloudDataSource
    ) : TestimonialsRepository, AbstractRepository() {

        override suspend fun addTestimonial(
            accessToken: String,
            testimonialRequest: TestimonialRequest
        ): Result<Boolean> = handle {
            testimonialsCloudDataSource.addTestimonial(accessToken, testimonialRequest)
        }.map { it.result?.status == 0 }
    }
}