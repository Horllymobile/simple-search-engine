const val HUNDRED_PERCENT = 100

fun main() {
    // write your code here
    val n = readln()

    var gc = 0

    for (i in n.indices) {
        if (n[i].lowercase() == "g" || n[i].lowercase() == "c") {
            gc += 1
        }
    }
//    println(gc)
    val result = gc.toDouble() / n.length * HUNDRED_PERCENT
    println(result)
}