fun iterator(map: Map<String, Int>) {
    // put your code here
    for ((k, v) in map) {
        if (v % 3 == 0) {
            println("Fizz")
        } else if (v % 5 == 0) {
            println("Buzz")
        }else{
            println("FizzBuzz")
        }
    }
}

//fun main() {
//    val map = mapOf(
//        "one" to 1,
//        "two" to 2,
//        "three" to 3,
//        "four" to 4,
//        "five" to 5,
//        "six" to 6,
//        "fifteen" to 15
//    )
//    iterator(map)
//}