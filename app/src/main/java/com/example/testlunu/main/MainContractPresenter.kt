package com.example.testlunu.main

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.LifecycleOwner
import com.example.testlunu.db.CitySaved

interface MainContractPresenter<V> {
    fun checkAndAddIfNot(mvpView: V, fragmentActivity: FragmentActivity, owner: LifecycleOwner)
    fun attachCity(mvpView: V, nameCity: String?)
    fun addItemToDb(mvpView: V, citySaved: CitySaved)
    fun deleteItemFromDB(citySaved: CitySaved)
    fun getCity(mvp: V, nameCity: String?)




    fun detachView()
}