package `6-mavzu massivlar`

fun main() {
    var array = arrayOfNulls<Int>(3)
    array[0] = 1
    array[1] = 2
    array[2] = 3

    for (i in 0 until array.size){
        println(array[i])
    }
}