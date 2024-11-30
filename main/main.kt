package main

import Class.Car
import Class.Person

fun main(args: Array<String>) {
    val hero = Person("wwww", "qqq")
    println(hero.firstName)
    hero.sayHello() //memanggil function pada class

    val mobil = Car("Mazda", "RX-7")
    println(mobil.model)
    mobil.helloUser("eee")
}