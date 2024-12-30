package Class

data class Fruit(var qtty: Int){
    operator fun plus (fruit: Fruit):Fruit{
        return Fruit(this.qtty + fruit.qtty)
    }
}
