const val NUM = 20
fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val res = a + b == NUM || a + c == NUM || b + c == NUM
    println(res)
}
