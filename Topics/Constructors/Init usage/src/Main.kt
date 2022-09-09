fun main() {
    val timerValue = readLine()!!.toInt()
    val timer = ByteTimer(timerValue)
    println(timer.time)
}

class ByteTimer(var _time: Int) {
    var time: Int = 0
    init {
        if (_time < -128) {
            time = -128
        } else if (_time > 127) {
            time = 127
        } else {
            time = _time
        }
    }
}