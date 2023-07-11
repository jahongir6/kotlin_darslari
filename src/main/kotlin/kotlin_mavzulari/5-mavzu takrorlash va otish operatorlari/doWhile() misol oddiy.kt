package `5-mavzu takrorlash va otish operatorlari`

fun main() {

    // birda yuzgacha chiqadi chinki sarti keyin berilyapti
    /*var i = 0
    do {
        i++
        println(i)
    } while (i<100)*/


    // forEach ga oid misol
    //javobi birdan 10 gacha chiqadi
    val range = 1 .. 10
    range.forEach{
        println(it)
    }
}