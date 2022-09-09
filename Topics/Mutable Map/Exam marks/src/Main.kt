fun main() {
    val studentsMarks = mutableMapOf<String, Int>()
    var read: String = readln()
    while (read != "stop") {
        if (!studentsMarks.containsKey(key)) {
            val value = readln()
            studentsMarks[key] = value.toInt()
            key = readln()
        } else {
            key = readln()
            continue
        }
    }
}