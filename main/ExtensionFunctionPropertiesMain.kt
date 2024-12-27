package main

import Class.*

// bukan bagian dari class itu sendiri, dia gk bisa akses properties yang visibilitynya selain public

fun main() {
    val joko = Student("joko", 15)

    joko.sayHello("budi")
    joko.sayGoodBye("budi")

    println(joko.upperName)

    joko.inputName = "budi"
    println(joko.upperName)
    joko.sayHello("joko")
}