package com.progressterra.ipbandroidapi.api.testimonials

import com.progressterra.ipbandroidapi.api.testimonials.model.TestimonialRequest
import com.progressterra.ipbandroidapi.base.BaseResponse
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface TestimonialsService {

    @POST("/api/v3/testimonials/{AccessToken}")
    suspend fun addTestimonial(
        @Path("AccessToken") accessToken: String,
        @Body testimonialRequest: TestimonialRequest
    ): BaseResponse
}