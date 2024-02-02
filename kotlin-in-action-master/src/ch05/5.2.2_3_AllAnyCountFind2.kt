package ch05.ex2_2_3_AllAnyCountFind2

data class Person(val name: String, val age: Int)

val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main(args: Array<String>) {
    val people = listOf(Person("Cindy", 24), Person("Alice", 25), Person("Bob", 31))
    println(people.find(canBeInClub27))
    println(people.findLast(canBeInClub27))

    println(people.count(canBeInClub27))

    println(people.groupBy(canBeInClub27))
    println(people.groupBy { it.age })

    people.groupBy { it.age }
}
