fun main() {
    // write your code here
    val list = MutableList(readln().toInt()) {
        readln().toInt()
    }
    var count = 0

    for (i in 0 until list.size - 2) {
        if (list[i] + 1 == list[i + 1] && list[i] + 2 == list[i + 2]) {
            count++
        }
    }
    println(count)
}