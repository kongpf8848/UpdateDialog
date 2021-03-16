package com.github.kongpf8848.updatedialog

import android.app.Application
import android.util.Log


class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        Thread.setDefaultUncaughtExceptionHandler { t, e ->
            e.printStackTrace()
            Log.d("Crash", "uncaughtException() called with: t = [" + t + "], e = [" + e.message + "]")
        }

    }

    companion object {
        lateinit var instance: MyApplication
    }
}