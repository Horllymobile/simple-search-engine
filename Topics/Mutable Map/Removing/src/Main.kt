fun removing(currentMap: MutableMap<Int, String>, value: String): MutableMap<Int, String> {
    // Write your code here. Do not print the result of the function! 
    val nMap: MutableMap<Int, String> = mutableMapOf()
    for ((k, v) in currentMap) {
        if (value != v){
            nMap[k] = v
        }
    }
    return nMap
}

//fun main() {
//    val map = mutableMapOf(0 to "Sun", 3 to "Earth", 1 to "Mercury", 2 to "Sun")
//    println(removing(map, "Sun"))
//}