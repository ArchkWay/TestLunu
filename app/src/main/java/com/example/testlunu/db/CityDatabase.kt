package com.example.testlunu.db

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.Database

@Database(entities = [CitySaved::class], version = 1)
abstract class CityDatabase : RoomDatabase() {

    abstract fun appCityDao(): CityDao
    companion object {
        @Volatile
        private var INSTANCE: CityDatabase? = null

        fun getDatabase(context: Context): CityDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CityDatabase::class.java,
                    "CitiesDatabase")
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}
