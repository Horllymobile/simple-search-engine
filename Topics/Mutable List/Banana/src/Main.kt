fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    // put your code here
    var count = 0
    while (count < strings.size) {
        if (strings[count] == str) {
            strings[count] = "Banana"
        }
        count += 1
    }
    return strings
}
