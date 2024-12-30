package main

import Class.Employee
import Class.Manager

fun main() {
    var employee = Employee("budi")
    employee.work()

    employee = Manager("budi")
    employee.work()
}