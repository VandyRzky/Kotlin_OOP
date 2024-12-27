package main

import Class.Boss

// class di dalam class

fun main() {
    val boss1 = Boss("joko")
    val empoyee1 = boss1.Employee("budi")

    empoyee1.introduceMySelf()
}