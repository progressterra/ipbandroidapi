package com.progressterra.ipbandroidapi.di

import com.progressterra.ipbandroidapi.interfaces.internal.Repository
import dagger.Component

@Component(modules = [RepositoryModule::class])
internal interface RepositoryComponent {

    fun inject(repository: Repository)
}