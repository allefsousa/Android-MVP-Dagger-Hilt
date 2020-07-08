package com.developer.allef.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.developer.allef.daggerhilt.util.Logger
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(),MainContract.View {

    @Inject
    lateinit var logger: Logger
    @Inject
    lateinit var mainPresenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter.lifecycle = lifecycle
        mainPresenter.start()

        logger.log("Initializing main screen")

    }
}