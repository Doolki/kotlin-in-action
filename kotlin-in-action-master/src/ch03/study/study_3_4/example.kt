package ch03.study.study_3_4

class Number(val value: Int) {
    //infix는 내가 이 함수에 중위 호출 방식을 사용하겠다고 명시

    /*
    infix: 이 키워드는 함수가 중위 호출 문법으로 사용될 수 있음을 나타냅니다. 예를 들어, num1 add num2와 같은 형식으로 사용할 수 있습니다.
    fun: 함수를 정의하는 키워드입니다.
    add: 함수의 이름입니다.
    other: Number: 함수의 매개변수로, Number 타입의 객체를 받습니다. 이 매개변수는 현재 객체와 더해질 값입니다.
    Number(this.value + other.value): 현재 객체(this)의 value 속성과 매개변수 other의 value 속성을 더한 새로운 Number 객체를 반환합니다.
     */

    infix fun add(other:Number):Number{
        return Number(this.value + other.value);
    }

    /*
    infix fun add(other: Number): Number {
        return Number(this.value + other.value) //현재 객체와 다른 객체의 Value값을 더한 것 을 리턴
    }

     */

    // 구조 분해 선언을 위한 component1 함수.. (7.2절에서 다룰예정)
    operator fun component1() = this.value
    operator fun component2() = this.value  // 동일한 값을 반환
}
//infix fun <A, B> A.bo(that: B): Pair<A, B> = Pair(this, that)

infix fun Int.add(other:Int):Int{
    return this+other;
}

infix fun Int.to2(other:String):Pair<Int,String>{
    return Pair(this,other);
}

class Pair2(val a: Int, val b: String) {
    operator fun component1(): Int = a
    operator fun component2(): String = b
}



fun main(args: Array<String>) {

    /* 자바보다 더 많은 컬렉션 제공*/
    val String = listOf("frist","second","fourteenth");
    println(String.last()); //Array 컬렉션에서 더 많은 기능을 코틀린에서 제공

    val number = setOf(1,14,2)
    println(number.max());  //HashSet 컬렉션에서 더 많은 기능을 코틀린에서 제공

    /* 가변길이 인자 함수 */
    val List = listOf(2,3,4,5,6); //List에 원하는 만큼의 원소를 전달 가능(불변)
    println(List);

    /* 가변길이 인자 함수 */
    val List2 = arrayOf(2,3,4,5,6); //List에 원하는 만큼의 원소를 전달 가능 (가변)
    println(List2);

    val list = listOf("args: ", *args) //*args 연산자를 써 앞에 전달하려고 하는 내용을 리스트에 원소를 전달
    println(list)

    /* 중위 호출 */
    val map = mapOf(1 to "one", 7 to "seven",53 to "fifty-three");
    val map2 = mapOf(2 to "one","to" to "seven", 53 to "firty-three")
    println(map);
    println(map2);

    /*
        to 사용법 방식 둘의 코드는 동일하며 키와 쌍으로 나눠져있는것에서 쌍을 강조할때 ()를 씀
        to는 코틀린 키워드 가 아닌 메소드로 -> Pair는 코틀린 표준 라이브러리 클래스를 호출
        infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)
        자세한건 7.4절에 다룸
    */
    println(1 to "one");
    println(1.to ("one"));

    val good = 1 to2 "one"
    val(key,value) = good
    println("key : ${key} value: ${value} ")

    val good2 = Pair2(key,value)


    val num1 = Number(5);
    val num2 = Number(10);
    val result = num1 add num2
    val result2 = Number(10) add Number(20);
    println(result.value);
    println(result2.value);


    /* 구조 분해 호출 */

}


