package com.gdgcatania.kotlinbootcamp.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import io.reactivex.Flowable

@Dao
interface CityDao {

    @Query("SELECT * FROM user WHERE nm LIKE :name")
    fun getCityByName(name : String) : Flowable<City>
}
