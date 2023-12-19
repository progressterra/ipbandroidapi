package com.progressterra.ipbandroidapi

import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.AUTH_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.BALANCE_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.CART_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.CATALOG_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.CHECKLIST_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.DOCS_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.IMH_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.MEDIA_DATA_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.MESSENGER_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.PAYMENT_DATA_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.PAYMENT_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.PRODUCT_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.SCRM_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.SUGGESTION_URL
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.WORK_WATCH_URL
import com.progressterra.ipbandroidapi.api.auth.AuthService
import com.progressterra.ipbandroidapi.api.balance.BalanceRepository
import com.progressterra.ipbandroidapi.api.balance.BalanceService
import com.progressterra.ipbandroidapi.api.cart.CartService
import com.progressterra.ipbandroidapi.api.catalog.CatalogRepository
import com.progressterra.ipbandroidapi.api.catalog.CatalogService
import com.progressterra.ipbandroidapi.api.checklist.ChecklistService
import com.progressterra.ipbandroidapi.api.documents.DocumentsRepository
import com.progressterra.ipbandroidapi.api.documents.DocumentsService
import com.progressterra.ipbandroidapi.api.iamhere.ImhService
import com.progressterra.ipbandroidapi.api.ipbmediadata.IPBMediaDataService
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
import com.progressterra.ipbandroidapi.api.workwatch.WorkWatchService
import com.progressterra.ipbandroidapi.core.HandleException
import com.progressterra.ipbandroidapi.core.NetworkService
import org.koin.dsl.module

@Suppress("unused")
val iPBAndroidAPIModule = module {

    single<HandleException> {
        HandleException.Base()
    }

    single<NetworkService> { NetworkService.Base() }

    single<SuggestionRepository> {
        val networkService: NetworkService = get()
        BaseSuggestionRepository(
            get(),
            networkService.createService(
                apiClass = SuggestionService::class.java,
                urls = SUGGESTION_URL
            )
        )
    }

    single<IPBMediaDataService> {
        val networkService: NetworkService = get()
        networkService.createService(
            apiClass = IPBMediaDataService::class.java,
            urls = MEDIA_DATA_URL
        )
    }

    single<ChecklistService> {
        val networkService: NetworkService = get()
        networkService.createService(
            apiClass = ChecklistService::class.java,
            urls = CHECKLIST_URL
        )
    }

    single<ProductRepository> {
        val networkService: NetworkService = get()
        ProductRepository.Base(
            get(),
            networkService.createService(
                apiClass = ProductService::class.java,
                urls = PRODUCT_URL
            )
        )
    }

    single<DocumentsRepository> {
        val networkService: NetworkService = get()
        DocumentsRepository.Base(
            get(),
            networkService.createService(
                apiClass = DocumentsService::class.java,
                urls = DOCS_URL
            )
        )
    }

    single<CatalogRepository> {
        val networkService: NetworkService = get()
        CatalogRepository.Base(
            get(),
            networkService.createService(
                apiClass = CatalogService::class.java,
                urls = CATALOG_URL
            )
        )
    }

    single {
        val networkService: NetworkService = get()
        networkService.createService(
            apiClass = CartService::class.java,
            urls = CART_URL
        )
    }

    single<BalanceRepository> {
        val networkService: NetworkService = get()
        BalanceRepository.Base(
            get(),
            networkService.createService(
                apiClass = BalanceService::class.java,
                urls = BALANCE_URL
            )
        )
    }

    single {
        val networkService: NetworkService = get()
        networkService.createService(
            apiClass = MessengerService::class.java,
            urls = MESSENGER_URL
        )
    }

    single<PaymentDataRepository> {
        val networkService: NetworkService = get()
        PaymentDataRepository.Base(
            get(),
            networkService.createService(
                apiClass = PaymentDataService::class.java,
                urls = PAYMENT_DATA_URL
            )
        )
    }

    single<PaymentRepository> {
        val networkService: NetworkService = get()
        PaymentRepository.Base(
            get(),
            networkService.createService(
                apiClass = PaymentService::class.java,
                urls = PAYMENT_URL
            )
        )
    }

    single {
        val networkService: NetworkService = get()
        networkService.createService(
            apiClass = ScrmService::class.java,
            urls = SCRM_URL
        )
    }

    single {
        val networkService: NetworkService = get()
        networkService.createService(
            apiClass = AuthService::class.java,
            urls = AUTH_URL
        )
    }

    single {
        val networkService: NetworkService = get()
        networkService.createService(
            apiClass = ImhService::class.java,
            urls = IMH_URL
        )
    }

    single {
        val networkService: NetworkService = get()
        networkService.createService(
            apiClass = WorkWatchService::class.java,
            urls = WORK_WATCH_URL
        )
    }
}
