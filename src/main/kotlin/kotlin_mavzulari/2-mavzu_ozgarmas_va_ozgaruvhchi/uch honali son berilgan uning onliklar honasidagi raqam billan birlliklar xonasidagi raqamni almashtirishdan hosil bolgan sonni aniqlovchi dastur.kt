package `2-mavzu_ozgarmas_va_ozgaruvhchi`

import java.util.Scanner

fun main() {
    println("3 xonali son kiriting")
    var input = Scanner(System.`in`)
    var a = input.nextInt()
    var b = a / 100 //bir chiqadi
    var c = a % 100 // 23 qoladi
    var d = c / 10 //2
    var e = c % 10//3
    println("siz kiritgan qiymat $a bolsa sizga onliklar va birlikalar sonini almashtirishdan hosil bolgan raqam $d$b$e")


}