package multithreading

fun main() {
    // bu kod har bir sekunda jaloliddin sozi chiqadi
    /* while (true) {
         println("jaloliddin")
         Thread.sleep(1000)
     }*/


// bu yerda Oqim1 classidan obyek olib start qilyapmiz bu ham har 2 sekunda
// chiqadi Oqim1 classizmi Thread dan voris olganligi uchun
    /*val oqim1 = Oqim1()
    oqim1.start()*/

    // bu yerda Run classimiz dan obyekt olyapmiz va start
// qilyapmiz chunki Run1 classimiz Runnable interfase da voris olyapti va thredga dost qilib qoyyapmiz
    /* val run = Run()
     val thread = Thread(run)
     thread.start()*/
}

class Run : Runnable {
    override fun run() {
        println("laylo")
        Thread.sleep(2000)
    }

}

class Oqim1 : Thread() {
    override fun run() {
        super.run()
        println("oqim 1")
        sleep(2000)
    }
}