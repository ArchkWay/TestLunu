package com.example.testlunu.db

import android.os.Parcelable
import androidx.lifecycle.LiveData
import androidx.room.*
import kotlinx.android.parcel.Parcelize

@Entity
data class CitySaved(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    var name: String,
    var temperature: String,
    var humidity: String,
    var windSpeed: String
) {
    override fun toString(): String {
        return "CityNote(uid=$uid, name='$name', temperature='$temperature', humidity='$humidity', windSpeed='$windSpeed' )"
    }
}

@Dao
interface CityDao  {

    @Query("select * from CitySaved")
    fun fetchAll(): LiveData<List<CitySaved>>

    @Insert
    suspend fun insert(arg: CitySaved)

    @Update
    suspend fun update(arg: CitySaved)

    @Delete
    suspend fun delete(arg: CitySaved)

}

@Parcelize
data class CityParcel(var name: String, var temperature: String, var humidity: String, var windSpeed: String) : Parcelable



