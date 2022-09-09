fun main() {
    // put your code here
    val n = readln().toInt()
    var p = 0

    repeat(n) {
        val num = readln().toInt()

        if (num > 0) {
            p += 1
        }
    }

    println(p)
}