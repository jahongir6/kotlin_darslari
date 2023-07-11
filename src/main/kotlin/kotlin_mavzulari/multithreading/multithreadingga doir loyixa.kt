package multithreading

import java.util.Scanner
import kotlin.random.Random

fun main() {
    salom()
}

fun salom() {
    val input = Scanner(System.`in`)
    var score = 0//bu tori javoblarni sanayabdi
    var round = 1
    while (true) {
        // println("roud $round") bu nechinchi savolda ketdigoni aytadi
        val vaqt = Vaqt()
        vaqt.start()

        var number1 = Random.nextInt(10)
        var number2 = Random.nextInt(10)
        var char = listOf('+', '-', '*', '/').random()
        var toriJavob = 0
        if (vaqt.isAlive) {//bu yerda aytyapmanki 10 gacha sanab bolmaganbolsa shartni bajar deb
            when (char) {
                '+' -> {
                    println("$number1+$number2=?")//bu ekranga chiqaryapti
                    toriJavob = number1 + number2//bu tori javob shu ligini aytyapti
                    vaqt.stop()
                }

                '-' -> {
                    if (number1 > number2) {
                        salom()
                        return
                    }
                    println("$number1-$number2=?")
                    toriJavob = number1 - number2
                    vaqt.stop()
                }

                '*' -> {
                    println("$number1*$number2=?")
                    toriJavob = number1 * number2
                    vaqt.stop()
                }

                '/' -> {
                    if (number1 > number2) {
                        salom()
                        return
                    }
                    println("$number1/$number2=?")
                    toriJavob = number1 / number2
                    vaqt.stop()
                }

                '%' -> {
                    println("$number1%$number2")
                    vaqt.stop()
                }
            }
        } else {//bu yerda vaqt tugashi bilan shu narsa chiqdi
            println("endi kech")
            return
        }
        // bu yerda biz kiritga son torimi yoki yoqmi deb tekshiryapti
        var answer = input.nextInt()
        if (answer == toriJavob) {
            println("tori javob")
            score++
            vaqt.stop()
        } else {
            println("notori javob")
            vaqt.stop()
        }
        round++//bu yerda savolllarni qoshib ketadi
        if (round == 10) {//bu yerda 10 ta savol beriladi halos 10 tadan keyin toxtedi
            break
            vaqt.stop()
        }
    }
    println("siz $round savoldan $score ta siga tori javob berdingiz")
}

class Vaqt : Thread() {
    override fun run() {
        super.run()
        sleep(10000)
        println("vaqt tugadi")
    }
}