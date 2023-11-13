package ch02.study
import ch02.study.Color.*
import java.lang.Exception

// 식을 위한 인터페이스
interface Expr
// value 프로퍼티만 존재하는 단순 클래스
class Num(val value: Int) : Expr
// Expr 타입 객체라면 어떤 것이는 Sum의 인자
// Num이나 Sum이 인자로 올 수 있음
class Sum(val left: Expr, val right: Expr) : Expr

fun main(args: Array<String>){
    // 대입문을 식으로 사용하려는 시도
    /*var a: Int
    var b = (a = 5)*/

    // unresolved reference 에러
    /*val message = "kotlin"
    println("Hello, $message");
    println("안녕 $message아 ?");
    println("안녕 ${message}아 ?");*/

    // getter, setter 기본 제공
    /*val person = Person("sanghoon", false);
    println(person.name)
    println(person.isMarried)
    person.isMarried = true
    println(person.isMarried)*/

    // 커스텀 접근자 사용하기
    /*val rectangle = Rectangle(41, 41)
    println(rectangle.isSquare)

    println(Color.RED.rgb())*/

    // enum을 when으로 활용하기
    /*println(getMnemonicV1(Color.RED))
    println(getMnemonicV2(Color.RED))
    println(getMnemonicV3(RED))*/

    // when의 분기 조건에 객체 사용하기
    /*println(mix(BLUE, YELLOW))*/

    // 분기에 블록 사용
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}

class Person(val name: String, var isMarried: Boolean)

class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean
        get() = height == width
}

enum class Color (
    val r: Int, val g: Int, val b: Int
){
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238); // 반드시 세미콜론을 써야함
    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonicV1(color: Color) = when(color){
    // 색이 특정 enum 상수와 같을 때, 그 상수에 대응하는 문자열 return
    Color.RED -> "Richard"
    Color.ORANGE -> "Of"
    Color.YELLOW -> "York"
    Color.GREEN -> "Gave"
    Color.BLUE -> "Battle"
    Color.INDIGO -> "In"
    Color.VIOLET -> "Vain"
}

fun getMnemonicV2(color: Color) = when (color) {
    // 색이 특정 enum 상수와 같을 때, 그 상수에 대응하는 문자열 return
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}

fun getMnemonicV3(color: Color) = when (color) {
    // 색이 특정 enum 상수와 같을 때, 그 상수에 대응하는 문자열 return
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(BLUE, VIOLET) -> INDIGO
    else -> throw Exception("Dirty color")
}

fun mixOptimized(c1: Color, c2: Color) = when {
    (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED)
        -> ORANGE
    (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW)
        -> GREEN
    (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE)
        -> INDIGO
    else -> throw Exception("Dirty color")
}

fun evalV1 (e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        evalV1(e.right) + evalV1(e.left)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun evalV2 (e: Expr): Int =
    when(e){
        is Num ->
            e.value
        is Sum ->
            evalV2(e.right) + evalV2(e.left)
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun evalWithLogging (e: Expr): Int =
    when(e){
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sum: ${left}+${right}")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown expression")
    }