import java.io.File
class Car(val make: String, val year: Int) {

    var speed: Int = 0

    // write the methods here
    fun accelerate() {
        this.speed += 5
    }

    fun decelerate() {
        this.speed -= 5
        if (this.speed < 0) {
            this.speed = 0
        }
    }
}


fun main() {
    val fileName = "new.txt"
    val linesLength = File(fileName).length()
    val lines = File(fileName).readLines().size
    print("$linesLength $lines")
}