package com.progressterra.ipbandroidapi.di

import com.progressterra.ipbandroidapi.api.URL.ADDRESS_URL
import com.progressterra.ipbandroidapi.api.URL.AMBASSADOR_INVITE_URL
import com.progressterra.ipbandroidapi.api.URL.AMBASSADOR_URL
import com.progressterra.ipbandroidapi.api.URL.CHECKLIST_URL
import com.progressterra.ipbandroidapi.api.URL.CITIES_URL
import com.progressterra.ipbandroidapi.api.URL.CITY_URL
import com.progressterra.ipbandroidapi.api.URL.COLLABORATION_URL
import com.progressterra.ipbandroidapi.api.URL.COM_PLACE_URL
import com.progressterra.ipbandroidapi.api.URL.CONFIRM_EMAIL_URL
import com.progressterra.ipbandroidapi.api.URL.IPB_DELIVERY_URL
import com.progressterra.ipbandroidapi.api.URL.IPB_FAV_PROMO_REC_URL
import com.progressterra.ipbandroidapi.api.URL.IPB_MEDIA_DATA_URL
import com.progressterra.ipbandroidapi.api.URL.IPB_PROMO_CODE_URL
import com.progressterra.ipbandroidapi.api.URL.I_BONUS_URL
import com.progressterra.ipbandroidapi.api.URL.I_ECOMMERCE_URL
import com.progressterra.ipbandroidapi.api.URL.I_MESSENGER_URL
import com.progressterra.ipbandroidapi.api.URL.MESSAGES_URL
import com.progressterra.ipbandroidapi.api.URL.MONEY_OUT_URL
import com.progressterra.ipbandroidapi.api.URL.PRODUCT_URL
import com.progressterra.ipbandroidapi.api.URL.PURCHASES_URL
import com.progressterra.ipbandroidapi.api.URL.SBER_URL
import com.progressterra.ipbandroidapi.api.URL.SCRM_URL
import com.progressterra.ipbandroidapi.api.URL.SUGGESTION_URL
import com.progressterra.ipbandroidapi.api.URL.TESTIMONIALS_URL
import com.progressterra.ipbandroidapi.api.URL.TYPE_COOPERATION_URL
import com.progressterra.ipbandroidapi.api.address.AddressRepository
import com.progressterra.ipbandroidapi.api.address.AddressService
import com.progressterra.ipbandroidapi.api.address.BaseAddressRepository
import com.progressterra.ipbandroidapi.api.ambassador.AmbassadorRepository
import com.progressterra.ipbandroidapi.api.ambassador.AmbassadorService
import com.progressterra.ipbandroidapi.api.ambassador.BaseAmbassadorRepository
import com.progressterra.ipbandroidapi.api.ambassadorinvite.AmbassadorInviteRepository
import com.progressterra.ipbandroidapi.api.ambassadorinvite.AmbassadorInviteService
import com.progressterra.ipbandroidapi.api.ambassadorinvite.BaseAmbassadorInviteRepository
import com.progressterra.ipbandroidapi.api.checklist.ChecklistRepository
import com.progressterra.ipbandroidapi.api.checklist.ChecklistService
import com.progressterra.ipbandroidapi.api.cities.BaseCitiesRepository
import com.progressterra.ipbandroidapi.api.cities.CitiesRepository
import com.progressterra.ipbandroidapi.api.cities.CitiesService
import com.progressterra.ipbandroidapi.api.city.BaseCityRepository
import com.progressterra.ipbandroidapi.api.city.CityRepository
import com.progressterra.ipbandroidapi.api.city.CityService
import com.progressterra.ipbandroidapi.api.collaboration.CollaborationRepository
import com.progressterra.ipbandroidapi.api.collaboration.CollaborationService
import com.progressterra.ipbandroidapi.api.complace.ComPlaceRepository
import com.progressterra.ipbandroidapi.api.complace.ComPlaceService
import com.progressterra.ipbandroidapi.api.email.BaseConfirmEmailRepository
import com.progressterra.ipbandroidapi.api.email.ConfirmEmailRepository
import com.progressterra.ipbandroidapi.api.email.ConfirmEmailService
import com.progressterra.ipbandroidapi.api.ibonus.BaseIBonusRepository
import com.progressterra.ipbandroidapi.api.ibonus.IBonusRepository
import com.progressterra.ipbandroidapi.api.ibonus.IBonusService
import com.progressterra.ipbandroidapi.api.iecommerce.cart.BaseCartRepository
import com.progressterra.ipbandroidapi.api.iecommerce.cart.CartRepository
import com.progressterra.ipbandroidapi.api.iecommerce.cart.CartService
import com.progressterra.ipbandroidapi.api.iecommerce.core.BaseIECommerceCoreRepository
import com.progressterra.ipbandroidapi.api.iecommerce.core.IECommerceCoreRepository
import com.progressterra.ipbandroidapi.api.iecommerce.core.IECommerceCoreService
import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.BaseYouMoneyRepository
import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.YouMoneyRepository
import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.YouMoneyService
import com.progressterra.ipbandroidapi.api.ipbdelivery.BaseIPBDeliveryRepository
import com.progressterra.ipbandroidapi.api.ipbdelivery.IPBDeliveryRepository
import com.progressterra.ipbandroidapi.api.ipbdelivery.IPBDeliveryService
import com.progressterra.ipbandroidapi.api.ipbfavpromorec.BaseIPBFavPromoRecRepository
import com.progressterra.ipbandroidapi.api.ipbfavpromorec.IPBFavPromoRecRepository
import com.progressterra.ipbandroidapi.api.ipbfavpromorec.IPBFavPromoRecService
import com.progressterra.ipbandroidapi.api.ipbmediadata.BaseIPBMediaDataRepository
import com.progressterra.ipbandroidapi.api.ipbmediadata.IPBMediaDataRepository
import com.progressterra.ipbandroidapi.api.ipbmediadata.IPBMediaDataService
import com.progressterra.ipbandroidapi.api.ipbpromocode.BaseIPBPromoCodeRepository
import com.progressterra.ipbandroidapi.api.ipbpromocode.IPBPromoCodeRepository
import com.progressterra.ipbandroidapi.api.ipbpromocode.IPBPromoCodeService
import com.progressterra.ipbandroidapi.api.message.BaseIMessengerRepository
import com.progressterra.ipbandroidapi.api.message.IMessengerRepository
import com.progressterra.ipbandroidapi.api.message.IMessengerService
import com.progressterra.ipbandroidapi.api.messages.BaseMessagesRepository
import com.progressterra.ipbandroidapi.api.messages.MessagesRepository
import com.progressterra.ipbandroidapi.api.messages.MessagesService
import com.progressterra.ipbandroidapi.api.moneyout.BaseMoneyOutRepository
import com.progressterra.ipbandroidapi.api.moneyout.MoneyOutRepository
import com.progressterra.ipbandroidapi.api.moneyout.MoneyOutService
import com.progressterra.ipbandroidapi.api.product.ProductRepository
import com.progressterra.ipbandroidapi.api.product.ProductService
import com.progressterra.ipbandroidapi.api.purchases.BasePurchasesRepository
import com.progressterra.ipbandroidapi.api.purchases.PurchasesRepository
import com.progressterra.ipbandroidapi.api.purchases.PurchasesService
import com.progressterra.ipbandroidapi.api.sber.BaseSberRepository
import com.progressterra.ipbandroidapi.api.sber.SberRepository
import com.progressterra.ipbandroidapi.api.sber.SberService
import com.progressterra.ipbandroidapi.api.scrm.BaseSCRMRepository
import com.progressterra.ipbandroidapi.api.scrm.SCRMRepository
import com.progressterra.ipbandroidapi.api.scrm.SCRMService
import com.progressterra.ipbandroidapi.api.suggestion.BaseSuggestionRepository
import com.progressterra.ipbandroidapi.api.suggestion.SuggestionRepository
import com.progressterra.ipbandroidapi.api.suggestion.SuggestionService
import com.progressterra.ipbandroidapi.api.testimonials.BaseTestimonialsRepository
import com.progressterra.ipbandroidapi.api.testimonials.TestimonialsRepository
import com.progressterra.ipbandroidapi.api.testimonials.TestimonialsService
import com.progressterra.ipbandroidapi.api.typecooperation.BaseTypeCooperationRepository
import com.progressterra.ipbandroidapi.api.typecooperation.TypeCooperationRepository
import com.progressterra.ipbandroidapi.api.typecooperation.TypeCooperationService
import com.progressterra.ipbandroidapi.base.NetworkService
import com.progressterra.ipbandroidapi.core.HandleException
import org.koin.dsl.module

@Suppress("unused")
val iPBAndroidAPIModule = module {

    single<HandleException> {
        HandleException.Base()
    }

    single<NetworkService> { NetworkService.Base() }

    single<AddressRepository> {
        val networkService: NetworkService = get()
        BaseAddressRepository(
            networkService.createService(
                AddressService::class.java, ADDRESS_URL
            )
        )
    }

    single<CollaborationRepository> {
        val networkService: NetworkService = get()
        CollaborationRepository.Base(
            networkService.createService(CollaborationService::class.java, COLLABORATION_URL)
        )
    }

    single<AmbassadorRepository> {
        val networkService: NetworkService = get()
        BaseAmbassadorRepository(
            get(),
            networkService.createService(
                AmbassadorService::class.java, AMBASSADOR_URL
            )
        )
    }

    single<AmbassadorInviteRepository> {
        val networkService: NetworkService = get()
        BaseAmbassadorInviteRepository(
            networkService.createService(
                AmbassadorInviteService::class.java, AMBASSADOR_INVITE_URL
            )
        )
    }

    single<MoneyOutRepository> {
        val networkService: NetworkService = get()
        BaseMoneyOutRepository(
            get(), networkService.createService(
                MoneyOutService::class.java, MONEY_OUT_URL
            )
        )
    }

    single<CityRepository> {
        val networkService: NetworkService = get()
        BaseCityRepository(
            get(),

            networkService.createService(
                CityService::class.java, CITY_URL
            )
        )
    }

    single<ConfirmEmailRepository> {
        val networkService: NetworkService = get()
        BaseConfirmEmailRepository(
            get(),

            networkService.createService(
                ConfirmEmailService::class.java, CONFIRM_EMAIL_URL
            )

        )
    }

    single<TestimonialsRepository> {
        val networkService: NetworkService = get()
        BaseTestimonialsRepository(
            get(),

            networkService.createService(
                TestimonialsService::class.java, TESTIMONIALS_URL
            )

        )
    }

    single<CitiesRepository> {
        val networkService: NetworkService = get()
        BaseCitiesRepository(
            get(),
            networkService.createService(
                CitiesService::class.java, CITIES_URL
            )

        )
    }

    single<PurchasesRepository> {
        val networkService: NetworkService = get()
        BasePurchasesRepository(
            get(),
            networkService.createService(
                PurchasesService::class.java, PURCHASES_URL
            )
        )
    }

    single<SberRepository> {
        val networkService: NetworkService = get()
        BaseSberRepository(
            get(),
            networkService.createService(
                SberService::class.java, SBER_URL
            )
        )
    }

    single<MessagesRepository> {
        val networkService: NetworkService = get()
        BaseMessagesRepository(
            get(),
            networkService.createService(
                MessagesService::class.java, MESSAGES_URL
            )
        )
    }

    single<TypeCooperationRepository> {
        val networkService: NetworkService = get()
        BaseTypeCooperationRepository(
            get(),
            networkService.createService(
                TypeCooperationService::class.java, TYPE_COOPERATION_URL
            )
        )
    }

    single<SCRMRepository> {
        val networkService: NetworkService = get()
        BaseSCRMRepository(
            get(),
            networkService.createService(
                SCRMService::class.java, SCRM_URL
            )
        )
    }

    single<CartRepository> {
        val networkService: NetworkService = get()
        BaseCartRepository(
            get(),
            networkService.createService(
                CartService::class.java, I_ECOMMERCE_URL
            )
        )
    }

    single<YouMoneyRepository> {
        val networkService: NetworkService = get()
        BaseYouMoneyRepository(
            get(),
            networkService.createService(
                YouMoneyService::class.java, I_ECOMMERCE_URL
            )
        )
    }

    single<IECommerceCoreRepository> {
        val networkService: NetworkService = get()
        BaseIECommerceCoreRepository(
            get(),
            networkService.createService(
                IECommerceCoreService::class.java, I_ECOMMERCE_URL
            )
        )
    }

    single<IBonusRepository> {
        val networkService: NetworkService = get()
        BaseIBonusRepository(
            get(),
            networkService.createService(
                IBonusService::class.java, I_BONUS_URL
            )
        )
    }

    single<IPBDeliveryRepository> {
        val networkService: NetworkService = get()
        BaseIPBDeliveryRepository(
            get(),
            networkService.createService(
                IPBDeliveryService::class.java, IPB_DELIVERY_URL
            )
        )
    }

    single<IPBPromoCodeRepository> {
        val networkService: NetworkService = get()
        BaseIPBPromoCodeRepository(
            get(),
            networkService.createService(
                IPBPromoCodeService::class.java, IPB_PROMO_CODE_URL
            )
        )
    }

    single<IPBFavPromoRecRepository> {
        val networkService: NetworkService = get()
        BaseIPBFavPromoRecRepository(
            networkService.createService(
                IPBFavPromoRecService::class.java, IPB_FAV_PROMO_REC_URL
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

    single<IMessengerRepository> {
        val networkService: NetworkService = get()
        BaseIMessengerRepository(
            networkService.createService(
                IMessengerService::class.java,
                I_MESSENGER_URL
            )
        )
    }

    single<IPBMediaDataRepository> {
        val networkService: NetworkService = get()
        BaseIPBMediaDataRepository(
            get(),
            networkService.createService(
                IPBMediaDataService::class.java, IPB_MEDIA_DATA_URL
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
}