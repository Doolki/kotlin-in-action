package ch02.study

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
    val person = Person("sanghoon", false);
    println(person.name)
    println(person.isMarried)
    person.isMarried = true
    println(person.isMarried)
}

class Person(val name: String, var isMarried: Boolean)