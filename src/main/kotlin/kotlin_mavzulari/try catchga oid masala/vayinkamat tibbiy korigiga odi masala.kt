package `try catchga oid masala`

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    try {
        println("yoshingizni kiriting")
        var n = input.nextInt()
        if (n < 18) {
            throw ArithmeticException()
        } else {
            try {
                println("tibbiy korik xulosasi 1-soglom , 2-nosoglom")
                var sog = input.nextInt()
                if (sog == 1) {
                    println("xarbiy xizmatga ruxsat")
                } else {
                   throw IndexOutOfBoundsException()
                }
            } catch (e: Exception) {
                println("negodin")
            }
        }

    } catch (e: Exception) {
        println("yoshing yetmaydi")
    }
}