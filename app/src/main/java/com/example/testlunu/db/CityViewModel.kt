package com.example.simpleroomkt

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.testlunu.db.CityRepository
import com.example.testlunu.db.CityDatabase
import com.example.testlunu.db.CitySaved
import kotlinx.coroutines.launch

class CityViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: CityRepository

    val allCars: LiveData<List<CitySaved>>

    init {
        val carDao = CityDatabase.getDatabase(application).appCityDao()
        repository = CityRepository(carDao)
        allCars = repository.allCities
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
