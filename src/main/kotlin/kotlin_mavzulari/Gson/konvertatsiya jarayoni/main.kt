package Gson.`konvertatsiya jarayoni`

import Gson.konvertatsiya.Valyuta
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.net.HttpURLConnection
import java.net.URL
import java.util.*

fun main() {


    try {
        val input = Scanner(System.`in`)
        val list = connection()

        while (true) {
            println("Konvertatsiya qilasizmi ? (1-ha, 2-yo'q)")
            val choice = input.nextInt()

            if (choice == 1) {
                var count = 0
                list.forEach {
                    it
                    count++
                    println("$count ${it.CcyNm_UZ}")
                }

                println("1-qaysi valyutada pul kiritasiz ?")
                var fVal = getVal(Scanner(System.`in`).nextInt())
                println("2-qaysi valyutaga otkazilsin ? ")
                var sVal = getVal(Scanner(System.`in`).nextInt())
                val contrast = convert(fVal, sVal)


                println("1 ${sVal.CcyNm_UZ} = ${contrast} ${fVal.CcyNm_UZ}")


            } else {
                println("Etiboringiz uchun rahmat !")
            }
        }

    } catch (e: Exception) {
        println("Internet bilan aloqani tekshiring !")
    }
}


fun connection(): ArrayList<Valyuta> {
    val input = Scanner(System.`in`)

    val url = URL(" http://cbu.uz/uzc/arkhiv-kursov-valyut/json/")
    val connection = url.openConnection() as HttpURLConnection
    connection.connect()
    val inputStream = connection.inputStream
    val bufferedReader = inputStream.bufferedReader()
    val gs = bufferedReader.readLine()

    val gson = Gson()
    val type = object : TypeToken<ArrayList<Valyuta>>() {}.type
    val list = gson.fromJson<ArrayList<Valyuta>>(gs, type)

    return list
}

fun getVal(getNumber: Int): Valyuta {
    val allList = connection()
    var count = 0
    for (count in 0..getNumber) {
        if (count == getNumber) {
            val item = allList[count - 1]
            return item
        }
    }
    return allList[count - 1]
}

fun convert(valyuta1: Valyuta, valyuta2: Valyuta): Float {
    return valyuta2.Rate.toFloat() / valyuta1.Rate.toFloat()
}
