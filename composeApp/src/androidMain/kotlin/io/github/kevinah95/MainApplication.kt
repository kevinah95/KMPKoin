package io.github.kevinah95

import android.R.attr.name
import android.app.Application
import io.github.kevinah95.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.java.KoinJavaComponent.get

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(this@MainApplication)
            androidLogger()
        }
    }
}