package main

import Class.Min
import Class.Operation
import Class.Plus

// didisain untuk inheritance, merupakan abstract class

fun operation (value1: Int, value2: Int, operation: Operation): Int{
    return when (operation){
        is Plus -> value1 + value2
        is Min -> value1 - value2
    }

}
fun main() {
    println(operation(10, 10, Plus()))
    println(operation(15, 10, Min()))
}
