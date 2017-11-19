package com.gdgcatania.kotlinbootcamp.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase


@Database(entities = [City::class], version = 2)
abstract class CitiesDatabase : RoomDatabase() {

    abstract fun getDao(): CityDao
}
