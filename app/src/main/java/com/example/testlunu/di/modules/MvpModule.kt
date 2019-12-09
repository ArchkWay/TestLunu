package com.example.testlunu.di.modules

import android.content.Context
import com.example.testlunu.net.RetrofitProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MvpModule //    @Singleton
//    MainContract.Presenter provideMainNewsContractPresenter(Context context){
//        return new MainNewsPresenter( context);
//    }
//
//    @Provides
//    @Singleton
//    MainContract.Model provideMainNewsContractModel(Context context){
//        return new MainNewsModel(context);
//    }
    (/*modules injectors*/
    private val context: Context
) {

    @Provides
    @Singleton
    fun provideContext(): Context {
        return context
    }

    @Provides
    @Singleton
    fun provideRetrofit(): RetrofitProvider {
        return RetrofitProvider()
    } //    @Provides

}