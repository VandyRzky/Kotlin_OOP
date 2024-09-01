package Class

//inheritance
open class Employee (name: String){ //class parent
    var employeeName:String = name
    open var attend: Int = 15
    open var networth: Int = 5
    fun sayHello(){
        println("Hello $employeeName")
    }
    open fun work(){
        println("$employeeName using a notebook")
    }
}

class Manager (name: String): Employee(name){
    override var attend: Int = 20 //overriding properties
    override var networth: Int = 10
    var prntNethwork = super.networth

    override fun work(){ //overiding function
        println("$employeeName using a laptop")
        super.work() //"super" digunakan untuk mengambil function atau properties yang ada di class parrent
    }

    fun getStatus(){
        println("""attend = $attend
net worth = $networth
net worth parent = $prntNethwork""")
    }
}