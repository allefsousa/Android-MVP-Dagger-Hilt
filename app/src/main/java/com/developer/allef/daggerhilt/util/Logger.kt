package com.developer.allef.daggerhilt.util

import android.util.Log
import javax.inject.Inject

/**
 * @author allef.santos on 08/07/20
 */
interface Logger {

    fun log(message: String)
}

class AuditLogger @Inject constructor():
    Logger {

    companion object {
        const val TAG = "AuditLogger"
    }

    override fun log(message: String) {
        Log.i(TAG, message)
    }
}