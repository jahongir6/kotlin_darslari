package `enum class and nested class inner class`.`nested class haqida tushuncha va unga  misol`


//ichki klass nested tashqi classni funksiya ozgaruvchilaridan foydalana olmidi
//nested classdan obyekt oledigonda shunchaki yolini korsatib qoysa boldi

fun main() {
    var shohimardon = Qirgizistan.shohimardon()
    shohimardon.damOlish()
}

class Qirgizistan {
    var toyota = 1000
    fun uloq() {
        println("uloqchopadi  kopincha")
    }

    class shohimardon {
        fun damOlish() {
            println("yaxshi dam olish")
        }
    }
}