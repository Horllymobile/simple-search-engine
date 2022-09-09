fun main() {
    // write your code here
    val operand1 = readln()
    val operator = readln()
    val operand2 = readln()

    when (operator) {
        "equals" -> println(operand1 == operand2)
        "plus" -> println(operand1 + operand2)
        "endsWith" -> println(operand1.endsWith(operand2))
        else -> println("Unknown operation")
    }
}