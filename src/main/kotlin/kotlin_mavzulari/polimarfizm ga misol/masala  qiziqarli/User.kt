package `polimarfizm ga misol`.`masala  qiziqarli`

class User : Person {
    var grade: Double = 0.0
    var stipendiya: Double = 0.0

    constructor(name: String, age: Int, grade: Double, stipendiya: Double) : super(name, age) {
        this.grade = grade
        this.stipendiya = stipendiya
    }

    //override ustiga yozish
    override fun display() {
        super.display()
        println("men $stipendiya olaman.baxoyim esa $grade")
    }
}