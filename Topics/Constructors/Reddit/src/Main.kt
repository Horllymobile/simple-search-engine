class Site(val address: String, val foundationYear: Int)

// Write the makeReddit function here
const val YEAR = 2005
fun makeReddit(): Site {
    val siteName = "reddit.com"
    val year = YEAR
    return Site(siteName, year)
}