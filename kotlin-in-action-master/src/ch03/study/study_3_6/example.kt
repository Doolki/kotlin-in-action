package ch03.study.study_3_6
import verification.*;

// 로컬 함수
/*
    fun saveUser(user: User) {
         fun validate(value: String, fieldName: String) { // user 파라미터를 중복 사용하지 않는다.
             if (value.isEmpty()) {
                  throw IllegalArgumentException(
                     "Can't save user ${user.id}: " + // 바깥 함수의 파라미터에 직접 접근할 수 있다.
                     "empty $fieldName")
                }
            }

        validate(user.name, "Name")
        validate(user.address, "Address")
    }

 */


/* 확장 함수
fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
               "Can't save user $id: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")
}

fun saveUser(user: User) {
    user.validateBeforeSave()

    // Save user to the database
}
*/

fun main(args: Array<String>) {
    val user = User(1, "name", "address")
    user.saveUser()
}