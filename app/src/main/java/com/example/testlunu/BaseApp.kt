package com.example.testlunu

import android.app.Application
import android.content.Context

import com.example.testlunu.di.components.AppComponent
import com.example.testlunu.di.components.DaggerAppComponent
import com.example.testlunu.di.modules.MvpModule


class BaseApp : Application() {
    /*baseDI*/
    private var appComponent: AppComponent? = null

    val injector: AppComponent?
        get() {
            if (appComponent == null) {
                appComponent = DaggerAppComponent
                    .builder()
                    .mvpModule(MvpModule(this))
                    .build()
            }
            return appComponent
        }

    companion object {
        val INTENT_TITLE = "intent_title"
        val INTENT_DESC = "intent_desc"

        operator fun get(ctx: Context): BaseApp {
            return ctx.applicationContext as BaseApp
        }
    }
}
