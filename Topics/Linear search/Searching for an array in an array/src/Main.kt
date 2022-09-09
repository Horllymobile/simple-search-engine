// write your code here
fun countTwoArrays(array1: MutableList<Int>, array2: MutableList<Int>): Int {
    var count = 0
    for (i in array1) {
        for (j in array2) {
            count ++
            if (i == j) {
                break
            }
        }
    }
    return count;
}

fun main(args: Array<String>) {
    val first = readln().split(" ").map { it.toInt() }.toMutableList()
    val second = readln().split(" ").map { it.toInt() }.toMutableList()
    println(countTwoArrays(first, second))
}
