package `9-mavzu constructor getter and setter`.`constructorga oid masala`

class User {
    //get bu ozini qiymatini ozi aytib berishi getter hisoblanadi
    // set esa joylab beradi
    var age: Int = 0
        get() = field
    var name: String = ""
        set(value) {
            field = value
        }
    var address: String = ""

    constructor(age: Int, name: String, address: String) {
        this.age = age
        this.name = name
        this.address = address
    }

    fun salomlashish() {
        println("mening ismim $name va men $age yoshdaman va $address da tugilganman")
    }
}