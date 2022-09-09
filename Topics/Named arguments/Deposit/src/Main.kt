import kotlin.math.pow

fun calculateCompoundInterest(amount: Int = 1000, percent: Int = 5, years: Int = 10): Int {
    val finalAmount = amount * (1 + 5 / 100).toDouble().pow(years.toDouble())
    return finalAmount.toInt()
}
fun main() {
    // write your code here
    println(calculateCompoundInterest())
}