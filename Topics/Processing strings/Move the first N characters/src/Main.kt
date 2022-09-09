fun main() {
    // write your code here
    val (s, n) = readln().split(" ")

    if (n.toInt() > s.length) {
        println(s)
    } else {
        val r = s.substring(0, n.toInt())
        val sub = s.substring(n.toInt())
        println(sub + r)
    }
}