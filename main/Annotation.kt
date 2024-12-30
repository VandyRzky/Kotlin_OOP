package main

import Class.Program


// menambahkan informasi tambahan ke kode yang dibuat
// diperlukan jika ingin membuat library atau framework
// properties hanya ada di constructur

fun main() {
    val program = Program(name="hello world", version = "1.1.1.1")
    println(program.info())
}