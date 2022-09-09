fun makeMyWishList(wishList: Map<String, Int>, limit: Int): MutableMap<String, Int> {
    // write here
    val newList: MutableMap<String, Int> = mutableMapOf()
    for ((key, value) in wishList) {
        if (value <= limit) {
            newList[key] = value
        }
    }
    return newList
}
//
//fun main() {
//    val wishList: Map<String, Int> = mapOf(
//        "Orange" to 2,
//        "Apple" to 4,
//        "Mango" to 10
//    )
//
//    println(makeMyWishList(wishList, 5))
//}