val VOWEL = mutableListOf('a', 'e', 'i', 'o', 'u', 'y')
const val THRESHOLD = 3
fun main() {
    // write your code here
    val n = readln()
    var count = 0
    var countVowel = 0
    var countCons = 0

    for (i in n) {
        if (i in VOWEL) {
            countVowel += 1
            countCons = 0
        } else {
            countCons += 1
            countVowel = 0
        }
        if (countVowel == THRESHOLD || countCons == THRESHOLD) {
            count += 1
            countCons = 1
            countVowel = 1
        }
    }
    println(count)
}
