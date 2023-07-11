package `9-mavzu constructor getter and setter`

class Person(oyoq: Int, boyi: Double, vazni: Int) {
    var oyoqi: Int = 2
    var boyi: Double = 158.0
    var vazni = 40

    //bu secondory constructorga hohlaganingdi berorasan
    //consturctor 2 ga bbolinadi primary secondary primary bitta boladi secondary cheksiz bolishi ham  mumkum
    // cotructor hammasini birdaniga kiritish uvhun kerak boladi
    // constryctor qiymat qaytarmaydigan funksiya
    // bu constructor buni vazifasi hammasi bittada kiritasiz init bu primary constructor tanasi
    init {
        this.boyi = boyi
        this.oyoqi = oyoq
        this.vazni = vazni
    }

    fun yugurish(tezlik: Int) {
        println("men $tezlik da yuguryapman")
    }

    fun salomlashish() {
        println("assalomu alaykum.....")
    }

    //bu toString hammasini ekranga chiqarish uchun
    override fun toString(): String {
        return "Person(oyoqi=$oyoqi, boyi=$boyi, vazni=$vazni)"
    }

}