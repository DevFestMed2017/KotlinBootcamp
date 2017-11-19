package com.gdgcatania.kotlinbootcamp

/**
 * Created by AntoninoMarco on 19/11/2017.
 */

class City constructor(id : Long = 0, val name : String, val coordinate: Coordinate)

class Coordinate constructor(val longitude : Float, val latitude : Float) {
    fun isNorthEmisphere(latitude : Float) = latitude >= 0
}