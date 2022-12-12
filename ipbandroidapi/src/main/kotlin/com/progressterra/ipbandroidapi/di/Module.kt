package com.progressterra.ipbandroidapi.di

import com.progressterra.ipbandroidapi.api.URL.ADDRESS_URL
import com.progressterra.ipbandroidapi.api.URL.AMBASSADOR_INVITE_URL
import com.progressterra.ipbandroidapi.api.URL.AMBASSADOR_URL
import com.progressterra.ipbandroidapi.api.URL.CHECKLIST_URL
import com.progressterra.ipbandroidapi.api.URL.CITIES_URL
import com.progressterra.ipbandroidapi.api.URL.CITY_URL
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
import com.progressterra.ipbandroidapi.core.HandleException
import com.progressterra.ipbandroidapi.base.NetworkService
import com.progressterra.ipbandroidapi.api.message.BaseIMessengerRepository
import com.progressterra.ipbandroidapi.api.message.IMessengerRepository
import com.progressterra.ipbandroidapi.api.message.IMessengerService
import org.koin.dsl.module

@Suppress("unused")
val iPBAndroidAPIModule = module {

    single<HandleException> {
        HandleException.Base()
    }

    single<AddressRepository> {
        BaseAddressRepository(
            NetworkService.Base().createService(
                AddressService::class.java, ADDRESS_URL
            )
        )
    }

    single<AmbassadorRepository> {
        BaseAmbassadorRepository(
            get(),
            NetworkService.Base().createService(
                AmbassadorService::class.java, AMBASSADOR_URL
            )
        )
    }

    single<AmbassadorInviteRepository> {
        BaseAmbassadorInviteRepository(
            NetworkService.Base().createService(
                AmbassadorInviteService::class.java, AMBASSADOR_INVITE_URL
            )
        )
    }

    single<MoneyOutRepository> {
        BaseMoneyOutRepository(
            get(), NetworkService.Base().createService(
                MoneyOutService::class.java, MONEY_OUT_URL
            )
        )
    }

    single<CityRepository> {
        BaseCityRepository(
            get(),

            NetworkService.Base().createService(
                CityService::class.java, CITY_URL
            )
        )
    }

    single<ConfirmEmailRepository> {
        BaseConfirmEmailRepository(
            get(),

            NetworkService.Base().createService(
                ConfirmEmailService::class.java, CONFIRM_EMAIL_URL
            )

        )
    }

    single<TestimonialsRepository> {
        BaseTestimonialsRepository(
            get(),

            NetworkService.Base().createService(
                TestimonialsService::class.java, TESTIMONIALS_URL
            )

        )
    }

    single<CitiesRepository> {
        BaseCitiesRepository(
            get(),
            NetworkService.Base().createService(
                CitiesService::class.java, CITIES_URL
            )

        )
    }

    single<PurchasesRepository> {
        BasePurchasesRepository(
            get(),
            NetworkService.Base().createService(
                PurchasesService::class.java, PURCHASES_URL
            )
        )
    }

    single<SberRepository> {
        BaseSberRepository(
            get(),
            NetworkService.Base().createService(
                SberService::class.java, SBER_URL
            )
        )
    }

    single<MessagesRepository> {
        BaseMessagesRepository(
            get(),
            NetworkService.Base().createService(
                MessagesService::class.java, MESSAGES_URL
            )
        )
    }

    single<TypeCooperationRepository> {
        BaseTypeCooperationRepository(
            get(),
            NetworkService.Base().createService(
                TypeCooperationService::class.java, TYPE_COOPERATION_URL
            )
        )
    }

    single<SCRMRepository> {
        BaseSCRMRepository(
            get(),
            NetworkService.Base().createService(
                SCRMService::class.java, SCRM_URL
            )
        )
    }

    single<CartRepository> {
        BaseCartRepository(
            get(),
            NetworkService.Base().createService(
                CartService::class.java, I_ECOMMERCE_URL
            )
        )
    }

    single<YouMoneyRepository> {
        BaseYouMoneyRepository(
            get(),
            NetworkService.Base().createService(
                YouMoneyService::class.java, I_ECOMMERCE_URL
            )
        )
    }

    single<IECommerceCoreRepository> {
        BaseIECommerceCoreRepository(
            get(),
            NetworkService.Base().createService(
                IECommerceCoreService::class.java, I_ECOMMERCE_URL
            )
        )
    }

    single<IBonusRepository> {
        BaseIBonusRepository(
            get(),
            NetworkService.Base().createService(
                IBonusService::class.java, I_BONUS_URL
            )
        )
    }

    single<IPBDeliveryRepository> {
        BaseIPBDeliveryRepository(
            get(),
            NetworkService.Base().createService(
                IPBDeliveryService::class.java, IPB_DELIVERY_URL
            )
        )
    }

    single<IPBPromoCodeRepository> {
        BaseIPBPromoCodeRepository(
            get(),
            NetworkService.Base().createService(
                IPBPromoCodeService::class.java, IPB_PROMO_CODE_URL
            )
        )
    }

    single<IPBFavPromoRecRepository> {
        BaseIPBFavPromoRecRepository(
            get(),
            NetworkService.Base().createService(
                IPBFavPromoRecService::class.java, IPB_FAV_PROMO_REC_URL
            )
        )
    }

    single<SuggestionRepository> {
        BaseSuggestionRepository(
            get(),
            NetworkService.Base().createService(
                SuggestionService::class.java, SUGGESTION_URL
            )
        )
    }

    single<IMessengerRepository> {
        BaseIMessengerRepository(
            NetworkService.Base().createService(
                IMessengerService::class.java,
                I_MESSENGER_URL
            )
        )
    }

    single<IPBMediaDataRepository> {
        BaseIPBMediaDataRepository(
            get(),
            NetworkService.Base().createService(
                IPBMediaDataService::class.java, IPB_MEDIA_DATA_URL
            )
        )
    }

    single<ChecklistRepository> {
        ChecklistRepository.Base(
            get(),
            NetworkService.Base().createService(
                ChecklistService::class.java, CHECKLIST_URL
            )
        )
    }

    single<ProductRepository> {
        ProductRepository.Base(
            get(),
            NetworkService.Base().createService(
                ProductService::class.java, PRODUCT_URL
            )
        )
    }
}