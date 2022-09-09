fun main() {
    // put your code here
    val combination = readln()

    for (i in combination) {
        if (i.isDigit()) {
            println(i)
            break
        }
    }
}