package `enum class and nested class inner class`.`inner class haqida tushuncha va unga misol`

fun main() {
    var uzbekistan = Uzbekistan()
    var fergana = uzbekistan.fergana()
    fergana.mehmondorchilik()
}

class Uzbekistan {
    var chevrolet = 1000
    fun monopoliya() {
        println("qalesilar")
    }

    inner class fergana {
        fun mehmondorchilik() {
            println(chevrolet)
            println("yaxshi")
        }
    }


}