object Math {
    fun abs(n: Int): Int {
        if (n == 0) {
            return 0
        }
        return kotlin.math.abs(n)
    }

    fun abs(n: Double): Double {
        if (n == 0.0) {
            return 0.0
        }
        return kotlin.math.abs(n)
    }
}
