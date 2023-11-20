
package ch03.study.study_3_5;

//3.5.2
fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/") /* Users/yole/kotlin-book */
    val fullName = path.substringAfterLast("/") /* chapter.adoc */
    val fileName = fullName.substringBeforeLast(".") /* chapter */
    val extension = fullName.substringAfterLast(".") /* adoc */

    println("Dir3: $directory, name: $fileName, ext: $extension")

}

//3.5.2 (정규식이용)
fun parsePath2(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    //val regex = """(.+)/(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory,fileName) = matchResult.destructured
       // val (directory, filename, extension) = matchResult.destructured
        println("Dir3: $directory, name: $fileName");
    }
}

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