package com.progressterra.ipbandroidapi.di

import com.progressterra.ipbandroidapi.interactors.BonusesInfoRepositoryImpl
import com.progressterra.ipbandroidapi.repository.RepositoryImpl
import dagger.Component

@Component(modules = [RepositoryModule::class])
internal interface RepositoryComponent {

    fun inject(repository: RepositoryImpl)
    fun injectBonusesBannerRepository(bonusesBannerRepositoryImpl: BonusesInfoRepositoryImpl)
}