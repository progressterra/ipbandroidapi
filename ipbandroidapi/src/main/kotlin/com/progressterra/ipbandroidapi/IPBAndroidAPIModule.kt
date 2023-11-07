package com.progressterra.ipbandroidapi

import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.AUTH_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.BALANCE_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.CART_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.CATALOG_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.DOCS_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.IMH_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.MEDIA_DATA_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.MESSENGER_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.PAYMENT_DATA_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.PAYMENT_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.PRODUCT_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.SCRM_URL
import com.progressterra.ipbandroidapi.api.URL.CHECKLIST_URL
import com.progressterra.ipbandroidapi.api.URL.COM_PLACE_URL
import com.progressterra.ipbandroidapi.api.URL.SCRM_LEGACY_URL
import com.progressterra.ipbandroidapi.api.URL.SUGGESTION_URL
import com.progressterra.ipbandroidapi.api.auth.AuthService
import com.progressterra.ipbandroidapi.api.balance.BalanceRepository
import com.progressterra.ipbandroidapi.api.balance.BalanceService
import com.progressterra.ipbandroidapi.api.cart.CartService
import com.progressterra.ipbandroidapi.api.catalog.CatalogRepository
import com.progressterra.ipbandroidapi.api.catalog.CatalogService
import com.progressterra.ipbandroidapi.api.checklist.ChecklistRepository
import com.progressterra.ipbandroidapi.api.checklist.ChecklistService
import com.progressterra.ipbandroidapi.api.complace.ComPlaceRepository
import com.progressterra.ipbandroidapi.api.complace.ComPlaceService
import com.progressterra.ipbandroidapi.api.documents.DocumentsRepository
import com.progressterra.ipbandroidapi.api.documents.DocumentsService
import com.progressterra.ipbandroidapi.api.iamhere.ImhService
import com.progressterra.ipbandroidapi.api.ipbmediadata.BaseIPBMediaDataRepository
import com.progressterra.ipbandroidapi.api.ipbmediadata.IPBMediaDataRepository
import com.progressterra.ipbandroidapi.api.ipbmediadata.IPBMediaDataService
import com.progressterra.ipbandroidapi.api.legacyscrm.BaseSCRMRepository
import com.progressterra.ipbandroidapi.api.legacyscrm.SCRMRepository
import com.progressterra.ipbandroidapi.api.legacyscrm.SCRMService
import com.progressterra.ipbandroidapi.api.messenger.MessengerService
import com.progressterra.ipbandroidapi.api.payment.PaymentRepository
import com.progressterra.ipbandroidapi.api.payment.PaymentService
import com.progressterra.ipbandroidapi.api.paymentdata.PaymentDataRepository
import com.progressterra.ipbandroidapi.api.paymentdata.PaymentDataService
import com.progressterra.ipbandroidapi.api.product.ProductRepository
import com.progressterra.ipbandroidapi.api.product.ProductService
import com.progressterra.ipbandroidapi.api.scrm.ScrmService
import com.progressterra.ipbandroidapi.api.suggestion.BaseSuggestionRepository
import com.progressterra.ipbandroidapi.api.suggestion.SuggestionRepository
import com.progressterra.ipbandroidapi.api.suggestion.SuggestionService
import com.progressterra.ipbandroidapi.core.HandleException
import com.progressterra.ipbandroidapi.core.NetworkService
import org.koin.dsl.module

@Suppress("unused")
val iPBAndroidAPIModule = module {

    single<HandleException> {
        HandleException.Base()
    }

    single<NetworkService> { NetworkService.Base() }

    single<SCRMRepository> {
        val networkService: NetworkService = get()
        BaseSCRMRepository(
            get(),
            networkService.createService(
                SCRMService::class.java, SCRM_LEGACY_URL
            )
        )
    }

    single<SuggestionRepository> {
        val networkService: NetworkService = get()
        BaseSuggestionRepository(
            get(),
            networkService.createService(
                SuggestionService::class.java, SUGGESTION_URL
            )
        )
    }

    single<IPBMediaDataRepository> {
        val networkService: NetworkService = get()
        BaseIPBMediaDataRepository(
            get(),
            networkService.createService(
                IPBMediaDataService::class.java, MEDIA_DATA_URL
            )
        )
    }

    single<ChecklistRepository> {
        val networkService: NetworkService = get()
        ChecklistRepository.Base(
            get(),
            networkService.createService(
                ChecklistService::class.java, CHECKLIST_URL
            )
        )
    }

    single<ProductRepository> {
        val networkService: NetworkService = get()
        ProductRepository.Base(
            get(),
            networkService.createService(
                ProductService::class.java, PRODUCT_URL
            )
        )
    }

    single<ComPlaceRepository> {
        val networkService: NetworkService = get()
        ComPlaceRepository.Base(
            get(),
            networkService.createService(
                ComPlaceService::class.java, COM_PLACE_URL
            )
        )
    }

    single<DocumentsRepository> {
        val networkService: NetworkService = get()
        DocumentsRepository.Base(
            get(),
            networkService.createService(
                DocumentsService::class.java, DOCS_URL
            )
        )
    }

    single<CatalogRepository> {
        val networkService: NetworkService = get()
        CatalogRepository.Base(
            get(),
            networkService.createService(
                CatalogService::class.java, CATALOG_URL
            )
        )
    }

    single {
        val networkService: NetworkService = get()
        networkService.createService(
            CartService::class.java, CART_URL
        )
    }

    single<BalanceRepository> {
        val networkService: NetworkService = get()
        BalanceRepository.Base(
            get(),
            networkService.createService(
                BalanceService::class.java, BALANCE_URL
            )
        )
    }

    single {
        val networkService: NetworkService = get()
        networkService.createService(
            MessengerService::class.java, MESSENGER_URL
        )
    }

    single<PaymentDataRepository> {
        val networkService: NetworkService = get()
        PaymentDataRepository.Base(
            get(),
            networkService.createService(
                PaymentDataService::class.java, PAYMENT_DATA_URL
            )
        )
    }

    single<PaymentRepository> {
        val networkService: NetworkService = get()
        PaymentRepository.Base(
            get(),
            networkService.createService(
                PaymentService::class.java, PAYMENT_URL
            )
        )
    }

    single {
        val networkService: NetworkService = get()
        networkService.createService(
            ScrmService::class.java, SCRM_URL
        )
    }

    single {
        val networkService: NetworkService = get()
        networkService.createService(
            AuthService::class.java, AUTH_URL
        )
    }

    single {
        val networkService: NetworkService = get()
        networkService.createService(
            ImhService::class.java, IMH_URL
        )
    }
}
