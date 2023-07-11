package `polimarfizm ga misol`

fun main() {
    //polimarfizm degani funksiylarni va boshqa hkoazo larni netiviga borish yani  oz joyiga borish
    println(ikkigaBol(10))
}

fun ikkigaBol(a: Int): Int {
    return a / 2
}

fun ikkigaBol(a: Double): Double {
    return a / 2
}

fun ikkigaBol(a: Float): Double {
    return a / 2.toDouble()
}