package Class

sealed class Operation (val name: String)

class Plus: Operation ("Add")
class Min: Operation ("Minus")
