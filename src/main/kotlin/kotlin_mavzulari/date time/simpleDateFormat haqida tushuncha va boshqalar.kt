package `date time`

import java.text.SimpleDateFormat
import java.util.Date

fun main() {

    // bu xaxlagean qolipizda chiqarib beradi
    // hozir stringdan datega otdik
    /*var date = Date()
    val simpleDateFormat = SimpleDateFormat("dd.MM.yyyy Hh.mm.ss")
    var s = simpleDateFormat.format(date)
    println(s)*/

    // bu date da string ga otish
    val simpleDateFormat = SimpleDateFormat("dd.MM.yyyy ")
    val date = simpleDateFormat.parse("11.10.2003 ")
    println(date)
}