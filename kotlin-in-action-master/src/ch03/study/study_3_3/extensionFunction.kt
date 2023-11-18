@file:JvmName("function")
package extension

/*
    String -> 수신객체 타입(type)
    this -> 수신객체 (Object)
 */
fun String.lastChar2():Char {
    return this.get(this.length-1);
}

fun String.frist():Char {
    return this.get(0);
}

fun String.test():String {
    return this.substring(1,3);
}

fun String.second():Char = this.test().get(1);


