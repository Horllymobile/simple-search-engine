// TODO: provide three functions here
fun identity(n: Int): Int = n
fun half(n: Int): Int = n / 2
fun zero(n: Int): Int = 0

fun generate(functionName: String): (Int) -> Int {
    // TODO: provide implementation here
    when (functionName) {
        "identity" -> return ::identity
        "half" -> return ::half
        "zero" -> return ::zero
    }
    return ::zero
}