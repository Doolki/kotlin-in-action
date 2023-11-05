package ch01.study


//* 데이터 클래스
data class Person(var name: String, var age: Int? = null)

//fun main(args: Array<String>) {
//    val person = Person("Alice")
//    person.age = 29
//    println(person) // Person(name=Alice, age=29)
//    println(person.name) // Person(name=Alice, age=29)
//    println(person.age ?: "is null") //  age=29
//}



//* 이름 붙인 파리미터

//fun main(args: Array<String>) {
//    val person = Person(age = 11, name = "Alice");
//    println(person) // Person(name=Alice, age=11)
//}

//* 람다식과 엘비스 연산자
//fun main(args: Array<String>) {
//    val persons = listOf(Person("Alice"), Person("Bob", age = 29))
//
//    val oldest = persons.stream().max {p1, p2 -> p1.age?:0.compareTo(p2.age?:0) }.get()
//
//    println("The oldest is: $oldest")
//}
//


//* 문자열 템플릿
fun main(args: Array<String>) {
    val oldest = "ok"

    println("The oldest is: $oldest")
}
//* toString 자동생성
