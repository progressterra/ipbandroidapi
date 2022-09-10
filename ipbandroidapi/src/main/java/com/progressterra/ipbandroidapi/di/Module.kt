package com.progressterra.ipbandroidapi.di

import com.progressterra.ipbandroidapi.api.URL.ADDRESS_URL
import com.progressterra.ipbandroidapi.api.URL.AMBASSADOR_INVITE_URL
import com.progressterra.ipbandroidapi.api.URL.AMBASSADOR_URL
import com.progressterra.ipbandroidapi.api.URL.IPB_DELIVERY_URL
import com.progressterra.ipbandroidapi.api.URL.IPB_FAV_PROMO_REC_URL
import com.progressterra.ipbandroidapi.api.URL.IPB_MEDIA_DATA_URL
import com.progressterra.ipbandroidapi.api.URL.IPB_PROMO_CODE_URL
import com.progressterra.ipbandroidapi.api.URL.I_BONUS_URL
import com.progressterra.ipbandroidapi.api.URL.I_ECOMMERCE_URL
import com.progressterra.ipbandroidapi.api.URL.I_MESSENGER_URL
import com.progressterra.ipbandroidapi.api.URL.MONEY_OUT_URL
import com.progressterra.ipbandroidapi.api.URL.SCRM_URL
import com.progressterra.ipbandroidapi.api.URL.SUGGESTION_URL
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
import com.progressterra.ipbandroidapi.api.ibonus.BaseIBonusRepository
import com.progressterra.ipbandroidapi.api.ibonus.IBonusCloudDataSource
import com.progressterra.ipbandroidapi.api.ibonus.IBonusRepository
import com.progressterra.ipbandroidapi.api.ibonus.IBonusService
import com.progressterra.ipbandroidapi.api.iecommerce.cart.*
import com.progressterra.ipbandroidapi.api.iecommerce.cart.BaseCartCloudDataSource
import com.progressterra.ipbandroidapi.api.iecommerce.cart.BaseCartRepository
import com.progressterra.ipbandroidapi.api.iecommerce.cart.CartService
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
import com.progressterra.ipbandroidapi.api.typecooperation.BaseTypeCooperationRepository
import com.progressterra.ipbandroidapi.api.typecooperation.TypeCooperationCloudDataSource
import com.progressterra.ipbandroidapi.api.typecooperation.TypeCooperationRepository
import com.progressterra.ipbandroidapi.api.typecooperation.TypeCooperationService
import com.progressterra.ipbandroidapi.core.NetworkService
import com.progressterra.ipbandroidapi.exception.HandleException
import org.koin.dsl.module

val iPBAndroidAPIModule = module {

    single<AddressRepository> {
        BaseAddressRepository(
            AddressCloudDataSource.Base(
                NetworkService.Base().createService(
                    AddressService::class.java,
                    ADDRESS_URL
                ),
                HandleException.Base()
            )
        )
    }

    single<AmbassadorRepository> {
        BaseAmbassadorRepository(
            AmbassadorCloudDataSource.Base(
                NetworkService.Base().createService(
                    AmbassadorService::class.java,
                    AMBASSADOR_URL
                ),
                HandleException.Base()
            )
        )
    }

    single<AmbassadorInviteRepository> {
        BaseAmbassadorInviteRepository(
            AmbassadorInviteCloudDataSource.Base(
                NetworkService.Base().createService(
                    AmbassadorInviteService::class.java,
                    AMBASSADOR_INVITE_URL
                ),
                HandleException.Base()
            )
        )
    }

    single<MoneyOutRepository> {
        BaseMoneyOutRepository(
            MoneyOutCloudDataSource.Base(
                NetworkService.Base().createService(
                    MoneyOutService::class.java,
                    MONEY_OUT_URL
                ),
                HandleException.Base()
            )
        )
    }

    single<PurchasesRepository> {
        BasePurchasesRepository(
            PurchasesCloudDataSource.Base(
                NetworkService.Base().createService(
                    PurchasesService::class.java,
                    TODO()
                ),
                HandleException.Base()
            )
        )
    }

    single<SberRepository> {
        BaseSberRepository(
            SberCloudDataSource.Base(
                NetworkService.Base().createService(
                    SberService::class.java,
                    TODO()
                ),
                HandleException.Base()
            )
        )
    }

    single<TypeCooperationRepository> {
        BaseTypeCooperationRepository(
            TypeCooperationCloudDataSource.Base(
                NetworkService.Base().createService(
                    TypeCooperationService::class.java,
                    TYPE_COOPERATION_URL
                ),
                HandleException.Base()
            )
        )
    }

    single<SCRMRepository> {
        BaseSCRMRepository(
            SCRMCloudDataSource.Base(
                NetworkService.Base().createService(
                    SCRMService::class.java,
                    SCRM_URL
                ),
                HandleException.Base()
            )
        )
    }

    single<CartRepository> {
        BaseCartRepository(
            BaseCartCloudDataSource(
                NetworkService.Base().createService(
                    CartService::class.java,
                    I_ECOMMERCE_URL
                ),
                HandleException.Base()
            )
        )
    }

    single<IBonusRepository> {
        BaseIBonusRepository(
            IBonusCloudDataSource.Base(
                NetworkService.Base().createService(
                    IBonusService::class.java,
                    I_BONUS_URL
                ),
                HandleException.Base()
            )
        )
    }

    single<IPBDeliveryRepository> {
        BaseIPBDeliveryRepository(
            IPBDeliveryCloudDataSource.Base(
                NetworkService.Base().createService(
                    IPBDeliveryService::class.java,
                    IPB_DELIVERY_URL
                ),
                HandleException.Base()
            )
        )
    }

    single<IPBPromoCodeRepository> {
        BaseIPBPromoCodeRepository(
            IPBPromoCodeCloudDataSource.Base(
                NetworkService.Base().createService(
                    IPBPromoCodeService::class.java,
                    IPB_PROMO_CODE_URL
                ),
                HandleException.Base()
            )
        )
    }

    single<IPBFavPromoRecRepository> {
        BaseIPBFavPromoRecRepository(
            IPBFavPromoRecCloudDataSource.Base(
                NetworkService.Base().createService(
                    IPBFavPromoRecService::class.java,
                    IPB_FAV_PROMO_REC_URL
                ),
                HandleException.Base()
            )
        )
    }

    single<SuggestionRepository> {
        BaseSuggestionRepository(
            SuggestionCloudDataSource.Base(
                NetworkService.Base().createService(
                    SuggestionService::class.java,
                    SUGGESTION_URL
                ),
                HandleException.Base()
            )
        )
    }

    single<IMessengerRepository> {
        BaseIMessengerRepository(
            IMessengerCloudDataSource.Base(
                NetworkService.Base().createService(
                    IMessengerService::class.java,
                    I_MESSENGER_URL
                ),
                HandleException.Base()
            )
        )
    }

    single<IPBMediaDataRepository> {
        BaseIPBMediaDataRepository(
            IPBMediaDataCloudDataSource.Base(
                NetworkService.Base().createService(
                    IPBMediaDataService::class.java,
                    IPB_MEDIA_DATA_URL
                ),
                HandleException.Base()
            )
        )
    }
}