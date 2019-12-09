package com.example.testlunu.db

import androidx.lifecycle.LiveData

class CityRepository(private val cityDao: CityDao) {

    val allCities: LiveData<List<com.example.testlunu.db.CitySaved>> = cityDao.fetchAll()

    suspend fun insert(arg: com.example.testlunu.db.CitySaved) {
        cityDao.insert(arg)
    }

    suspend fun update(arg: com.example.testlunu.db.CitySaved) {
        cityDao.update(arg)
    }

    suspend fun delete(arg: com.example.testlunu.db.CitySaved) {
        cityDao.delete(arg)
    }
}
