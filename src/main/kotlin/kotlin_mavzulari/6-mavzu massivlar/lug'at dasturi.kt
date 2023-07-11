package `6-mavzu massivlar`

import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)
    var enlishw = arrayOfNulls<String>(100)
    var uzw = arrayOfNulls<String>(100)
    var count = 0
    while (true) {
        println("1-lugat kritish uchun,2->lug'atlani barchasini ko'rish uchun,3-taxrirlash,4-ochirish")
        var n = input.nextInt()
        when (n) {
            1 -> {
                println("ingilizcha soz kiriting")
                var en = input.next()
                println("uzbekcha soz kiriting")
                var uz = input.next()
                enlishw[count] = en
                uzw[count] = uz
                count++
                println("saqlandi")
            }

            2 -> {
                for (i in 0 until count) {
                    println("${enlishw[i]}-${uzw[i]}")
                }
            }

            3 -> {
                for (i in 0 until count) {
                    println("$i  ${enlishw[i]}-${uzw[i]}")
                }
                println("qaysinisini taxrirla moqchisiz")
                var index = input.nextInt()
                println("yangi soz kiriting ingilizcha")
                val eng = input.next()
                println("yangi ozbekcha soz kiriting")
                val oz = input.next()
                enlishw[index] = eng
                uzw[index] = oz
                println("saqlandi")

            }

            4 -> {
                for (i in 0 until count) {
                    println("$i  ${enlishw[i]}-${uzw[i]}")
                }
                println("ochirmoqchi bolganizni kiriting")
                var indec = input.nextInt()

                enlishw[indec] = null
                uzw[indec] = null

                for (i in indec until count) {
                    enlishw[i] = enlishw[i + 1]
                    uzw[i] = uzw[i + 1]
                }
                count--
                println("saqlandi")
            }
        }
    }
}