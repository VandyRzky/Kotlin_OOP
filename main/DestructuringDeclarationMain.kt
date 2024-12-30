package main

import Class.Game
import Class.Login
import Class.MinMax

fun minMax (value1: Int, value2: Int): MinMax{ // penerapan pada function
    return when{
        value1 < value2 -> MinMax(value1, value2)
        else -> MinMax(value2, value1)
    }
}

fun login (login: Login, callback: (Login) -> Boolean): Boolean{
    return callback(login)
}

// membuat multiple variabel dari object
fun main() {
    val game = Game("game 1", "10.000")

    val (name, price) = game //penerapan pada variabel
    println(name)
    println(price)

    val (min, max) = minMax(10,20)
    println(min)
    println(max)

    val (_, max2) = minMax(30, 20)
    println(max2)


    //penerapan pada lambda
    val login = Login("budi", "rahasia")
    val auth = login(login){ (username, password) ->
        username == "budi" && password == "rahasia"
    }
    println(auth)
}