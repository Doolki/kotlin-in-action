package ch03.study.study_3_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

class example {
    public static void main(String[] args) {

        // List<String> stringList = Arrays.asList("frist","second","fourteenth");
        // 마지막 원소 호출
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("first");
        stringList.add("second");
        stringList.add("fourteenth");

        System.out.println(stringList.get(stringList.size() - 1));

        //최대값 구하기
        Set<Integer> number = new HashSet<>();
        number.add(1);
        number.add(14);
        number.add(2);

        int max = Integer.MIN_VALUE;
        for (int num : number) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);


        /*
         가변 길이
         가변 인자(Varargs)를 사용하여 메서드를 호출할 때 다양한 수의 인수를 전달할 수 있도록 하는 기능
         */

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        System.out.println(arrayList);

        // *연산자 없이 args:의 내용을 arrayList에 넣어주려면 다음과 같은 과정 필요
        List<String> list = new ArrayList<>();
        list.add("args: ");
        list.addAll(Arrays.asList(args));
        System.out.println(list);
    }
}