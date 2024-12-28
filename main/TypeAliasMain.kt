package main

import Class.Aplication

typealias app = Aplication
typealias SuperSuplier = () -> String
fun sayHell(suplier: SuperSuplier){
    println("hello ${suplier()}")
}

fun main() {
    val app1 = app

    app1.hello("budi")

    sayHell { "budi" }
}