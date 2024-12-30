package main

import Class.ValidationExeption

fun validateSayHello (name: String){
    if (name.isBlank()){
        throw ValidationExeption("name is blank")
    }else{
        println("hello $name")
    }
}

fun main() {
    try {
        validateSayHello("")
    } catch (error: ValidationExeption){
        println("error with massage ${error.message}")
    } catch (error: Throwable){
        println("error with massage ${error.message}")
    } finally {
        println("next")
    }
}