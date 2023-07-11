package `generic class  delegation arrayList tushuncha`
// generic class tipini keyin bersa boladigan  class
// generic funksiya tipini keyin beradigon funksiya
fun main() {
    var myTask = MyTask<String>()
    myTask.display("jahongir")

    var myTask2 = MyTask<Int>()
    myTask2.display(19)
}
class MyTask<T> {
    fun display(a: T) {
        println(a)
    }
}

/*
//bu yerda generic funksiya orqali qaysi tipda bolsa ham hammasini teskari qilib chiqarib beradi
fun main() {
    display(123)
    display("jahongir")
}

fun <T> display(a: T) {
    println(a.toString().reversed())
}*/


//faqt T emas yoniga yana qoshsak bolaverdi
/*fun main() {
    display("salom", "xayrdema")
}

fun <T, V> display(a: T, b: V) {
    println(a.toString().reversed())
    println(b.toString().substring(1, 4))
}*/
