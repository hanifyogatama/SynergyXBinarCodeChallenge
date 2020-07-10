open class Mart {
    // var martName : String =""
    // var pesan : String = ""

    private val username = arrayListOf("MasAgus")
    private val password = arrayListOf("apaajaboleh")
    var inputUsername : String = ""
    var inputPassword : String = ""
    var memberMartArray = mutableListOf<String>()
    var barangMartArray = mutableListOf<String>()
    var hargaBarangArray = mutableListOf<Int>()
    var jumlahBarangArray = mutableListOf<Int>()
    var namaBarang = mutableListOf<String>()
    //    var namaBarang = mutableListOf<String>()
    var inputMember : String =""
    var inputBarang :String =""
    var hargaBarang : Int = 0
    var jumlahBarang : Int = 0
    var total : Int = 0

    //var status : Int = 0

    // login
    fun login(){
        println("------------------------------")
        println("Selamat datang di synergi mart")
        println("------------------------------")
        print("Username : ")
        inputUsername = readLine().toString()
        print("Password : ")
        inputPassword = readLine(). toString()
        for (i in username.indices){
            if ( (inputUsername == username[i]) && (inputPassword == password[i]) ) {
                proses()
            }
        }
    }

    // proses
    open fun proses(){
        println("-------------------------------")
        println("Selamat datang ${this.inputUsername}")
        println("-------------------------------")
        println("""
            1. Checkout Pelanggan 
            2. Logout
        """.trimIndent())
        print("Pilih : ")
        when(readLine()){
            "1" -> cekPelanggan()
            "2" -> login()
            else -> {
                println("input yang dimasukan tidak tersedia")
            }
        }
    }

    // cek pelanggan
    fun cekPelanggan (){
        println("---------------------")
        println("Checkput Pelanggan")
        println("---------------------")
        println("""
            1. pelanggan Member 
            2. Pelanggan non-member
        """.trimIndent())
        print("Pilih :")
        when(readLine()){
            "1" -> member()
            "2" -> nonMemberInput()
            else -> {
                println("input yang dimasukkan tidak tersedia")
            }
        }
    }

    // member
    fun member(){
        println("----------------------------")
        println("Checkout Pelanggan Member")
        println("----------------------------")
        print("Input Nama Member : ")
        inputMember = readLine().toString()
        memberMartArray.add(inputMember)
        println("----------------------------")
        memberInput()
    }

    fun memberInput(){
        println("------------------------------------------")
        println("Checkout pelanggan member : ${inputMember}")
        println("------------------------------------------")
        do {
            var done = 0
            print("Input Nama Barang : ")
            inputBarang = readLine().toString()
            barangMartArray.add(inputBarang)

//            print("Input Harga Satuan Barang : ")
//            hargaBarang = Integer.valueOf(readLine())
//            hargaBarangArray.add(hargaBarang)
//
//            print("Input Jumlah Barang : ")
//            jumlahBarang = Integer.valueOf(readLine())
//            jumlahBarangArray.add(jumlahBarang)

            print("input barang lagi (y/n) : ")
        } while (done == 1)
        when(readLine()){
            "y" -> memberInput()
            "n" -> cetak()
            else -> {
                println("input yang dimasukkan tidak tersedia")
            }
        }
    }

    fun nonMemberInput(){
        println("------------------------------")
        println("Checkout pelanggan non member ")
        println("------------------------------")
        print("Input Nama Barang : ")
        inputBarang = readLine().toString()
        memberMartArray.add(inputBarang)
        print("Input Harga Satuan Barang : ")
        hargaBarang = Integer.valueOf(readLine())
        print("Input Jumlah Barang : ")
        jumlahBarang = Integer.valueOf(readLine())
    }


    fun cetak (){
        println()
        println("-------------------------------------------")
        println("checkout pelanggan member : ${inputMember} ")
        println("-------------------------------------------")
        barangMartArray.forEach {
            println(it)
        }
        println("-------------------------------------------")



    }






    fun inputAgain(){
        when(readLine()){
            "y" -> memberInput()
            "n" -> cetak()
            else -> {
                println("input yang dimasukkan tidak tersedia")
            }
        }
    }

}





