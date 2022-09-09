package search
import java.io.File
import kotlin.system.exitProcess

enum class SearchStrategy {
    ALL,
    ANY,
    NONE
}

fun getStrategy(): SearchStrategy {
    println("Select a matching strategy: ALL, ANY, NONE")
    val option = readln().uppercase()
    return SearchStrategy.valueOf(option)
}

fun getWordsFromQuery(data: List<String>): MutableList<String> {
    val searchData: MutableList<String> = mutableListOf()
    for (i in data) {
        for (j in dataMap.keys) {
            if (i.lowercase() == j.lowercase()) {
                searchData.add(i)
            }
        }
    }
    return searchData
}

fun getSetFromSearchData(data: List<String>): MutableList<Int> {
    val foundSet: MutableList<Int> = mutableListOf()
    for (i in data) {
        if (dataMap.containsKey(i.lowercase())){
            for (j in dataMap[i.lowercase()]!!) foundSet.add(j)
        }
    }
    return foundSet
}

fun search() {
    val strategy = getStrategy()
    println("\nEnter a name or email to search all suitable people.")
    val data = readln().trim().split(" ")
    val searchData: MutableList<String> = getWordsFromQuery(data)
    val foundSet: MutableList<Int> = getSetFromSearchData(searchData)
    if (foundSet.size > 0) {
        when (strategy.name.lowercase()) {
            "ALL".lowercase() -> {
                println("1 person found:")
                for (i in foundSet) {
                    println(lst[i])
                    break
                }
            }
            "ANY".lowercase() ->{
                println("${foundSet.size} persons found:")
                for (i in foundSet) println(lst[i])
            }

            "NONE".lowercase() -> {
                val fakeList = lst.toMutableList()
                val found = mutableListOf<String>()
                for (i in foundSet) {
                    found.add(lst[i])
                }
                fakeList.removeAll(found)
                println("${fakeList.size} persons found:")
                for (i in fakeList) println(i)
            }
        }
    } else {
        println("No matching people found.")
    }
    menu()
}

fun printAll() {
    println("\n=== List of people ===")
    for (str in lst) println(str)
    menu()
}

fun exit() {
    println("Bye")
    exitProcess(0)
}

fun menu() {
    println("\n=== Menu ===\n1. Find a person\n2. Print all people\n0. Exit")

    var option = readln().toIntOrNull() ?: -1

    when(option.toInt()) {
        0 -> exit()
        1 -> search()
        2 -> printAll()
        else -> {
            println("Incorrect option! Try again.")
            menu()
        }
    }
}

var lst = mutableListOf<String>()
val dataMap = mutableMapOf<String, MutableList<Int>>()

fun readArgsToFile(args: Array<String>) {
    lst = File(args[1]).readLines().toMutableList()
    for (i in 0 until  lst.size) {
        for (str in lst[i].split(" ")) {
            if (dataMap.containsKey(str.lowercase())) dataMap[str.lowercase()]!!.add(i)
            else dataMap[str.lowercase()] = mutableListOf(i)
        }
    }
}


fun main(args: Array<String>) {
    readArgsToFile(args)
    menu()
}