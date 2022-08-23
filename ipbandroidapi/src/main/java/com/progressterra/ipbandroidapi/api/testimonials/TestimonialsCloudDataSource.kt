package com.progressterra.ipbandroidapi.api.testimonials

import com.progressterra.ipbandroidapi.exception.HandleException
import com.progressterra.ipbandroidapi.remotedata.CloudDataSource
import com.progressterra.ipbandroidapi.remotedata.models.base.BaseResponse

interface TestimonialsCloudDataSource {

    suspend fun addTestimonial(accessToken: String, testimonialRequest: TestimonialRequest): BaseResponse

    class Base(
        private val service: TestimonialsService,
        handleException: HandleException
    ) : TestimonialsCloudDataSource, CloudDataSource.Abstract(handleException) {

        override suspend fun addTestimonial(accessToken: String, testimonialRequest: TestimonialRequest): BaseResponse = handle {
            service.addTestimonial(accessToken, testimonialRequest)
        }
    }
}