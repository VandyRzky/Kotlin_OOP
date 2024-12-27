package main

import Class.Action

// membuat objek dari class yang belum lengkap (interface, abstract)

fun fireAction(action: Action){
    action.action()
}

fun main() {
    fireAction(object : Action{
        override fun action() {
            println("action fire")
        }
    })
}