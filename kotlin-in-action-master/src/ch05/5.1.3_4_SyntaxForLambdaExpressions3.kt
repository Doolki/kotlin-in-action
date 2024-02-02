package ch05.ex1_3_4_SyntaxForLambdaExpressions3

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    val names = people.joinToString(separator = " ",
                          transform = { p: Person -> p.name })
    println(names)
    println(people.maxBy { it.age })
    val list = listOf("a", "b", "c", "d", "e")

    val listToString = list.joinToString(
            separator = ","
            , prefix = "["
            , postfix = "]"
            , limit = 3
            , truncated = "etc"
            , transform = { it.toUpperCase() }
    )

    println(listToString) // [A,B,C,etc]


}
