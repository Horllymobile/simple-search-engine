fun helpingTheRobot(purchases: Map<String, Int>, addition: Map<String, Int>): MutableMap<String, Int> {
    //write your code here
    val nMap: MutableMap<String, Int> = mutableMapOf()
    nMap.putAll(purchases.toMutableMap())
    for ((k, v) in addition) {
        nMap[k] = (nMap[k] ?:0) + v
    }
    return nMap
}

//fun main() {
//    val purchases: Map<String, Int> = mapOf("bread" to 1, "potatoes" to 7, "milk" to 2)
//    val addition: Map<String, Int> = mapOf("milk" to 5, "water" to 3, "bread" to 4)
//
//    println(helpingTheRobot(purchases, addition))
//}