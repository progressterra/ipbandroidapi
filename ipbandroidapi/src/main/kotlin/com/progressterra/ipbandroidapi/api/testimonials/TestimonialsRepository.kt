package com.progressterra.ipbandroidapi.api.testimonials

interface TestimonialsRepository {

    suspend fun addTestimonial(
        accessToken: String,
        nickNameClient: String,
        message: String,
        idEmployee: String,
        idOrder: String,
        idShop: String,
        rating: Int,
        typeMessage: String
    ): Result<Unit>
}