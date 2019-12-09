package com.example.testlunu.db

import androidx.lifecycle.LiveData

class CityRepository(private val cityDao: CityDao) {

    val allCities: LiveData<List<CitySaved>> = cityDao.fetchAll()

    suspend fun insert(arg: CitySaved) {
        cityDao.insert(arg)
    }

    suspend fun update(arg: CitySaved) {
        cityDao.update(arg)
    }

    suspend fun delete(arg: CitySaved) {
        cityDao.delete(arg)
    }
}
