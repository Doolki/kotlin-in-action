package ch03.study.study_3_2;

import java.util.*;


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
