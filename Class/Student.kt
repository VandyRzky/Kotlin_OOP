package Class

class Student (var name: String, val age: Int)

fun Student.sayHello(name: String){
    println("Hello $name, my name is ${this.name} and my age is ${this.age}")
}

fun Student?.sayGoodBye(name: String){
    if(this != null){
        println("Good bye $name")
    }
    else{
        println("error")
    }
}

val Student.upperName : String
    get() = this.name.toUpperCase()

var Student.inputName: String
    get() = this.name
    set(value) {
        this.name = value
    }
