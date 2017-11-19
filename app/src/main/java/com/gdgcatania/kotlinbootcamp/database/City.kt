package com.gdgcatania.kotlinbootcamp.database

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "cities")
data class City(
        @PrimaryKey
        @ColumnInfo(name = "id")
        val id: String,

        @PrimaryKey
        @ColumnInfo(name = "nm")
        val name: String,

        @PrimaryKey
        @ColumnInfo(name = "lat")
        val latitude: String,

        @PrimaryKey
        @ColumnInfo(name = "lon")
        val longitude: String,

        @PrimaryKey
        @ColumnInfo(name = "countryCode")
        val countryCode: String
)
