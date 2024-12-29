package Class

import kotlin.properties.Delegates

class Account (descriptionParameter: String = "awal") {
    val name : String by lazy {
        println("lazy is called")
        "lazy"
    }
    var description: String by Delegates.observable(descriptionParameter){
        property, oldValue, newValue ->
        println("${property.name} from $oldValue to $newValue")
    }
}