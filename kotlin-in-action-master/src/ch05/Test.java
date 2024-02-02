package ch05;
// 5.4.1 자바 메서드에 람다를 인자로 전달

public class Test {
    public static void newJavaMethod(NewFunctionalInterface functionalInterface) {
        // 함수형 인터페이스를 인자로 원하는 자바 메서드
        functionalInterface.newMethod();
    }

    public static void main(String[] args) {
        NewFunctionalInterface javaLambda = () -> System.out.println("This is Java lambda!");
        newJavaMethod(javaLambda);

    }
}
