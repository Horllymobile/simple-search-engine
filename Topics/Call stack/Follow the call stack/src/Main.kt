
fun printIfPrime(number: Int): Boolean {
    for (i in 2 until number / 2) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}

fun main(args: Array<String>) {
    // write here
    val n = readln().toInt()
    val isPrime = printIfPrime(n)
    if (isPrime) {
        println("$n is a prime number.")
    } else {
        println("$n is not a prime number.")
    }
}