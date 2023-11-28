
@file:JvmName("function")
package verification

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${id}: " +
                        "empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")

    // Save user to the database
}

fun User.saveUser() {
    validateBeforeSave()
}


