import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    // put your code here
    val n = readln().toInt()
    var c = 1
    while (c <= n) {
        val sq = c * c
        if (sq <= n) {
            println(sq.toInt())
        }
        c += 1
    }
}