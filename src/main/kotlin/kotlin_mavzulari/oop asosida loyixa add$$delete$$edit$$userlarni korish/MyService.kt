package `oop asosida loyixa add$$delete$$edit$$userlarni korish`

import java.util.Scanner

class MyService : MySeviceInterface {
    private val list = arrayOfNulls<User>(100)
    private var count = 0
    private val input = Scanner(System.`in`)
    override fun addUser() {
        println("ism kiriting:")
        val name = input.next()
        println("yosh  kiriting:")
        val age = input.nextInt()
        val user = User(name, age)
        list[count] = user
        count++
        println("saqlandi")
    }

    override fun shoAllUser() {
        for (i in 0 until count) {
            println("${list[i]}")
        }

    }

    override fun editUser() {
        for (i in 0 until count) {
            println("$i -> ${list[i]}")
        }
        println("qaysi indexni tahrirlamoqchisiz")
        val index = input.nextInt()

        println("yangi ism kiriting:")
        var name = input.next()
        println("yangi yosh kiriting:")
        var age = input.nextInt()
        var user = User(name, age)
        list[index] = user
        println("saqlandi")
    }

    override fun deleteUser() {
        for (i in 0 until count) {
            println("$i -> ${list[i]}")
        }
        println("qaysi indexni ochirmoqchisiz")
        val index = input.nextInt()
        list[index] = null
        for (i in index until count){
            list[i] = list[i+1]
        }
        count--
        println("saqllandi")
    }
}