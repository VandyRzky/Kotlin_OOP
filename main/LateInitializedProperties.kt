// gk disarankan untuk dipake

package main

import Class.Television

fun main() {
    val tv1 = Television()

    tv1.innitName("samsung")

    println(tv1.name)

    tv1.name = "sony"

    println(tv1.name)
}