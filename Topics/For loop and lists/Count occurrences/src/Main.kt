fun main() {
    // write your code here
    val list = MutableList(readln().toInt()) { readln().toInt() }
    val m = readln().toInt()

    var count = 0

    for (i in list.indices) {
        if (m == list[i]) {
            count += 1
        }
    }
    println(count)
}