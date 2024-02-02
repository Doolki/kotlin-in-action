package ch04.ex1_5_2_SealedClasses1

import java.lang.IllegalArgumentException

open class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
    class Multiple(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.left) + eval(e.right)
        is Expr.Multiple -> eval(e.left) * eval(e.right)
//        is Divide -> eval(e.left) / eval(e.right)
        else -> {throw IllegalArgumentException("error")}
    }

class Divide(val left: Expr, val right: Expr) : Expr()

fun main(args: Array<String>) {
    println(eval(Divide(Expr.Multiple(Expr.Num(4), Expr.Num(2)), Expr.Num(8))))
}
