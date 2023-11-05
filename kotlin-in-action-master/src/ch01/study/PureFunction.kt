package ch01.study


/**
 * 순수 함수에 대한 설명 참조
 * */
var number: Int = 0;
fun sums(a: Int, b: Int): Int {
    return a + b;
}

fun notPureFunction(): Int {
    number++
    return number + 1;
}


fun main(args: Array<String>) {
    println(notPureFunction())
    println(notPureFunction())
    println(sums(3, 4))
    println(sums(3, 4))
}
