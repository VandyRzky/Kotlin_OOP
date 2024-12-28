package Class

enum class Gender (val description: String) {
    Male ("male"),
    Female ("female");

    fun showDescription(){
        println(this.description)
    }
}