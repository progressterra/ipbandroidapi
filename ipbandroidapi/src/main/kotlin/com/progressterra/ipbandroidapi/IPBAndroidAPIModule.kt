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
import com.progressterra.ipbandroidapi.IpbAndroidApiSettings.WORK_WATCH_URL
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

    single<SCRMRepository> {
        val networkService: NetworkService = get()
        var counter = 0
        BaseSCRMRepository(
            get(),
            networkService.createService(
                apiClass = SCRMService::class.java,
                url = { SCRM_LEGACY_URL.getOrNull(counter) },
                invalidateUrl = { counter++ }
            )
        )
    }

    single<SuggestionRepository> {
        val networkService: NetworkService = get()
        var counter = 0
        BaseSuggestionRepository(
            get(),
            networkService.createService(
                apiClass = SuggestionService::class.java,
                url = { SUGGESTION_URL.getOrNull(counter) },
                invalidateUrl = { counter++ }
            )
        )
    }

    single<IPBMediaDataRepository> {
        val networkService: NetworkService = get()
        var counter = 0
        BaseIPBMediaDataRepository(
            get(),
            networkService.createService(
                apiClass = IPBMediaDataService::class.java,
                url = { MEDIA_DATA_URL.getOrNull(counter) },
                invalidateUrl = { counter++ }
            )
        )
    }

    single<ChecklistRepository> {
        val networkService: NetworkService = get()
        var counter = 0
        ChecklistRepository.Base(
            get(),
            networkService.createService(
                apiClass = ChecklistService::class.java,
                url = { CHECKLIST_URL.getOrNull(counter) },
                invalidateUrl = { counter++ }
            )
        )
    }

    single<ProductRepository> {
        val networkService: NetworkService = get()
        var counter = 0
        ProductRepository.Base(
            get(),
            networkService.createService(
                apiClass = ProductService::class.java,
                url = { PRODUCT_URL.getOrNull(counter) },
                invalidateUrl = { counter++ }
            )
        )
    }

    single<ComPlaceRepository> {
        val networkService: NetworkService = get()
        var counter = 0
        ComPlaceRepository.Base(
            get(),
            networkService.createService(
                apiClass = ComPlaceService::class.java,
                url = { COM_PLACE_URL.getOrNull(counter) },
                invalidateUrl = { counter++ }
            )
        )
    }

    single<DocumentsRepository> {
        val networkService: NetworkService = get()
        var counter = 0
        DocumentsRepository            .Base(
            get(),
            networkService.createService(
                apiClass = DocumentsService::class.java,
                url = { DOCS_URL.getOrNull(counter) },
                invalidateUrl = { counter++ }
            )
        )
    }

    single<CatalogRepository> {
        val networkService: NetworkService = get()
        var counter = 0
        CatalogRepository.Base(
            get(),
            networkService.createService(
                apiClass = CatalogService::class.java,
                url = { CATALOG_URL.getOrNull(counter) },
                invalidateUrl = { counter++ }
            )
        )
    }

    single {
        val networkService: NetworkService = get()
        var counter = 0
        networkService.createService(
            apiClass = CartService::class.java,
            url = { CART_URL.getOrNull(counter) },
            invalidateUrl = { counter++ }
        )
    }

    single<BalanceRepository> {
        val networkService: NetworkService = get()
        var counter = 0
        BalanceRepository.Base(
            get(),
            networkService.createService(
                apiClass = BalanceService::class.java,
                url = { BALANCE_URL.getOrNull(counter) },
                invalidateUrl = { counter++ }
            )
        )
    }

    single {
        val networkService: NetworkService = get()
        var counter = 0
        networkService.createService(
            apiClass = MessengerService::class.java,
            url = { MESSENGER_URL.getOrNull(counter) },
            invalidateUrl = { counter++ }
        )
    }

    single<PaymentDataRepository> {
        val networkService: NetworkService = get()
        var counter = 0
        PaymentDataRepository.Base(
            get(),
            networkService.createService(
                apiClass = PaymentDataService::class.java,
                url = { PAYMENT_DATA_URL.getOrNull(counter) },
                invalidateUrl = { counter++ }
            )
        )
    }

    single<PaymentRepository> {
        val networkService: NetworkService = get()
        var counter = 0
        PaymentRepository.Base(
            get(),
            networkService.createService(
                apiClass = PaymentService::class.java,
                url = { PAYMENT_URL.getOrNull(counter) },
                invalidateUrl = { counter++ }
            )
        )
    }

    single {
        val networkService: NetworkService = get()
        var counter = 0
        networkService.createService(
            apiClass = ScrmService::class.java,
            url = { SCRM_URL.getOrNull(counter) },
            invalidateUrl = { counter++ }
        )
    }

    single {
        val networkService: NetworkService = get()
        var counter = 0
        networkService.createService(
            apiClass = AuthService::class.java,
            url = { AUTH_URL.getOrNull(counter) },
            invalidateUrl = { counter++ }
        )
    }

    single {
        val networkService: NetworkService = get()
        var counter = 0
        networkService.createService(
            apiClass = ImhService::class.java,
            url = { IMH_URL.getOrNull(counter) },
            invalidateUrl = { counter++ }
        )
    }

    single {
        val networkService: NetworkService = get()
        var counter = 0
        networkService.createService(
            apiClass = WorkWatchService::class.java,
            url = { WORK_WATCH_URL.getOrNull(counter) },
            invalidateUrl = { counter++ }
        )
    }
}
