package com.example.testlunu.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Entity
data class CitySaved(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    var name: String,
    var temperature: String,
    var humidity: String,
    var windSpeed: String
) {
    override fun toString(): String {
        return "CarNote(uid=$uid, name='$name', temperature='$temperature', humidity='$humidity', windSpeed='$windSpeed' )"
    }
}

@Dao
interface CityDao {

    @Query("select * from CitySaved")
    fun fetchAll(): LiveData<List<CitySaved>>

    @Insert
    suspend fun insert(arg: CitySaved)

    @Update
    suspend fun update(arg: CitySaved)

    @Delete
    suspend fun delete(arg: CitySaved)

}