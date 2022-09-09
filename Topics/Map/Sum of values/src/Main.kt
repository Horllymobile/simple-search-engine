fun summator(map: Map<Int, Int>): Int {
    // put your code here
    var sum = 0
    for ((key, value) in map) {
        if (key % 2 == 0) {
            sum += value
        }
    }
    return sum
}

//fun main() {
//    val map = mapOf(100 to 10, 55 to 3, 112 to 5)
//    println(summator(map))
//}