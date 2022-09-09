//fun main(args: Array<String>) {
//    if (args.size == 3) {
//        for (i in args.indices) {
//            println("Argument ${i+1}: ${args[i]}. It has ${args[i].length} characters")
//        }
//    }else {
//        println("Invalid number of program arguments")
//    }
//}

val A: IntArray = intArrayOf(677,591,153,356,617,337,195,948,440,657,631,546,148,678)
fun alive(a: IntArray) {
    var f = false
    var x = a[1]

    for (i in a.indices) {
        if ((a[i] % 2 == 0) && !f) {
            x = a[i]
            f = true
        } else if (a[i] < x && a[i] % 2 == 0) {
            x = a[i]
        }
    }
    if (!f) {
        println(0)
    }else {
        println(x)
    }
}

fun main() {
    alive(A)
}