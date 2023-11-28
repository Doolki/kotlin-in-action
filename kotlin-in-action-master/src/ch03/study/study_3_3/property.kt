@file:JvmName("functions")
package property

import java.lang.StringBuilder

/* 최상위 프로퍼티 사용 */
var multiplication = 1;

/* 확장 프로퍼티 선언 */
val String.lastChar:Char get() = get(length -1);

/* 변경 가능한 확장 프로퍼티 선언 */
var StringBuilder.lastChar:Char get() = get(length -1);
    set(value:Char) {
        this.setCharAt(length -1, value);
    }


fun String.castle(){

}