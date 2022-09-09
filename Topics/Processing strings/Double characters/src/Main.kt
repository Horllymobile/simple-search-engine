fun main() {
    // write your code here
    val n = readln()
    var str = ""
    for (i in n.indices) {
        str += "${n[i]}${n[i]}"
    }
    println(str)
}