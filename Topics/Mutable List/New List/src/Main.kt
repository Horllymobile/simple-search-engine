fun solution(numbers: List<Int>, number: Int): MutableList<Int> {
    // put your code here
    val result = mutableListOf<Int>()
    result.addAll(numbers.toMutableList())
    result.add(number)
    return result
}