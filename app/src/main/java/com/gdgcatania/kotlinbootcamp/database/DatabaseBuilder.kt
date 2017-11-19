package com.gdgcatania.kotlinbootcamp.database

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.Room
import android.arch.persistence.room.migration.Migration
import android.content.Context


object DatabaseBuilder{

    @JvmStatic
    private val SQL_LITE_MIGRATION = object : Migration(1, 2) {
        override fun migrate(database: SupportSQLiteDatabase) {
            // NOOP
        }
    }

    @JvmStatic
    fun getInstance(context: Context) : CitiesDatabase =
            Room.databaseBuilder(context, CitiesDatabase::class.java, "cities.db")
                    .addMigrations(SQL_LITE_MIGRATION)
                    .build()
}
