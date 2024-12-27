package Class

class Boss (var name: String){ // outer class

    inner class Employee (var name: String){ // inner class

        fun introduceMySelf(){
            println("Hello, my name is $name, and my boss name is ${this@Boss.name}")
        }
    }
}