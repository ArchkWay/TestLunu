package com.example.testlunu.db

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class CityViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: CityRepository

    val allCities: LiveData<List<CitySaved>>

    init {
        val cityDao = CityDatabase.getDatabase(application).appCityDao()
        repository = CityRepository(cityDao)
        allCities = repository.allCities
    }

    fun insert(arg: CitySaved) = viewModelScope.launch {
        repository.insert(arg)
    }

    fun update(arg: CitySaved) = viewModelScope.launch {
        repository.update(arg)
    }

    fun delete(arg: CitySaved) = viewModelScope.launch {
        repository.delete(arg)
    }
}
