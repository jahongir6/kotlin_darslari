package `object`

// bu yerda qanday jarayon ketyabdi desangiz class ochib olyapman use digan obkject ochib olib uni ichida
// class dan obyek olib olyapman main da esa object ichidagi obyektdan bemalol foydalana olyapman
// qulayligi userObjectni useri disam classdagi malumotim olingan obyektim xoxlagan joyda kelaveradi
fun main() {
    UserObject.user.age = 19
    UserObject.user.name = "jahogir"
    display()
}

object UserObject {
    var user = Use()
}

class Use {
    var name: String = ""
    var age: Int = 0

    override fun toString(): String {
        return "Use(name='$name', age=$age)"
    }

}

fun display() {
    println(UserObject.user)
}

// tepadigidan ham qulayroq osonrogi esa companiyon object yani classni ichida boladi
/*fun main() {
    Use.user.age = 17
    Use.user.name = "kdsdvjkv"
    display()
}

class Use {
    var name: String = ""
    var age: Int = 0

    companion object {
        var user = Use()
    }

    override fun toString(): String {
        return "Use(name='$name', age=$age)"
    }

}

fun display() {
    println(Use.user)
}*/
