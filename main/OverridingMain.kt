package main

import Class.Manager

fun main() {
    val emp = Manager("hero")
    emp.work()
    println(emp.attend)
    emp.getStatus()
}