package ch03.study.study_3_3;

public class property {
    private int myProperty = 0; // 가변 프로퍼티 (getter와 setter가 자동 생성됨)
    private final String readOnlyProperty = "Hello"; // 읽기 전용 프로퍼티 (getter만 자동 생성됨)
    private char lastAt;

    public int getMyProperty() {
        return myProperty;
    }

    public void setMyProperty(int myProperty) {
        this.myProperty = myProperty;
    }

    public String getReadOnlyProperty() {
        return readOnlyProperty;
    }
    public void LastChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String must not be null or empty");
        }
        lastAt = str.charAt(str.length() - 1);
    }

    public char getLastChar(){
        return lastAt;
    }


}

/*
// 자바에선 확장 프로퍼티 개념이 없다 ->
public class StringUtil {
    public static char getLastChar(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String must not be null or empty");
        }
        return str.charAt(str.length() - 1);
    }
}

public class StringBuilderUtil {
    public static char getLastChar(StringBuilder sb) {
        if (sb == null || sb.length() == 0) {
            throw new IllegalArgumentException("StringBuilder must not be null or empty");
        }
        return sb.charAt(sb.length() - 1);
    }

    public static void setLastChar(StringBuilder sb, char value) {
        if (sb == null || sb.length() == 0) {
            throw new IllegalArgumentException("StringBuilder must not be null or empty");
        }
        sb.setCharAt(sb.length() - 1, value);
    }
}
 */