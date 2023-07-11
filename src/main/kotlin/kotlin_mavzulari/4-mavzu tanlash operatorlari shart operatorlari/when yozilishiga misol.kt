package `4-mavzu tanlash operatorlari shart operatorlari`

fun main() {
    val a = 3
    when (a) {
        1->{
            println("1-raqqam")
        }
        2->{
            println("2-raqam")
        }
        in 4..5->{
            println("orasidami")
        }
        1,2,3->{
            println("shulardan birimi")
        }
        else->{
            println("xato")
        }
    }
}