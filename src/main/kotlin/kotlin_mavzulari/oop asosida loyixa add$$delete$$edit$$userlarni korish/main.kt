package `oop asosida loyixa add$$delete$$edit$$userlarni korish`

import java.util.Scanner

fun main() {
    val myService = MyService()
    while (true) {
        println("1->user qo'shish,2->ko'rish,3->taxrirlash,4->ochirish")
        when( Scanner(System.`in`).nextInt()){
            1->myService.addUser()
            2->myService.shoAllUser()
            3->myService.editUser()
            4->myService.deleteUser()
        }
    }
}