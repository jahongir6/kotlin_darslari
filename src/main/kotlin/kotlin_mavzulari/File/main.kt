package File

import java.io.BufferedReader
import java.io.File
import java.io.FileWriter
import java.nio.charset.Charset

fun main() {
    // bitta faylni ochirib yuborish
    var file = File("android11.txt")
    file.delete()//bu bitta faylni
    file.deleteRecursively()//bu papkani ichidagi barchasini ochirib tashedi
    //har bitta ichidagi fayllarni oqib chiqadi
    /*var file = File("android11.txt")
    file.walk().forEach {
        println(it)
    }*/

    // bitta faylni ikkinchi faylga kochirish
    /*val file1 = File("android11.txt")
    val file2 = File("janam.txt")
    file1.copyTo(file2)*/


// bu yerda nima bolyapti desang bunda owerride qilmaydi ketma ket  yozib ketaveradi ochirib yubormasdan
    /*    var file = File("android11.txt")
        val fileWrite = FileWriter(file, true)
        fileWrite.append("jahongir")
        fileWrite.close()*/

    // bu byteArrayga otkazib yozish faylga yozib beradi
    /*
        var file = File("C:\\Users\\user\\android\\jahongir\\salom.txt")
        val s = "salom"
        var array = s.toByteArray()
        file.writeBytes(array)
    */


    // bu ham hammasini oqib beradi
    /*    var file = File("C:\\Users\\user\\android\\jahongir\\salom.txt")
        println(file.readText())*/


    //bu c disk dagi barchasini olibkelib beradi
    /*var file = File("C:\\")
    file.list().forEach {
        println(it)
    }*/

    //bu file dagi mlumotni oqib beradi
    /* var file = File("C:\\Users\\user\\android\\jahongir\\salom.txt")
     var bufferReader = file.bufferedReader()
     var readlines = bufferReader.readLines()
     readlines.forEach {
         println(it)
     }*/


    // bu shu papkada barcha malumotlarniolib keladi
    /*var file = File("C:\\Users\\user")
    file.list().forEach {
        println(it)
    }*/

    // canWrite funksiya file yoza olasan deyapti
    /*var file = File("C:\\Users\\user\\android\\jahongir\\salom.txt")
    println(file.canWrite())*/


    // endi papka ochib uni ichiga file ochish
    /*  var papka = File("C:\\Users\\user\\android\\jahongir")
      println(papka.mkdirs())

      var file = File("C:\\Users\\user\\android\\jahongir\\salom.txt")
      println(file.createNewFile())*/


    //mkdisr bor u papkalar yaratadi ichma ich qilib papka yaratib beradi
    /* val file = File("C:\\Users\\user\\android\\javohir\\bekzod")
     println(file.mkdirs())*/


    //mkdir degan funksiyai papka qilib beradi
    /*    var file = File("C:\\Users\\user\\android11")
        println(file.mkdir())*/


    // isFile() shu fayl bormi degani va bizga true false qaytaradi
    /*    var file = File("C:\\Users\\user\\android11.txt")
        println(file.isFile)*/


    //createNewFile esashu file qilib yarata olasanmi degani va true false qaytaradi
    /* val file = File("C:\\Users\\user\\android11.txt")
     println(file.createNewFile())*/
}