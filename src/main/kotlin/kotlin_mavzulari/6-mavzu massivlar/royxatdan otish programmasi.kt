package `6-mavzu massivlar`

import java.util.Scanner

fun main() {
    val names = arrayOfNulls<String>(10)
    val input = Scanner(System.`in`)
    var sanoq = 0
    while (true) {
        println("1- qoshish , 2-korsatish")
        var n = input.nextInt()
        when (n) {
            1 -> {
                println("ismingizni kiriting")
                val name = input.next()
                names[sanoq]=name
                sanoq++
                println("saqlandi")
            }

            2 -> {
               for (i in 0 until sanoq){
                   println(names[i])
               }
            }
        }
    }
}