package com.gdgcatania.kotlinbootcamp

/**
 * Created by AntoninoMarco on 19/11/2017.
 */

class Weather constructor(id : Int, main : String, description : String, icon : String)

class Main constructor(temp : Float, pressure : Integer, temp_min : Float, temp_max : Float, sea_level : Integer, grnd_level : Integer)

class Wind constructor(speed : Float, deg : Float)

class Clouds constructor(all : Integer)

class Rain constructor(lastThreeHours : Integer)

class Snow constructor(lastThreeHours : Integer)

class Sys constructor(type : Integer, id : Integer, message : Integer, country  : String, sunrire : Long, sunset :Long)