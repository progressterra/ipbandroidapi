package com.progressterra.ipbandroidapi.api.testimonials

import com.progressterra.ipbandroidapi.api.testimonials.model.TestimonialRequest
import com.progressterra.ipbandroidapi.base.BaseResponse
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path


/**
 * [Docs](http://84.201.188.117:5021/docsapi/v3/index.html)
 */
internal interface TestimonialsService {

    @POST("/api/v3/testimonials/{AccessToken}")
    suspend fun addTestimonial(
        @Path("AccessToken") accessToken: String,
        @Body testimonialRequest: TestimonialRequest
    ): BaseResponse
}