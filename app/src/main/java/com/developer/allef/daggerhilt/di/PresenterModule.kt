package com.developer.allef.daggerhilt.di

import com.developer.allef.daggerhilt.MainContract
import com.developer.allef.daggerhilt.MainPresenter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent

/**
 * @author allef.santos on 08/07/20
 */

@InstallIn(value = [ApplicationComponent::class, ActivityComponent::class])
@Module
abstract class PresenterModule {

    @Binds
    abstract fun bindPresenter(impl: MainPresenter): MainContract.Presenter

}