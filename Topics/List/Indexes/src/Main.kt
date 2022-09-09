fun solution(products: List<String>, product: String) {
    val founds = mutableListOf<Int>()
    var count = 0
    while (count < products.size) {
        if (products[count] == product) {
            founds.add(count)
        }
        count += 1
    }
    for (found in founds) {
        print("$found ")
    }
}

//fun main() {
//    val products = listOf<String>("Mustard", "Cheese", "Eggs", "Cola", "Eggs")
//    solution(products, "Eggs");
//}