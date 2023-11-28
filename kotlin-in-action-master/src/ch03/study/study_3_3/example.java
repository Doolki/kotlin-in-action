package ch03.study.study_3_3;

import Maths.MathFunctions;
import extension.*;
import ch03.study.study_3_3.example;


public class example {
    public static void main(String[] args) {

        /* 자바에서 코틀린 확장함수 호출 */
        MathFunctions.add(1,2);

        /* 프로퍼티 활용 */
        MathFunctions.reportOperationCount();//유틸리티 함수내에 정적 필드로 활용
        MathFunctions.getMultiplication();

        /* extension 메소드의 유틸리티 함수를 모두 가져와서 임포트 */
        System.out.println(function.lastChar2("kotlin"));
        System.out.println(function.second("kotlin"));


    }
}
