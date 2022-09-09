fun containsKeyAndValue(map: Map<String, String>, value: String): Boolean {
    // put your code here
    return map.containsKey(value) && map.containsValue(value)
}

//fun main() {
//    val mapOne = mapOf("one" to "two", "three" to "one", "four" to "five")
//    val mapTwo = mapOf("10" to "20", "30" to "1", "55" to "23")
//    println(containsKeyAndValue(mapTwo, "55"))
//}