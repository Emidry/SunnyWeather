package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {
    @SuppressLint("StaticFieldLeak")
    companion object {
        lateinit var context: Context

        const val TOKEN = "填入你申请到的令牌值"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}