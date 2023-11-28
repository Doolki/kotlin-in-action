package ch03.study.study_3_5;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class example {
    public static void main(String[] args) {

        //3.5.1 문자열을 특정 .,- 문자로 문자열을 나눌때 다음과 같이 정규식으로 표현가능하다.
        String input = "12.345-6.A";

        //. split으로 표현 (구분 문자는 문자열을 나눌수없다)
        String[] ex1 = input.split(".");
        for(String part : ex1) {
            System.out.println(part);
        }

        //정규식으로 표현
        String[] parts = input.split("\\.|\\-");
        for(String part : parts) {
            System.out.println(part);
        }

        //정규식을 쓰지않는다면
        String input2 = "12.345-6.A&A.A&B";
        StringTokenizer tokenizer = new StringTokenizer(input2, ".-&");
        List<String> parts2 = new ArrayList<>();

        while (tokenizer.hasMoreTokens()) {
            parts2.add(tokenizer.nextToken());
        }

        for(String part : parts2) {
            System.out.println(part);
        }

        // 코틀린 String 확장 함수를 쓰지않고 정규식없이 비슷한 형식으로 구현하려면
        String path = "/Users/yole/kotlin-book/chapter.adoc";

        // 마지막 '/' 이전의 문자열을 추출하여 디렉토리 경로를 얻음
        String directory = path.substring(0, path.lastIndexOf("/"));

        // 마지막 '/' 이후의 문자열을 추출하여 파일 전체 이름을 얻음
        String fullName = path.substring(path.lastIndexOf("/") + 1);

        // '.' 이전의 문자열을 추출하여 파일 이름을 얻음
        String fileName = fullName.contains(".") ? fullName.substring(0, fullName.lastIndexOf(".")) : fullName;

        // '.' 이후의 문자열을 추출하여 확장자를 얻음
        String extension = fullName.contains(".") ? fullName.substring(fullName.lastIndexOf(".") + 1) : "";

        System.out.println("Dir: " + directory + ", name: " + fileName + ", ext: " + extension);


        //3.5.2 정규식

        String path3 = "/Users/yole/kotlin-book/chapter.adoc"; // Replace with your path
        String regex = "(.+)/(.+)\\.(.+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(path3);

        if (matcher.matches()) {
            String directory3 = matcher.group(1);
            String filename3 = matcher.group(2);
            String extension3 = matcher.group(3);

            System.out.println("Dir3: " + directory3 + ", name3: " + filename3 + ", ext3: " + extension3);
        }


        // 3중 따옴표 문자열
        String kotlinLogo = "| //\n" +
                ".|//\n" +
                ".|/ \\";
        System.out.println(trimMargin(kotlinLogo, "."));


    }
    private static String trimMargin(String text, String marginPrefix) {
        StringBuilder sb = new StringBuilder();
        String[] lines = text.split("\n");

        for (String line : lines) {
            if (line.startsWith(marginPrefix)) {
                sb.append(line.substring(marginPrefix.length())).append("\n");
            } else {
                sb.append(line).append("\n");
            }
        }

        return sb.toString().trim(); // 마지막 줄바꿈 문자를 제거
    }
}


/*
    (.+)는 어떤 문자든 하나 이상 연속되는 부분을 매칭
    (.+)/ -> 여러 / 가 있으므로 url의 끝부분 / 전까지 모든 문자 포함
    (.+)\\. -> url 끝부분. 전까지 모든 문자 포함
    (.+)이후 끊는게 없으니 문자 끝까지 표시





    C:\\Users\\yole\\kotlin-book
    """ C:\Users\yole\kotlin-book """
 */


/*
 String input = "12.345-6.A";
 Arrays.stream(input.split("\\.|\\-")).forEach(System.out::println);
 */