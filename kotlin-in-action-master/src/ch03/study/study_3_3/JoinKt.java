package ch03.study.study_3_3;

import extension.function;
import Maths.MathFunctions;

public class JoinKt{

   public static void main(String args[]){

      System.out.println(mathUtil.add(1,2));//유틸리티 클래스
      System.out.println(MathFunctions.add(1,2));//유틸리티 함수

      MathFunctions.reportOperationCount();//유틸리티 함수내에 정적 필드로 활용


      System.out.println(function.lastChar2("kotlin"));
   }
}
