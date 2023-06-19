package com.progressterra.ipbandroidapi.api.cart

import com.progressterra.ipbandroidapi.api.cart.models.DHSaleHeadAsOrderViewModel
import com.progressterra.ipbandroidapi.api.cart.models.IncomeDataAddProductAsInstallmentPlan
import com.progressterra.ipbandroidapi.api.cart.models.IncomeDataAddProductFullPrice
import com.progressterra.ipbandroidapi.api.cart.models.IncomeDataComment
import com.progressterra.ipbandroidapi.api.cart.models.IncomeDataImplementBonuses
import com.progressterra.ipbandroidapi.api.cart.models.StatusResult
import com.progressterra.ipbandroidapi.core.AbstractRepository
import com.progressterra.ipbandroidapi.core.BadRequestException
import com.progressterra.ipbandroidapi.core.HandleException

interface CartRepository {

    suspend fun cart(
        accessToken: String
    ): Result<DHSaleHeadAsOrderViewModel?>

    suspend fun addToCart(
        accessToken: String, income: IncomeDataAddProductFullPrice
    ): Result<DHSaleHeadAsOrderViewModel?>

    suspend fun deleteFromCart(
        accessToken: String, income: IncomeDataAddProductFullPrice
    ): Result<DHSaleHeadAsOrderViewModel?>

    suspend fun addToCartInstallment(
        accessToken: String, income: IncomeDataAddProductAsInstallmentPlan
    ): Result<DHSaleHeadAsOrderViewModel?>

    suspend fun paymentInternal(accessToken: String): Result<DHSaleHeadAsOrderViewModel?>

    suspend fun addComment(
        accessToken: String, income: IncomeDataComment
    ): Result<DHSaleHeadAsOrderViewModel?>

    suspend fun useBonuses(
        accessToken: String, income: IncomeDataImplementBonuses
    ): Result<DHSaleHeadAsOrderViewModel?>

    suspend fun cancelBonuses(
        accessToken: String
    ): Result<DHSaleHeadAsOrderViewModel?>

    class Base(
        handleException: HandleException, private val service: CartService
    ) : CartRepository, AbstractRepository(handleException) {

        override suspend fun cart(accessToken: String): Result<DHSaleHeadAsOrderViewModel?> =
            handle {
                val response = service.cart(accessToken)
                if (response.result?.status != StatusResult.SUCCESS) {
                    throw BadRequestException()
                }
                response.data
            }

        override suspend fun addToCart(
            accessToken: String, income: IncomeDataAddProductFullPrice
        ): Result<DHSaleHeadAsOrderViewModel?> = handle {
            val response = service.addToCart(accessToken, income)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun deleteFromCart(
            accessToken: String, income: IncomeDataAddProductFullPrice
        ): Result<DHSaleHeadAsOrderViewModel?> = handle {
            val response = service.deleteFromCart(accessToken, income)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun addToCartInstallment(
            accessToken: String, income: IncomeDataAddProductAsInstallmentPlan
        ): Result<DHSaleHeadAsOrderViewModel?> = handle {
            val response = service.addToCartInstallment(accessToken, income)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun paymentInternal(accessToken: String): Result<DHSaleHeadAsOrderViewModel?> =
            handle {
                val response = service.paymentInternal(accessToken)
                if (response.result?.status != StatusResult.SUCCESS) {
                    throw BadRequestException()
                }
                response.data
            }

        override suspend fun addComment(
            accessToken: String, income: IncomeDataComment
        ): Result<DHSaleHeadAsOrderViewModel?> = handle {
            val response = service.addComment(accessToken, income)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun useBonuses(
            accessToken: String, income: IncomeDataImplementBonuses
        ): Result<DHSaleHeadAsOrderViewModel?> = handle {
            val response = service.useBonuses(accessToken, income)
            if (response.result?.status != StatusResult.SUCCESS) {
                throw BadRequestException()
            }
            response.data
        }

        override suspend fun cancelBonuses(accessToken: String): Result<DHSaleHeadAsOrderViewModel?> =
            handle {
                val response = service.cancelBonuses(accessToken)
                if (response.result?.status != StatusResult.SUCCESS) {
                    throw BadRequestException()
                }
                response.data
            }
    }
}