fun main() {
    val numbers = IntArray(100)
    numbers[numbers.first()] = 1
    numbers[9] = 10
    numbers[numbers.lastIndex] = 100
    // do not touch the lines below
    println(numbers.joinToString())
}