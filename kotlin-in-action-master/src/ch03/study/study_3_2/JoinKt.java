package ch03.study.study_3_2;

import strings.StringFunctions;
import Maths.MathFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JoinKt{


   public static void main(String args[]){
      List<Integer> list =  Arrays.asList(1,2,3);
      System.out.println(StringFunctions.joinToString(list,"; ","",""));

      System.out.println(MathUtil.add(1,2));//유틸리티 클래스
      System.out.println(MathFunctions.add(1,2));//유틸리티 함수
   }
}