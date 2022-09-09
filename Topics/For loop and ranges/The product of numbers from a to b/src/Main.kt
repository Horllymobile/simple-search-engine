fun main() {
    // put your code here
    val a = readln().toLong()
    val b = readln().toLong()
    var result: Long = 1
    for(i in a until b) {
        result *= i
    }
    println(result)
}