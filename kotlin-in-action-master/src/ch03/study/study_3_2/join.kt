@file:JvmName("StringFunctions")
package strings


fun <T> joinToString4(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

/*
    String -> 수신객체 타입
    this -> 수신객체 타입
 */
fun String.lastChar2():Char {
    return this.get(this.length-1);
}

fun String.frist():Char {
    return this.get(0);
}
