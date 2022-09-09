fun main() {
    // put your code here
    val n = readln().toInt()
    var l = 0
    var s = 0
    var p = 0
    repeat(n) {
        val d = readln().toInt()
        if (d == 1) {
            l += 1
        } else if (d == 0) {
            p += 1
        } else if (d == -1) {
            s += 1
        }
    }
    println("$p $l $s")
}