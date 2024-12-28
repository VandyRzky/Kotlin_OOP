package main

import Class.Gender

// representasi untuk class yang udah tetap nilainya
// penambahan atribut dan method jarang dilakukan

fun main() {
    val boy = Gender.Male
    val girl = Gender.Female

    val allGender: Array<Gender> = Gender.values()

    val boyFromString = Gender.valueOf("Male")
    val girlFromString = Gender.valueOf("Female")

    println(boy)
    println(girl)
    println(allGender.toList())
    println(boyFromString)
    println(girlFromString)

    boy.showDescription()
}