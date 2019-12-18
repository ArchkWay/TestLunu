package com.example.testlunu.di.components

import com.example.testlunu.main.MainVActivity
import com.example.testlunu.di.modules.MvpModule
import com.example.testlunu.main.MainModel
import com.example.testlunu.main.MainPresenter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MvpModule::class])
interface AppComponent {
    fun inject(view: MainVActivity) //    void inject(MainNewsPresenter presenter);
    fun inject(presenter: MainPresenter) //    void inject(MainNewsPresenter presenter);
    fun inject(model: MainModel) //    void inject(MainNewsPresenter presenter);

}