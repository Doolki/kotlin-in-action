package ch03.study.study_3_2;

import java.util.*;

import Maths.MathFunctions;
import strings.*;




class collection {
    //[1,2,3] -> (1; 2; 3)
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        System.out.println(list);
        System.out.println("-----------------------------");
        //3.2.1 각 문자열이 어떤 역할을 하는지 알 수 없다 -> 직접 함수 시크니쳐를 살펴봐야한다

        System.out.println(joinToString1(list, "; ", "(", ")"));
        System.out.println("-----------------------------");

        //3.2.2 동일한 메서드에 인자를 다르게 넘겨서 호출 할 경우가 생기는데 오버로딩 해서 다음과 같이 호출해줘야한다.
        System.out.println(joinToString(list)); // 매개변수 1개
        System.out.println(joinToString(list, "; ")); // 매개변수 2개
        System.out.println(joinToString(list, "; ", "(")); // 매개변수 3개
        System.out.println(joinToString(list, "; ", "(", ")")); // 매개변수 4개

        //3.2.3 유틸리티 함수로 직접 호출
        System.out.println(MathFunctions.add(1,2));
        System.out.println(StringFunctions.joinToString4(list, ";", "(", ")"));
    }


    /*
    3.2.1
     */
    public static <T> String joinToString1(
            Collection<T> collection,
            String separator,
            String prefix,
            String postfix) {

        StringBuilder result = new StringBuilder(prefix);

        int index = 0;
        for (T element : collection) {
            if (index > 0) result.append(separator);
            result.append(element);
            index++;
        }

        result.append(postfix);
        return result.toString();
    }


    /*
        3.2.2
        자바 코드를 보면 동일 메소드에 인자값을 다르게 넘겨줄때
        오버로딩해서 다음과 같이 처리를 해줘야하는 불편함이 있다.
    */
    public static <T> String joinToString(Collection<T> collection) {
        return joinToString(collection, ", ");
    }

    public static <T> String joinToString(Collection<T> collection, String separator) {
        return joinToString(collection, separator, "");
    }

    public static <T> String joinToString(Collection<T> collection, String separator, String prefix) {
        return joinToString(collection, separator, prefix, "");
    }

    public static <T> String joinToString(Collection<T> collection, String separator, String prefix, String postfix) {
        StringBuilder result = new StringBuilder(prefix);

        int index = 0;
        for (T element : collection) {
            if (index > 0) result.append(separator);
            result.append(element);
            index++;
        }

        result.append(postfix);
        return result.toString();
    }
}

/*
    특징: 구아바는 컬렉션, 캐싱, 프리미티브 지원, 동시성 라이브러리, 공통 어노테이션, 문자열 처리, I/O 등을 포함한 광범위한 유틸리티를 제공합니다.
    용도: 예를 들어, 구아바에서는 Joiner 클래스를 사용하여 컬렉션의 요소를 원하는 구분자로 연결할 수 있습니다. 이는 Java의 String.join 또는 java.util.stream.Collectors.joining과 유사한 기능을 제공하지만 더 많은 기능과 유연성을 가지고 있습니다.
    // 구아바를 사용한 문자열 합치기
    String joined = Joiner.on("; ").join(Arrays.asList(1, 2, 3));
    아파치 커먼즈 (Apache Commons)

    개발자: Apache Software Foundation
    특징: 아파치 커먼즈는 수학 연산, 파일 입출력, 문자열 처리, 네트워킹 등 다양한 목적의 유틸리티를 제공합니다.
    용도: 예를 들어, commons-lang 컴포넌트는 StringUtils 클래스를 제공하여 문자열 조작과 관련된 다양한 헬퍼 메서드를 사용할 수 있게 합니다.
    // 아파치 커먼즈를 사용한 문자열 체크
    boolean isNumeric = StringUtils.isNumeric("12345");
 */