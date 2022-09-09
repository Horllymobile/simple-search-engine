fun main() {
    // write your code here
    val n: Char = readln().first()

    if (n.isUpperCase()) {
        println(true)
    } else if (n.isDigit() && n in '\u0031'..'\u0039') {
        println(true)
    }
    else {
        println(false)
    }
}