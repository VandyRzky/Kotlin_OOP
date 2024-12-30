package main

import Class.Student

fun main() {
    val student = Student("budi", 15)
    var studentConstructor = student.let {
        "name: ${it.name}, age: ${it.age}"
    }
    // penggunaan let function
    student.let {
        println(it.name)
        println(it.age)
    }
    println(studentConstructor)

    //penggunaan run function
    var studentConstructor2 = student.run {
        "name: ${this.name}, age: ${this.age}"
    }
    println(studentConstructor2)

    // penggunaan apply function
    var studentConstructor3 = student.apply {
        "name: ${this.name}, age: ${this.age}"
    }
    println(studentConstructor3)

    //penggunaan also function
    var studentConstructor4 = student.also {
        "name: ${it.name}, age: ${it.age}"
    }
    println(studentConstructor4)

    //penggunaan with function
    with(student){
        println(this.name)
        println(this.age)
    }
}