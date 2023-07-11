package `2-mavzu_ozgarmas_va_ozgaruvhchi`

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    var sekund = input.nextInt()
    var a = sekund / 3600 //1 chiqadi
    var b = sekund % 3600 //63
    var c = b / 60//1 chiqadi
    var d = b%60 //3
    println("$sekund sekund boladi $a soat $c minut  $d sekund boladi")


}