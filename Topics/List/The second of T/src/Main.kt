fun solution(names: List<String>): Int {
    // put your code here
    var index = 0
    for (i in names.indices step 2) {
        if (names[i].startsWith("T")) {
            index = names.indexOf(names[i]) + 1
        }
    }
    return index
}

//fun main() {
//    val names = listOf<String>("Test", "Kora", "Terra", "Tetta", "Garry")
//    println(solution(names))
//}