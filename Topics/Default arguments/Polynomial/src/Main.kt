object Some {
    init {
        println("Hello")
    }
}

fun main() {
    val typ = arrayListOf<Int>(8, 0, 7, 6, 5)
    val list1 = arrayListOf<Int>(8)
    typ.removeAll(list1)
    typ.retainAll(list1)
}