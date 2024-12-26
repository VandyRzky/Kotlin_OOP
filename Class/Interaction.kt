package Class

//inisialisasi interface
//interface dapat memiliki sifat inheritance
interface Interaction { //mirip abstract class
    var name: String
    fun sayHello(name: String)
    fun introduceMyName(){
        println("My name is ${this.name}")
    }
}

interface Go{
    fun go(){
        println("I'm walking")
    }
}

interface Movement: Go{
    fun turnArround(){
        println("I'm turning arround")
    }
}

class Human(): Interaction, Go{ //satu class dapat memiliki banyak interface
    override var name: String = "Manusia"
    override fun sayHello(name: String) {
        println("Hello $name")
    }
}

class Testing(): Movement
