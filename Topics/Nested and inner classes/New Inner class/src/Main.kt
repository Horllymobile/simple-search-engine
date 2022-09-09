class Vehicle(val _name: String) {
    val name: String = _name
    // create inner class Body
    inner class Body(val _color: String) {
        val color: String = _color;

        fun printColor() {
            println("The $name vehicle has a $color body.")
        }
    }
}