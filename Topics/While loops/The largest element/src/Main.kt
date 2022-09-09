fun main() {
    // put your code here
    var current = 0
    do {
        val n = readln().toInt()
        if (n > current) {
            current = n
        }
    } while (n != 0)
    println(current)
}

