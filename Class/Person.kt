package Class

class Person (firstNameParam: String, lastNameParam: String) {
    var firstName: String = firstNameParam
    var lastName: String = lastNameParam

    init { //Initializer Block
        println("Objek berhasil dibuat")
    }

    //function dalam class
    fun sayHello(){
        println("Hello $firstName")
    }
    fun greetingPeople(firstName: String){
        println("Hello $firstName, my name is ${this.firstName}")
        //this digunakan untuk ngambil atribut dalam class person
    }


}