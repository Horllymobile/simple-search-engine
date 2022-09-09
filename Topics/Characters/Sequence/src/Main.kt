fun main() {
    // put your code here
    val n1: Char = readln().first()
    val n2: Char = readln().first()
    val n3: Char = readln().first()

    if (n1 + 1 == n2 && n2 + 1 == n3) {
        println(true)
    } else {
        println(false)
    }
}