package com.developer.allef.daggerhilt

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import javax.inject.Inject
import kotlin.math.log

/**
 * @author allef.santos on 08/07/20
 */
class MainPresenter @Inject constructor(): MainContract.Presenter,LifecycleObserver {

    override lateinit var  lifecycle: Lifecycle

    override fun start() {
        lifecycle.addObserver(this)
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.d("MainPresenter","OnCreate")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume(){
        Log.d("MainPresenter","OnResume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart(){
        Log.d("MainPresenter","OnStart")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause(){
        Log.d("MainPresenter","OnPause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop(){
        Log.d("MainPresenter","OnStop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy(){
        Log.d("MainPresenter","OnDestroy")
    }





}