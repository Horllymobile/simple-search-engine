fun solution(strings: List<String>, str: String): Int {
    // put your code here
    var found = 0
    for (i in strings) {
        if (i == str) {
            found += 1
            continue
        }
    }
    return found
}


fun main() {
    val names = listOf<String>("Fred", "Pola", "Mike", "Fred")
    println(solution(names, "Fred"))
}