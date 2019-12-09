package com.example.testlunu.di.components

import com.example.testlunu.MainActivity
import com.example.testlunu.di.modules.MvpModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MvpModule::class])
interface AppComponent {
    fun inject(activity: MainActivity?) //    void inject(MainNewsPresenter presenter);
//    void inject(MainNewsVActivity view);
}