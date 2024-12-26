package Class

open class Teacher (name: String){
    private fun teach(){
        println("teach")
    }
    open protected fun test(){
        println("test")
    }
}
class SuperTeacher(name: String): Teacher(name){

    override public fun test(){
        super.test()
    }
}
