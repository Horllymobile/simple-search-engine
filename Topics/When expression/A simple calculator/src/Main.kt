fun main() {
    // write your code here
    val (n1, op, n2) = readln().split(" ")

    val num1 = n1.toLong()
    val num2 = n2.toLong()

    when (op) {
        "+" -> println(num1 + num2)
        "-" ->  println(num1 - num2)
        "/" -> {
            if (num1 < 1 || num2 < 1) {
                println("Division by 0!")
            }else {
                println(num1 / num2)
            }
        }
        "*" -> println(num1 * num2)
        else -> println("Unknown operator")
    }
}