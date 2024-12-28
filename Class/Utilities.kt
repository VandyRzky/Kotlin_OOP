package Class

object Utilities {
    val name = "utilities"

    fun toUpper(value: String): String{
        return value.toUpperCase()
    }
}

class Aplication{
    object Fitur{
        val name = "fitur"

        fun toLower(value: String): String{
            return value.toLowerCase()
        }
    }
    companion object{
        fun hello(name: String){
            println("Hello $name")
        }
    }

}