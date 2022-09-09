import java.util.Scanner

fun printPrecedingAlphabets(alpha: Char) {
    var a = 'a'.code
    while (a < alpha.code) {
        print(a.toChar())
        a += 1
    }
}

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val n = scanner.next().single()
    printPrecedingAlphabets(n)
}