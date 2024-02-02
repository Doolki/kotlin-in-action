package ch05.ex1_4_1_AccessingVariablesInScope

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    var count = 0
    val countFinal = 0
    var lamba1 = messages.forEach {
        count ++
        println("$countFinal $count $prefix $it")
    }
}

fun plusOne(): () -> Unit {
    var counter = 0
    val inc = {
        counter++
        println(counter)
    }
    return inc
}

fun plusOne2() = run {
    var counter = 0
    val inc = {
        counter++
        println(counter)
    }
    inc
}



fun main(args: Array<String>) {
//    val errors = listOf("403 Forbidden", "404 Not Found")
//    printMessagesWithPrefix(errors, "Error:")

//    plusOne()()
//    plusOne()()
//    plusOne()()

    val a = plusOne()
    println(a)
    a()
    a()
    a()

    val b = plusOne2()
    b()
    b()
    b()

}
