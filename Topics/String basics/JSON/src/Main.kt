fun main() {
    // put your code here
    val spell = "abra"
    println((spell + "cad").repeat(spell.length) + spell)
    println("""
        {
            "firstName": "John",
            "lastName": "Smith",
            "age": 35,
            "phoneNumbers": [
                {
                    "type": "mobile",
                    "number": "123 567-7890"
                }
            ]
        }
    """.trimIndent())
}