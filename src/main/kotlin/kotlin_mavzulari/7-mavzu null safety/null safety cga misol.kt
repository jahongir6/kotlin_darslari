package `7-mavzu null safety`

fun main() {

    // bu misolda mohiyat shundaki null bolgan ozgaruvchiga null bolmagan ozgaruvchini qiymatini olib otsak boladikan
    /* var javohir: Int? = null
     var ahliddin: Int = 100

     javohir = ahliddin
     println(javohir)*/

    // bu misolda esa null bolmagan ozgaruchiga null bolgan ozgaruvchini qiymatini olib otib bolmaydi
    /*  var javohir: Int? = null
      var ahliddin: Int = 100

      ahliddin = javohir
      println(javohir)*/

    //bu misolda javohrni null qilib qoygandik  keyin !!qoyganimizdan kiyin pul bor ekan dedi dastur,
    //mohiyta shundaki !! qoymaganimizda javohirda pull yoq dep yurodi keyin !! bu ni qoyishimizga sabab javohirda pul
    // bor aniq dep qoyganimizdan keyin ishladi
    /*  var javohir: Int? = 1000
      var ahliddin: Int = 100

      ahliddin = javohir!!
      println(javohir)
  */
    // bu misol any ni dan string otvolish as qilish
    // mohiyat shundaki bitta oilada bolsa as qilib otsa boladi
  /*  var str: Any = "salom"
    var cas: String = str as String*/

}