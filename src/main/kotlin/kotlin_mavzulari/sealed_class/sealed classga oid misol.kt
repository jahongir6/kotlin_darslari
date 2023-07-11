package sealed_class
//sealed class bu bir xil tipdagi classlardan foydalanish uchun
fun main() {
    var qora = Color.BLACK()
    println(qora)
}

sealed class Color {
    class BLACK : Color()
    class YELLOW : Color()
    class WHITE : Color()

    fun mixed(c: Color) {
        when (c) {
            is Color.BLACK -> println("qora")
            is Color.WHITE -> println("OQ")
            is Color.YELLOW -> println("SARIQ")
            else -> {}
        }
    }


}