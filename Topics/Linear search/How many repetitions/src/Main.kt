// write your code here
fun checkOccurence(number: Int, array: MutableList<Int>): Int {
    var count = 0
    for (i in array) {
        if (i == number) {
            count++
            continue
        }
    }
    return count;
}
fun main(args: Array<String>) {
  // put your code here
    val num = readln().toInt()
    val nums = readln().split(" ").map { it.toInt() }.toMutableList()
    println(checkOccurence(num, nums))
}
