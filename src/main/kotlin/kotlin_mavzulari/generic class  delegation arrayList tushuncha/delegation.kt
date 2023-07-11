package `generic class  delegation arrayList tushuncha`

// bitta classni funksiyasini ikkinchisida ishlatish -> delegation
fun main() {
    var a = A()
    var b = B(a)
    b.ur()
}

class A : Koprik {
    override fun ur() {

    }

}

interface Koprik {
    fun ur()
}

class B(k: Koprik) : Koprik by k {}
