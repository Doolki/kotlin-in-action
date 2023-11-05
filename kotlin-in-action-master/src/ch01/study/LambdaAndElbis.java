package ch01.study;


import java.util.ArrayList;
import java.util.List;

public class LambdaAndElbis {

    private static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        final Person a = new Person("a", 1);
        final Person b = new Person("a", null);
        List<Person> list = new ArrayList<>();
        list.add(a);
        list.add(b);

        Person maxPerson = list.stream().max((o1, o2) -> {
            if (o1.getAge() == null) {
                return 0;
            }
            if (o2.getAge() == null) {
                return 0;
            }
            return o1.getAge().compareTo(o2.getAge());
        }).get();

        System.out.println(maxPerson.getName());
    }
}
