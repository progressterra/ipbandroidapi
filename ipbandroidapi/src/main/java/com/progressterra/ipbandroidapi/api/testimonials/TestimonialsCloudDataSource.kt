package com.progressterra.ipbandroidapi.api.testimonials

import com.progressterra.ipbandroidapi.api.testimonials.model.TestimonialRequest
import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.core.AbstractCloudDataSource
import com.progressterra.ipbandroidapi.base.BaseResponse

interface TestimonialsCloudDataSource {

    suspend fun addTestimonial(accessToken: String, testimonialRequest: TestimonialRequest): BaseResponse

    class Base(
        private val service: TestimonialsService,
        handleException: HandleException
    ) : TestimonialsCloudDataSource, AbstractCloudDataSource(handleException) {

        override suspend fun addTestimonial(accessToken: String, testimonialRequest: TestimonialRequest): BaseResponse = handle {
            service.addTestimonial(accessToken, testimonialRequest)
        }
    }
}