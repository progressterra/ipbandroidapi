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
import com.progressterra.ipbandroidapi.api.URL.PURCHASES_URL
import com.progressterra.ipbandroidapi.api.URL.SBER_URL
import com.progressterra.ipbandroidapi.api.URL.SCRM_URL
import com.progressterra.ipbandroidapi.api.URL.SUGGESTION_URL
import com.progressterra.ipbandroidapi.api.URL.TESTIMONIALS_URL
import com.progressterra.ipbandroidapi.api.URL.TYPE_COOPERATION_URL
import com.progressterra.ipbandroidapi.api.address.AddressCloudDataSource
import com.progressterra.ipbandroidapi.api.address.AddressRepository
import com.progressterra.ipbandroidapi.api.address.AddressService
import com.progressterra.ipbandroidapi.api.address.BaseAddressRepository
import com.progressterra.ipbandroidapi.api.ambassador.AmbassadorCloudDataSource
import com.progressterra.ipbandroidapi.api.ambassador.AmbassadorRepository
import com.progressterra.ipbandroidapi.api.ambassador.AmbassadorService
import com.progressterra.ipbandroidapi.api.ambassador.BaseAmbassadorRepository
import com.progressterra.ipbandroidapi.api.ambassadorinvite.AmbassadorInviteCloudDataSource
import com.progressterra.ipbandroidapi.api.ambassadorinvite.AmbassadorInviteRepository
import com.progressterra.ipbandroidapi.api.ambassadorinvite.AmbassadorInviteService
import com.progressterra.ipbandroidapi.api.ambassadorinvite.BaseAmbassadorInviteRepository
import com.progressterra.ipbandroidapi.api.checklist.ChecklistCloudDataSource
import com.progressterra.ipbandroidapi.api.checklist.ChecklistRepository
import com.progressterra.ipbandroidapi.api.checklist.ChecklistService
import com.progressterra.ipbandroidapi.api.cities.BaseCitiesRepository
import com.progressterra.ipbandroidapi.api.cities.CitiesCloudDataSource
import com.progressterra.ipbandroidapi.api.cities.CitiesRepository
import com.progressterra.ipbandroidapi.api.cities.CitiesService
import com.progressterra.ipbandroidapi.api.city.BaseCityRepository
import com.progressterra.ipbandroidapi.api.city.CityCloudDataSource
import com.progressterra.ipbandroidapi.api.city.CityRepository
import com.progressterra.ipbandroidapi.api.city.CityService
import com.progressterra.ipbandroidapi.api.email.BaseConfirmEmailRepository
import com.progressterra.ipbandroidapi.api.email.ConfirmEmailCloudDataSource
import com.progressterra.ipbandroidapi.api.email.ConfirmEmailRepository
import com.progressterra.ipbandroidapi.api.email.ConfirmEmailService
import com.progressterra.ipbandroidapi.api.ibonus.BaseIBonusRepository
import com.progressterra.ipbandroidapi.api.ibonus.IBonusCloudDataSource
import com.progressterra.ipbandroidapi.api.ibonus.IBonusRepository
import com.progressterra.ipbandroidapi.api.ibonus.IBonusService
import com.progressterra.ipbandroidapi.api.iecommerce.cart.BaseCartCloudDataSource
import com.progressterra.ipbandroidapi.api.iecommerce.cart.BaseCartRepository
import com.progressterra.ipbandroidapi.api.iecommerce.cart.CartRepository
import com.progressterra.ipbandroidapi.api.iecommerce.cart.CartService
import com.progressterra.ipbandroidapi.api.iecommerce.core.BaseIECommerceCoreCloudDataSource
import com.progressterra.ipbandroidapi.api.iecommerce.core.BaseIECommerceCoreRepository
import com.progressterra.ipbandroidapi.api.iecommerce.core.IECommerceCoreRepository
import com.progressterra.ipbandroidapi.api.iecommerce.core.IECommerceCoreService
import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.BaseYouMoneyRepository
import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.YouMoneyCloudDataSource
import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.YouMoneyRepository
import com.progressterra.ipbandroidapi.api.iecommerce.youmoney.YouMoneyService
import com.progressterra.ipbandroidapi.api.imessenger.BaseIMessengerRepository
import com.progressterra.ipbandroidapi.api.imessenger.IMessengerCloudDataSource
import com.progressterra.ipbandroidapi.api.imessenger.IMessengerRepository
import com.progressterra.ipbandroidapi.api.imessenger.IMessengerService
import com.progressterra.ipbandroidapi.api.ipbdelivery.BaseIPBDeliveryRepository
import com.progressterra.ipbandroidapi.api.ipbdelivery.IPBDeliveryCloudDataSource
import com.progressterra.ipbandroidapi.api.ipbdelivery.IPBDeliveryRepository
import com.progressterra.ipbandroidapi.api.ipbdelivery.IPBDeliveryService
import com.progressterra.ipbandroidapi.api.ipbfavpromorec.BaseIPBFavPromoRecRepository
import com.progressterra.ipbandroidapi.api.ipbfavpromorec.IPBFavPromoRecCloudDataSource
import com.progressterra.ipbandroidapi.api.ipbfavpromorec.IPBFavPromoRecRepository
import com.progressterra.ipbandroidapi.api.ipbfavpromorec.IPBFavPromoRecService
import com.progressterra.ipbandroidapi.api.ipbmediadata.BaseIPBMediaDataRepository
import com.progressterra.ipbandroidapi.api.ipbmediadata.IPBMediaDataCloudDataSource
import com.progressterra.ipbandroidapi.api.ipbmediadata.IPBMediaDataRepository
import com.progressterra.ipbandroidapi.api.ipbmediadata.IPBMediaDataService
import com.progressterra.ipbandroidapi.api.ipbpromocode.BaseIPBPromoCodeRepository
import com.progressterra.ipbandroidapi.api.ipbpromocode.IPBPromoCodeCloudDataSource
import com.progressterra.ipbandroidapi.api.ipbpromocode.IPBPromoCodeRepository
import com.progressterra.ipbandroidapi.api.ipbpromocode.IPBPromoCodeService
import com.progressterra.ipbandroidapi.api.messages.BaseMessagesRepository
import com.progressterra.ipbandroidapi.api.messages.MessagesCloudDataSource
import com.progressterra.ipbandroidapi.api.messages.MessagesRepository
import com.progressterra.ipbandroidapi.api.messages.MessagesService
import com.progressterra.ipbandroidapi.api.moneyout.BaseMoneyOutRepository
import com.progressterra.ipbandroidapi.api.moneyout.MoneyOutCloudDataSource
import com.progressterra.ipbandroidapi.api.moneyout.MoneyOutRepository
import com.progressterra.ipbandroidapi.api.moneyout.MoneyOutService
import com.progressterra.ipbandroidapi.api.purchases.BasePurchasesRepository
import com.progressterra.ipbandroidapi.api.purchases.PurchasesCloudDataSource
import com.progressterra.ipbandroidapi.api.purchases.PurchasesRepository
import com.progressterra.ipbandroidapi.api.purchases.PurchasesService
import com.progressterra.ipbandroidapi.api.sber.BaseSberRepository
import com.progressterra.ipbandroidapi.api.sber.SberCloudDataSource
import com.progressterra.ipbandroidapi.api.sber.SberRepository
import com.progressterra.ipbandroidapi.api.sber.SberService
import com.progressterra.ipbandroidapi.api.scrm.BaseSCRMRepository
import com.progressterra.ipbandroidapi.api.scrm.SCRMCloudDataSource
import com.progressterra.ipbandroidapi.api.scrm.SCRMRepository
import com.progressterra.ipbandroidapi.api.scrm.SCRMService
import com.progressterra.ipbandroidapi.api.suggestion.BaseSuggestionRepository
import com.progressterra.ipbandroidapi.api.suggestion.SuggestionCloudDataSource
import com.progressterra.ipbandroidapi.api.suggestion.SuggestionRepository
import com.progressterra.ipbandroidapi.api.suggestion.SuggestionService
import com.progressterra.ipbandroidapi.api.testimonials.BaseTestimonialsRepository
import com.progressterra.ipbandroidapi.api.testimonials.TestimonialsCloudDataSource
import com.progressterra.ipbandroidapi.api.testimonials.TestimonialsRepository
import com.progressterra.ipbandroidapi.api.testimonials.TestimonialsService
import com.progressterra.ipbandroidapi.api.typecooperation.BaseTypeCooperationRepository
import com.progressterra.ipbandroidapi.api.typecooperation.TypeCooperationCloudDataSource
import com.progressterra.ipbandroidapi.api.typecooperation.TypeCooperationRepository
import com.progressterra.ipbandroidapi.api.typecooperation.TypeCooperationService
import com.progressterra.ipbandroidapi.core.NetworkService
import com.progressterra.ipbandroidapi.exception.HandleException
import org.koin.dsl.module

@Suppress("unused")
val iPBAndroidAPIModule = module {

    single<HandleException> {
        HandleException.Base()
    }

    single<AddressRepository> {
        BaseAddressRepository(
            AddressCloudDataSource.Base(
                NetworkService.Base().createService(
                    AddressService::class.java, ADDRESS_URL
                ), get()
            )
        )
    }

    single<AmbassadorRepository> {
        BaseAmbassadorRepository(
            AmbassadorCloudDataSource.Base(
                NetworkService.Base().createService(
                    AmbassadorService::class.java, AMBASSADOR_URL
                ), get()
            )
        )
    }

    single<AmbassadorInviteRepository> {
        BaseAmbassadorInviteRepository(
            AmbassadorInviteCloudDataSource.Base(
                NetworkService.Base().createService(
                    AmbassadorInviteService::class.java, AMBASSADOR_INVITE_URL
                ), get()
            )
        )
    }

    single<MoneyOutRepository> {
        BaseMoneyOutRepository(
            MoneyOutCloudDataSource.Base(
                NetworkService.Base().createService(
                    MoneyOutService::class.java, MONEY_OUT_URL
                ), get()
            )
        )
    }

    single<CityRepository> {
        BaseCityRepository(
            CityCloudDataSource.Base(
                NetworkService.Base().createService(
                    CityService::class.java, CITY_URL
                ), get()
            )
        )
    }

    single<ConfirmEmailRepository> {
        BaseConfirmEmailRepository(
            ConfirmEmailCloudDataSource.Base(
                NetworkService.Base().createService(
                    ConfirmEmailService::class.java, CONFIRM_EMAIL_URL
                ), get()
            )
        )
    }

    single<TestimonialsRepository> {
        BaseTestimonialsRepository(
            TestimonialsCloudDataSource.Base(
                NetworkService.Base().createService(
                    TestimonialsService::class.java, TESTIMONIALS_URL
                ), get()
            )
        )
    }

    single<CitiesRepository> {
        BaseCitiesRepository(
            CitiesCloudDataSource.Base(
                NetworkService.Base().createService(
                    CitiesService::class.java, CITIES_URL
                ), get()
            )
        )
    }

    single<PurchasesRepository> {
        BasePurchasesRepository(
            PurchasesCloudDataSource.Base(
                NetworkService.Base().createService(
                    PurchasesService::class.java, PURCHASES_URL
                ), get()
            )
        )
    }

    single<SberRepository> {
        BaseSberRepository(
            SberCloudDataSource.Base(
                NetworkService.Base().createService(
                    SberService::class.java, SBER_URL
                ), get()
            )
        )
    }

    single<MessagesRepository> {
        BaseMessagesRepository(
            MessagesCloudDataSource.Base(
                NetworkService.Base().createService(
                    MessagesService::class.java, MESSAGES_URL
                ), get()
            )
        )
    }

    single<TypeCooperationRepository> {
        BaseTypeCooperationRepository(
            TypeCooperationCloudDataSource.Base(
                NetworkService.Base().createService(
                    TypeCooperationService::class.java, TYPE_COOPERATION_URL
                ), get()
            )
        )
    }

    single<SCRMRepository> {
        BaseSCRMRepository(
            SCRMCloudDataSource.Base(
                NetworkService.Base().createService(
                    SCRMService::class.java, SCRM_URL
                ), get()
            )
        )
    }

    single<CartRepository> {
        BaseCartRepository(
            BaseCartCloudDataSource(
                NetworkService.Base().createService(
                    CartService::class.java, I_ECOMMERCE_URL
                ), get()
            )
        )
    }

    single<YouMoneyRepository> {
        BaseYouMoneyRepository(
            YouMoneyCloudDataSource.Base(
                NetworkService.Base().createService(
                    YouMoneyService::class.java, I_ECOMMERCE_URL
                ), get()
            )
        )
    }

    single<IECommerceCoreRepository> {
        BaseIECommerceCoreRepository(
            BaseIECommerceCoreCloudDataSource(
                NetworkService.Base().createService(
                    IECommerceCoreService::class.java, I_ECOMMERCE_URL
                ), get()
            )
        )
    }

    single<IBonusRepository> {
        BaseIBonusRepository(
            IBonusCloudDataSource.Base(
                NetworkService.Base().createService(
                    IBonusService::class.java, I_BONUS_URL
                ), get()
            )
        )
    }

    single<IPBDeliveryRepository> {
        BaseIPBDeliveryRepository(
            IPBDeliveryCloudDataSource.Base(
                NetworkService.Base().createService(
                    IPBDeliveryService::class.java, IPB_DELIVERY_URL
                ), get()
            )
        )
    }

    single<IPBPromoCodeRepository> {
        BaseIPBPromoCodeRepository(
            IPBPromoCodeCloudDataSource.Base(
                NetworkService.Base().createService(
                    IPBPromoCodeService::class.java, IPB_PROMO_CODE_URL
                ), get()
            )
        )
    }

    single<IPBFavPromoRecRepository> {
        BaseIPBFavPromoRecRepository(
            IPBFavPromoRecCloudDataSource.Base(
                NetworkService.Base().createService(
                    IPBFavPromoRecService::class.java, IPB_FAV_PROMO_REC_URL
                ), get()
            )
        )
    }

    single<SuggestionRepository> {
        BaseSuggestionRepository(
            SuggestionCloudDataSource.Base(
                NetworkService.Base().createService(
                    SuggestionService::class.java, SUGGESTION_URL
                ), get()
            )
        )
    }

    single<IMessengerRepository> {
        BaseIMessengerRepository(
            IMessengerCloudDataSource.Base(
                NetworkService.Base().createService(
                    IMessengerService::class.java, I_MESSENGER_URL
                ), get()
            )
        )
    }

    single<IPBMediaDataRepository> {
        BaseIPBMediaDataRepository(
            IPBMediaDataCloudDataSource.Base(
                NetworkService.Base().createService(
                    IPBMediaDataService::class.java, IPB_MEDIA_DATA_URL
                ), get()
            )
        )
    }

    single<ChecklistRepository> {
        ChecklistRepository.Base(
            ChecklistCloudDataSource.Base(
                NetworkService.Base().createService(
                    ChecklistService::class.java, CHECKLIST_URL
                ), get()
            )
        )
    }
}