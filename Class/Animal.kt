package Class

abstract class Animal {
    abstract val name: String
    abstract fun run()
}

class Cat: Animal(){
    override val name: String = "Kucing"
    override fun run(){
        println("$name running")
    }
}