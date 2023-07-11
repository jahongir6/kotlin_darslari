package `data class nima ekanligi va misol`


// ozgaruvchilar opertiv hotirada saqlanadi
//funksiya protssesorda ish bajaradi
//data class obyektni modelini shablonini saqlash uchun ishlatiladigon clAss
// classlarni ikkixil usulda ishlatamiz malummotlarni saqlashda,va biror bir ishni bajarishda
fun main() {
    var jahongir = Student("jahongir", 12, 2)
    println(jahongir)
    var shaxzodbek = jahongir.copy("shaxzodbek",12,2)
    println(shaxzodbek)
}

data class Student(var name: String, var age: Int, var course: Int)