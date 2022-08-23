package com.progressterra.ipbandroidapi.api.testimonials

import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

interface TestimonialsRepository {

    suspend fun addTestimonial(accessToken: String, testimonialRequest: TestimonialRequest): BaseResponse

    class Base(
        private val testimonialsCloudDataSource: TestimonialsCloudDataSource
    ) : TestimonialsRepository {

        override suspend fun addTestimonial(accessToken: String, testimonialRequest: TestimonialRequest): BaseResponse =
            testimonialsCloudDataSource.addTestimonial(accessToken, testimonialRequest)
    }
}