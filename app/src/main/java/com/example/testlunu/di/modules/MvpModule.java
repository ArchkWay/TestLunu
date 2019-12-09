package com.example.testlunu.di.modules;

import android.content.Context;


import com.example.testlunu.net.RetrofitProvider;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MvpModule {
    /*modules injectors*/
    private final Context context;
    public MvpModule(Context context){
        this.context = context;
    }

    @Provides
    @Singleton
    Context provideContext(){
        return context;
    }

    @Provides
    @Singleton
    RetrofitProvider provideRetrofit(){
        return new RetrofitProvider();
    }

//    @Provides
//    @Singleton
//    MainContract.Presenter provideMainNewsContractPresenter(Context context){
//        return new MainNewsPresenter( context);
//    }
//
//    @Provides
//    @Singleton
//    MainContract.Model provideMainNewsContractModel(Context context){
//        return new MainNewsModel(context);
//    }

}
