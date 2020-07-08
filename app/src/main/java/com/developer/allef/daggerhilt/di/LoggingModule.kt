package com.developer.allef.daggerhilt.di

import com.developer.allef.daggerhilt.util.AuditLogger
import com.developer.allef.daggerhilt.util.Logger
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
abstract class LoggingModule {

    @Binds
    abstract fun bindAuditLogger(impl: AuditLogger): Logger

}