package com.example.testlunu.di.components;



import com.example.testlunu.MainActivity;
import com.example.testlunu.di.modules.MvpModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MvpModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
//    void inject(MainNewsPresenter presenter);
//    void inject(MainNewsVActivity view);


}
