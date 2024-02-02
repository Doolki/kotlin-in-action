package ch05.ex2_4_2_FlatMapFlatten1

class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
                       Book("Mort", listOf("Terry Pratchett")),
                       Book("Good Omens", listOf("Terry Pratchett",
                                                 "Neil Gaiman")))
    println(books.flatMap { it.authors }.toSet())
    println(books.map { it.authors }.flatten().toSet())

    val numbers = listOf(listOf(1,2,3), listOf(5,6,7), listOf(8,9,0))
    println(numbers.flatten())
    println(numbers.flatMap { it.map { value -> value*2 } })


}
