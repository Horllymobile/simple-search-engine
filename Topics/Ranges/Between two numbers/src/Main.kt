fun main() {
    // write your code here
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    val n3 = readln().toInt()

    val res = n1 in n2..n3
    println(res)
}