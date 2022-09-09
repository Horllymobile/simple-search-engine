fun solution(first: List<Int>, second: List<Int>): MutableList<Int> {
    // put your code here
    val combine: MutableList<Int> = mutableListOf()
    combine.addAll(first.toMutableList())
    combine.addAll(second.toMutableList())
    return combine
}
