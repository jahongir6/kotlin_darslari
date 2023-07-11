package `object`

fun main() {
    val s = "kotlin"
    println(s.qirqish())
}

// extension funksiyalar->vorislik funksiyalar
// extension funksiya chaqirganizda ozini funksiyalari bilan keladi
//extension funksiyalar faqat string bolmaydi int double va boshqalar ham boladi
fun String.qirqish(): String {
    return this.substring(1, this.length)
}
