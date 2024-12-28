package main

import Class.Aplication
import Class.Utilities

// object yang hanya dibuat 1 kali
// mirip seperti class tetapi tidak memiliki constructor
fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("budi"))

    println(Aplication.Fitur.toLower("budi"))
}