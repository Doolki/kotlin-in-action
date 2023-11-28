
package ch03.study.study_3_5;

//3.5.2
///Users/yole/kotlin-book/chapter.adoc
fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/") /* Users/yole/kotlin-book */
    val fullName = path.substringAfterLast("/") /* chapter.adoc */
    val fileName = fullName.substringBeforeLast(".") /* chapter */
    val extension = fullName.substringAfterLast(".") /* adoc */

    println("Dir3: $directory, name: $fileName, ext: $extension")

}

//3.5.2 (정규식이용)
///Users/yole/kotlin-book/chapter.adoc

fun parsePath2(path: String) {
   // val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path) // matchEntire 메서드는 전달된 문자열이 정규 표현식과 완전히 일치하는지를 검사
    if (matchResult != null) {
      //  val (directory,fileName) = matchResult.destructured
        val (directory, filename, extension) = matchResult.destructured //destructured 속성은 이 일치 결과에서 캡쳐된 그룹(정규 표현식 내 괄호 ()에 의해 정의된 부분)을 쉽게 추출하고 사용
        println("Dir3: $directory, name: $filename , extension:$extension");
    }
}
/*
(.+) : 이 부분이 정규 표현식의 핵심입니다.
. : 어떤 한 문자를 의미
+ : 바로 앞의 문자나 패턴
() : 괄호 안의 패턴을 하나의 그룹으로 취급
 */

val kotlinLogo = """| //
                   .|//
                   .|/ \"""



fun main(args: Array<String>) {

    /*
       3.5.1 코틀린은 문자열 나누기가 간편하다
     */

    println("12.345-6.A&A.A&B".split(".","-","&"));
    /*
       자바에서 처럼 정규식으로 문자열을 나눌수도 있다.
    */
    println("12.345-6.A&A.A&B".split("\\.|-".toRegex()));

    /* (주의사항) toRegex() 없이는 문자열이 단순 텍스트로 처리되어 정규 표현식 패턴이 적용되지 않음 */
    println("12.345-6.A".split("\\.|-"))
    println("12.345-6.A&A.A&B".split("\\.|-"));

    /*
        3.5.2 자바에서 제공하는 String 객체의 확장함수를 통해 경로를 파싱 할 수 있다.
    */
    parsePath("/Users/yole/kotlin-book/chapter.adoc")

    parsePath2("/Users/yole/kotlin-book/chapter.adoc")


    /*
       3.5.3 여러 줄 3중 따옴표 문자열
     */
    println("kotlin : \n" + kotlinLogo.trimMargin("."));
}