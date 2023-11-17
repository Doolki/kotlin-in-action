package ch03.study.study_3_2

import Maths.*
import strings.*
import strings.frist as fristNum


/* 3.2.1 */
fun <T> joinToString1(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}


/*
    3.2.2
    디폴트 파라메터를 다름과 같이 명시해주면 인자값을 다르게 넘겨주기위해 동일한 메서드에 오버로딩 작업을 할 필요가 없다
*/
fun <T> joinToString2(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String= "",
    postfix: String = ""
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

// [1,2,3] -> (1; 2; 3)
fun main(args: Array<String>) {

    val list = listOf(1,2,3);
    println(list);
    println("-----------------------------");

    //3.2.1 호출시 인자에 이름을 명시해서 간단하게 함수를 호출 가능하다 -> 각 문자열이 어떤 역할을 하는지 알수있다.
    println(joinToString1(list, separator=";", prefix="(", postfix=")"));
    println("-----------------------------");

    //3.2.2 호출시 오버로딩 (같은 이름의 메서드를 인자를 다르게 해서 여러번 정의) 할 필요없이 디폴트 파라메터값 명시로 이것을 해결
    println(joinToString2(list, separator=";", prefix="(", postfix=")"))
    println(joinToString2(list, separator=";", prefix="("));
    println(joinToString2(list, separator=";", postfix=")"));

    /* 3.2.3 유틸리티 함수로 호출 */
    println(add(1,2));
    println(joinToString4(list, separator=";", prefix="(", postfix=")"))

    /* 3.2.4 확장함수 & 임포트 함수 수정 */
    println("kotlin".fristNum());//수신객체 타입
    println("kotlin".test().fristNum());//확장함수
    println("kotlin".second());//확장함수
    println("Kotlin".fristNum());//임포트한 함수를 다른 이름으로 부를 수 있다.
}
