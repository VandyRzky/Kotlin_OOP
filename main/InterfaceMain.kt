package main

import Class.Human
import Class.Testing

fun main() {
    val human = Human ()

    human.sayHello("budi")
    println(human.name)

    human.name = "joko"

    println(human.name)
    human.sayHello("budi")

    human.introduceMyName()

    human.go()

    val testing = Testing()

    testing.go()
    testing.turnArround()


}