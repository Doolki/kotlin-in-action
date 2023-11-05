package ch01.study

class StaticallyTypedlanguage {
    var name: String? = null;
    var age: Int? = null;
}

fun sum(a: Int, b: Int): Int {
    return a + b;
}

fun add(a: Int, b: Int) = a + b;

fun printSum(a: Int, b: Int) {
    add(sum(3,4), 5);
}

