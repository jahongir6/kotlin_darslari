package `9-mavzu constructor getter and setter`.`get set ga oid  masala`

class Circle {

    var radius: Double = 1.0
        get() = field
        set(value) {
            field = value
        }
    var color = "Red"
        get() = field
        set(value) {
            field = value
        }

    constructor()

    constructor(radius: Double) {
        this.radius = radius
    }

    constructor(radius: Double, color: String) {
        this.radius = radius
        this.color = color
    }


    override fun toString(): String {
        return "Circle(radius=$radius, color='$color')"
    }

    fun getArea(): Double {
        return 2 * Math.PI * radius * radius
    }

}