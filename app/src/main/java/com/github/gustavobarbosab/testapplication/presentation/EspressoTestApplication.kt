package com.github.gustavobarbosab.testapplication.presentation

import android.app.Application
import com.github.gustavobarbosab.testapplication.di.CoreModule
import com.github.gustavobarbosab.testapplication.presentation.main.di.MainModule
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin

class EspressoTestApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            loadKoinModules(
                listOf(
                    CoreModule.instance,
                    MainModule.instance
                )
            )
        }
    }
}