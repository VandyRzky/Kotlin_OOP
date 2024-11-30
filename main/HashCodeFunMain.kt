package main

import Class.Company

//hashCode digunakan untuk mengkonversi objek menjadi angka

fun main(){
    val company1 = Company("joko")
    val company2 = Company("joko")


    println(company1.hashCode())
    println(company2.hashCode())
    println(company1.hashCode() == company2.hashCode())
}