package `polimarfizm ga misol`.`masala  qiziqarli`

//open qilganimdi sababi voris bera oladigan class open boladi
open class Person {
    var name: String = ""
    var age: Int = 0

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    open fun display() {
        println("maning ismim $name . yoshim $age")
    }
}