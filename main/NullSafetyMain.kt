package main

data class Friend(val name: String)

fun sayHello (friend: Friend?){
    if (friend != null){
        println("Hello ${friend.name}")
    }
}

fun sayHi (friend: Friend?){ // elvis operator "?:"
    val name = friend?.name ?: ""
    println("hi $name")
}

fun main() {
    sayHello(Friend("budi"))
    sayHello(null)
    sayHi(Friend("budi"))
    sayHi(null)

}