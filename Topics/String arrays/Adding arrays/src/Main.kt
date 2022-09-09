fun main() {
    val firstArray = readLine()!!.split(' ').map { it }.toTypedArray()
    val secondArray = readLine()!!.split(' ').map { it }.toTypedArray()
    // do not touch the lines above
    // write your code here
    val stringArray = firstArray + secondArray
    println(stringArray.joinToString())
}