open class Menu {

    fun menu () {
        println("""
        1. Login Kasir
        0. Keluar
    """.trimIndent())
        print("pilih : ")
        when(readLine()){
            "1" -> Login().login()
            "0" -> return
        }
    }

    fun cekMenu (username:String){
        println("-------------------------------")
        println("Selamat datang ${username}")
        println("-------------------------------")
        println("""
            1. Checkout Pelanggan 
            2. Logout
        """.trimIndent())
        print("Pilih : ")
        when(readLine()){
            "1" -> cekPelanggan()
            "2" -> Login().login()
            else -> {
                println("input yang dimasukan tidak tersedia")
            }
        }
    }


    fun cekPelanggan(){
        println("---------------------")
        println("Checkput Pelanggan")
        println("---------------------")
        println("""
            1. pelanggan Member 
            2. Pelanggan non-member
        """.trimIndent())
        print("Pilih :")
        when(readLine()){
            "1" -> Member()
           // "2" ->  nonMemberInput()
            else -> {
                println("input yang dimasukkan tidak tersedia")
            }
        }



    }



}