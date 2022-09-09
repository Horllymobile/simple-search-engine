fun main() {
    // write your code here
    var year = readln().toInt()

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        println("Leap")
    } else {
        println("Regular")
    }

    fun sum(a: Int, b: Int): Int = a + b
    val sumObject: (Int, Int) -> Int = ::sum
}