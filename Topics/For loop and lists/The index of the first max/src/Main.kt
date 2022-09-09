fun main() {
    val size = readln().toInt()
    val mulist: MutableList<Int> = mutableListOf()

    for (i in 0 until size) {
        mulist.add(readln().toInt())
    }

    for (i in mulist.lastIndex downTo 0) {
        println("${mulist[i]}")
    }
}