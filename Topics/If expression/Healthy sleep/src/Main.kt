fun main() {    
    // write your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val h = readln().toInt()

    if (h >= b) {
        println("Excess")
    }

    if ((h > a) && (b > h)) {
        println("Normal")
    }

    if (h < a && h < b) {
        println("Deficiency")
    }
}