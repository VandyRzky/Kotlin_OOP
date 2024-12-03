package main

import Class.Note

fun main() {
    val note1  = Note("Halo", "Woi")

    println(note1.title)
    println(note1.name)

    note1.name = "Hola"

    println(note1.name)

    note1.title = "hehe"
    println(note1.title)
    println(note1.bigTitleParam)
    println(note1.bigTitle)
}