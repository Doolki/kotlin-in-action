package ch03.study.study_3_3

import extension.second
import extension.test
import extension.frist as fristNum


// [1,2,3] -> (1; 2; 3)
fun main(args: Array<String>) {

    /* 3.3 확장함수 & 임포트 함수 수정 */
    println("kotlin".fristNum());//수신객체 타입
    println("kotlin".test().fristNum());//확장함수
    println("kotlin".second());//확장함수
    println("Kotlin".fristNum());//임포트한 함수를 다른 이름으로 부를 수 있다.
}
