package `kutubxona loyixasi`

import java.util.Scanner

class MyService : MyServiceInterfase {
    var input = Scanner(System.`in`)
    val list = ArrayList<MyBook>()
    override fun kitobQoshish() {
        println("kitob nomini kiriting:")
        input = Scanner(System.`in`)
        val kname = input.nextLine()
        input = Scanner(System.`in`)
        println("kitob turini tanlang")
        KitobTuri.values().forEach {
            println("${it.ordinal} - > $it")
        }
        val turi = input.nextInt()
        val kitobTuri = KitobTuri.values()[turi]
        val myBook = MyBook(kname, kitobTuri)
        list.add(myBook)
        println("saqlandi")

    }

    override fun barchaKitoblarniKorish() {
        list.forEach {                 // shunde qilsang ham bolaveradi
            println(it)                /*for (i in 0 until  list.size){
                                        println("${list[i]}")}*/
        }
    }

    override fun kitobOlish() {
        println("qaysi kitobni olmoqchisiz:")
        for (i in list.indices) {
            if (list[i].qoldami == false) {
                println("$i -> ${list[i]}")
            }
        }
        var tanlanganindex = input.nextInt()
        val selesctBook = list[tanlanganindex]
        selesctBook.qoldami = true
        list[tanlanganindex] = selesctBook
        println("yaxshi oqing")
    }

    override fun kitobQaytaribBerish() {
        println("qaysi kitobni qaytarmoqchisiz")
        for (i in list.indices) {
            if (list[i].qoldami == true) {
                println("$i - > ${list[i]}")
            }
        }
        val tanlanganindex = input.nextInt()
        val select = list[tanlanganindex]
        select.qoldami = false
        list[tanlanganindex] = select
        println("yaxshi boring va kelib turing")
    }
}