package ch03

import ch03.study.*

var set3 = hashSetOf(1, 1, 53)
val list3 = arrayListOf(1, 1, 53)
val map3 = hashMapOf(1 to "one", 7 to "one", 53 to "fifty-three")

fun main(args: Array<String>) {
    println(set3.javaClass)
    println(list3.javaClass)
    println(map3.javaClass)
}
