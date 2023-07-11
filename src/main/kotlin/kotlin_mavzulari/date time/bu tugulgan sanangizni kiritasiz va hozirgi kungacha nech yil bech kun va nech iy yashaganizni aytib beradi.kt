package `date time`

import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val simpleDateFormat = SimpleDateFormat("dd.MM.yyyy")
    while (true) {
        println("sanani 'dd.MM.yyyy holata  kiriting")

        println("brinchi dateni kiriting")
        val date1 = simpleDateFormat.parse(input.next())

        println("ikkinchi dateni kiriting")
        val date2 = simpleDateFormat.parse(input.next())

        val fCalendar = Calendar.getInstance()
        fCalendar.time = date1

        val sCalendar = Calendar.getInstance()
        sCalendar.time = date2

        val farqYil = sCalendar[Calendar.YEAR] - fCalendar[Calendar.YEAR]
        val farqOy = farqYil * 12 + (sCalendar[Calendar.MONTH] - fCalendar[Calendar.MONTH])


        var yil = 0
        var farqKun = 0

        while (yil <= farqYil - 1) {
            farqKun += dayInYear(yil)
            yil++
        }
        farqKun += sCalendar[Calendar.DAY_OF_YEAR]
        farqKun -= fCalendar[Calendar.DAY_OF_YEAR]
        println("ikki sana orasidagi farq:\nyil:${farqYil}\noy:${farqOy}\nkun:${farqKun}")
    }
}

fun dayInYear(yil: Int): Int {
    var december31 = Calendar.getInstance()
    december31[Calendar.DAY_OF_MONTH] = 31
    december31[Calendar.MONTH] = 11
    december31[Calendar.YEAR] = yil

    return december31[Calendar.DAY_OF_YEAR]
}
