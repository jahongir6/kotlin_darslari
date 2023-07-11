package `3-mavzu_string_funksiyalari`

fun main() {
    val str = "salom"
    val ostr = str.substring(3, str.length)
    val bstr = str.substring(0, str.length - 2)
    println("$str  ${ostr+bstr}")
}