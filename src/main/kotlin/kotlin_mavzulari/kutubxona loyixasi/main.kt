package `kutubxona loyixasi`

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val myService = MyService()
    while (true) {
        println("1->kitob qoshish , 2->barcha kitoblarni korish, 3-> kitob olish , 4->kitob ni qaytarish")
        when (input.nextInt()) {
            1 -> myService.kitobQoshish()
            2 -> myService.barchaKitoblarniKorish()
            3 -> myService.kitobOlish()
            4 -> myService.kitobQaytaribBerish()
        }
    }
}