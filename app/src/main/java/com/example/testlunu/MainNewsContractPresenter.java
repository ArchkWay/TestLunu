package com.example.testlunu;


import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;

public interface MainNewsContractPresenter<V> {
    void attachView(V mvpView, String keyApi, String theme);
    void attachDB(V mvpView, FragmentActivity fragmentActivity, LifecycleOwner owner);
    void detachView();
}
