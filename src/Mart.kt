open class Mart {
    var martName : String =""
    var pesan : String = ""

    private val username = arrayListOf("MasAgus")
    private val password = arrayListOf("apaajaboleh")
    var inputUsername : String = ""
    var inputPassword : String = ""
    var memberMart = mutableListOf<String>()
    var nonMemberMart = mutableListOf<String>()
    var namaBarang = mutableListOf<String>()
    var inputMember : String =""
    var inputBarang :String =""
    var hargaBarang : Int = 0
    var jumlahBarang : Int = 0

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
            "2" -> nonMember()
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
        memberMart.add(inputMember)
        println("----------------------------")
        memberInput()
    }

    fun memberInput(){
        do {
            var done = true
            println("------------------------------------------")
            println("Checkout pelanggan member : ${inputMember}")
            println("------------------------------------------")
            print("Input Nama Barang : ")
            inputBarang = readLine().toString()
            memberMart.add(inputMember)
            print("Input Harga Satuan Barang : ")
            hargaBarang = Integer.valueOf(readLine())
            print("Input Jumlah Barang : ")
            jumlahBarang = Integer.valueOf(readLine())
        } while (done == true)
            inputAgain()
    }


    fun cetak (){

    }


    // non - member
    fun nonMember(){
        //
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





