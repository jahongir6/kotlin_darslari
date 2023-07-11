package `object`

// object -> bu bir marotaba obyekt olib xoxlagan joyimmizda foydalanamiz

fun main() {
    User.name = "Jahongir"
    User.age = 19
    println(User.name)
}

object User {
    var name: String = "_"
    var age: Int = 0
}