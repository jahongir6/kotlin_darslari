package `generic class  delegation arrayList tushuncha`

fun main() {
    var myTas = MyTas<String, Int>()
    myTas.teskariCiqar("jahon")
    myTas.ishora(12)
}

class MyTas<T, V> {
    fun teskariCiqar(a: T): String {
        return a.toString().reversed()

    }

    fun ishora(b: V): Int {
        var int = b as Int
        if (int > 0) return 1
        else if (b < 0) return 0
        else return -1
    }
}