package ch03.study.study_3_3;

/*
    3.2.3 자바에서 유틸리티 클래스를 만들때 다음과 같이 설계
    유틸리티 클래스 : 유틸리티 클래스는 특정한 기능을 수행하는 정적 메서드들을 모아놓은 클래스로, 주로 상태를 갖지 않고 인스턴스를 생성할 필요가 없는 메서드들의 집합
*/

final class MathUtil {

    // Private 생성자를 추가하여 외부 인스턴스화 방지
    private MathUtil() {
        throw new AssertionError("No MathUtils instances for you!");
    }

    // 정적 유틸리티 메서드
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}