package main

import Class.MyBase
import Class.MyBaseDelegate

// meneruskan properties / function ke class lainnya

fun main() {
    val base = MyBase()
    val baseDelegate = MyBaseDelegate(base)

    baseDelegate.sayHello("joko")
}