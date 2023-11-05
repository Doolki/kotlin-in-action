package ch01.study


fun printLength(obj: Any) {
    if (obj is String) {
        // obj는 자동으로 String으로 스마트 캐스트됨
        println(obj.length)
    }
}

fun asString(obj: Any): String? {
    return obj as? String
}

fun main(args: Array<String>) {
    println(asString("Hello"))
    println(asString(1))
}
