package main

import Class.City
import Class.Location

//class abstract tidak dapat dibuat sebagai objek

fun main() {
//    val lokasi1 = Location("samarinda")
    val lokasi2 = City("samarinda")
    println(lokasi2.name)
}