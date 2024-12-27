package main

import Class.Product

// untuk nyimpan data
//fungsi bawaan untuk data class, seperti toString(), equals(), hashCode(), dan copy()
fun main() {
    val product = Product("indomie", 5000, "makanan")

    val product2 = product.copy(name = "mie sedap")
    println(product)
    println(product2)
}