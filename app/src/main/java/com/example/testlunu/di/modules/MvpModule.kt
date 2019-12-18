package com.example.testlunu.di.modules

import android.content.Context
import com.example.testlunu.main.MainContract
import com.example.testlunu.main.MainModel
import com.example.testlunu.main.MainPresenter
import com.example.testlunu.main.MainVActivity
import com.example.testlunu.net.RetrofitProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MvpModule(private val context: Context) {

    @Provides
    @Singleton
    fun provideContext(): Context = context

    @Provides
    @Singleton
    fun provideRetrofit(): RetrofitProvider = RetrofitProvider()

    @Provides
    @Singleton
    fun provideMainContractPresenter (context:Context): MainContract.Presenter = MainPresenter(context)


    @Provides
    @Singleton
    fun provideMainContractModel (context:Context): MainContract.Model = MainModel(context)


}

