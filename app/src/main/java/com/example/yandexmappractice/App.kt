package com.example.yandexmappractice

import android.app.Application
import com.yandex.mapkit.MapKitFactory

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        MapKitFactory.setApiKey("a0152cea-2563-4632-aae1-b21c7cccb4c5")
    }
}