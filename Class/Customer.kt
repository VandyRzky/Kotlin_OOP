package Class

open class Customer (val name: String, val type: String, val balance: Int) {
    constructor(name: String, type: String) : this(name, type, 0)
    constructor(name: String): this(name, "Standart")
}

class PremiumCustomer: Customer{
    constructor(name: String) : super(name, "premium")
    constructor(name: String, balance: Int) : super(name, "premium", balance)

}