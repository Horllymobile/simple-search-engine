const val NEW = 20_000
const val YEARS = 2_000
const val MAXIMUM_SPEED = 120
const val MAXIMUM_SPEED_DISCOUNT = 100
const val KILOMETERS = 10_000
const val KILOMETERS_DISCOUNT = 200
const val AUTOMATIC = 1500

fun carPrice(
    old: Int = 5,
    kilometers: Int = 100_000,
    maximumSpeed: Int = 120,
    automatic: Boolean = false
) {
    var lastPrice = NEW
    // years
    repeat(old) {
        lastPrice -= YEARS
    }
    // maximum speed
    lastPrice += (maximumSpeed - MAXIMUM_SPEED) * MAXIMUM_SPEED_DISCOUNT
    // kilometers
    var kilometersRest = kilometers
    while (kilometersRest >= KILOMETERS) {
        kilometersRest -= KILOMETERS
        lastPrice -= KILOMETERS_DISCOUNT
    }
    // automatic
    if (automatic) lastPrice += AUTOMATIC
    // print the price result
    println(lastPrice)
}