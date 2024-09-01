package Class

class Car {
    var brand: String = ""
    var model: String = ""

    constructor(brandParam: String, modelParam: String) {
        println("Secondary Constructor")
        brand = brandParam
        model = modelParam
    }

    fun helloUser(firstNameUser: String){
        println("Hello $firstNameUser, you using a $model")
    }
    fun helloUser(firstNameUser: String, lastNameUser: String){
        println("Hello $firstNameUser $lastNameUser, you using a $model")
    }

}