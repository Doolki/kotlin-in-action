@file:JvmName("MathFunctions")
package Maths

fun add(a:Int,b:Int):Int{
    return a+b;
}

var multiplication = 1; //최상위 프로퍼티 사용

fun reportOperationCount(){ //정적 필드로 시스템이 초기화 될때까지 메모리에 남김
    multiplication++;
    println("Operation performed $multiplication times")
}

