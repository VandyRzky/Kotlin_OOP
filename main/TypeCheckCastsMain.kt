package main

import Class.Person

class Tes(val name: String){
    override fun toString(): String {
        return name
    }
}

fun printObject(any:Any) {
    if (any is Person) {
        println(any.firstName)
    }else{
        val str = any as? String //cast
        println(str)
        //println(any)
    }
}


fun main() {
    printObject(Person("qqq", "wwww"))
    printObject("pppppp")
    printObject(1)

    val coba = Tes("qq")
    println(coba)
}