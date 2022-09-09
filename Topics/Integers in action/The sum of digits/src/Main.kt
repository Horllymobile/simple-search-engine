fun main() {
    // put your code here
    val num = readln().toInt()
    val div = 10
    val div1 = num % div
    val div2 = num / div % div
    val div3 = num / div / div
    
    println(div1 + div2 + div3)
}
