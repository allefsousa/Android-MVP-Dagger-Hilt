package com.developer.allef.daggerhilt

import androidx.lifecycle.Lifecycle

/**
 * @author allef.santos on 08/07/20
 */
interface MainContract {
    interface Presenter {
        fun start()
        var lifecycle: Lifecycle
    }

    interface View{

    }
}