package com.developer.allef.daggerhilt

/**
 * @author allef.santos on 08/07/20
 */
import android.app.Application
import com.developer.allef.daggerhilt.util.Logger
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MyApplication: Application(){

    @Inject lateinit var logger: Logger

    override fun onCreate() {
        super.onCreate()
        logger.log("Initializing application")
    }

}