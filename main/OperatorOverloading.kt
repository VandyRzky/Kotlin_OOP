package main

import Class.Fruit

// membuat fuction dari operator
// reff = https://docs.google.com/presentation/d/1aeQWBgd1XE7IRvgC-fkcs6ReL5H2qX5tAi4r66dusok/edit#slide=id.p

fun main() {
    val buah = Fruit(50)+ Fruit(10)
    println(buah)

    val buah2 = Fruit(100)

    val buah3 = buah + buah2

    println(buah3)
}