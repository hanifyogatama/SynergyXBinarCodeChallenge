open class Member () : Anggota (){
    var namaMember: String = ""


    override fun member() {
        Mart.barangMartArray
        println("----------------------------")
        println("Checkout Pelanggan Member")
        println("----------------------------")
        print("Input Nama Member : ")
        namaMember = readLine().toString()
        println("------------------------------------------")
        println("Checkout pelanggan member : ${namaMember}")
        println("------------------------------------------")
        do {
            var done = 0
            print("Input Nama Barang : ")
            var inputBarang = readLine().toString()
            Mart.barangMartArray.add(inputBarang)

            print("Input Harga Satuan Barang : ")
            var hargaBarang = Integer.valueOf(readLine())
            Mart.hargaBarangArray.add(hargaBarang)

            print("Input Jumlah Barang : ")
            var jumlahBarang = Integer.valueOf(readLine())
            Mart.jumlahBarangArray.add(jumlahBarang)
            Mart.subTotalArray.add(perhitunganBelanja(hargaBarang,jumlahBarang))

            print("input barang lagi (y/n) : ")
        } while (done == 1)
        when(readLine()){
            "y" -> member()
            "n" -> cetak()
            else -> {
                println("input yang dimasukkan tidak tersedia")
            }
        }
    }

    fun cetak(){
        println("----------------------------")
        println("Checkout pelanggan member : ${namaMember}")
        println("----------------------------")
        var i = 0
        while(i < Mart.barangMartArray.size ) {
            println("${Mart.barangMartArray.get(i)} x ${Mart.jumlahBarangArray.get(i)} : Rp. ${Mart.subTotalArray.get(i)} ")
            Mart.totalBelanja += Mart.subTotalArray.get(i)
            i++
        }
        diskon()
    }

    fun perhitunganBelanja(hargaBarang:Int,jumlahBarang:Int ):Int{
        var subTotal =  hargaBarang * jumlahBarang
        return subTotal
    }

    fun diskon(){
        Mart.DISKONMEMBER
        var totalDiskon = Mart.totalBelanja * Mart.DISKONMEMBER
        println("""
            Selamat ! karena total belanjaan ${namaMember} lebih besar dari Rp. 50000,
            maka mendapatkan potongan sebesar 9.5%
            ${namaMember} cukup membayar Rp. ${totalDiskon}
        """.trimIndent())
        Mart.totalBelanja = totalDiskon.toInt()
    }

    fun kembalian (){
        var kembalian : Int = 0
        println("----------------------------")
        println("Checkout pelanggan member : ${namaMember}")
        println("----------------------------")
        println("Total belanja : Rp ${Mart.totalBelanja}")
        print("input uang customer : Rp. ")
        var uangCustomer = Integer.valueOf(readLine())
        print("kembalian : Rp. $kembalian")
        kembalian -= uangCustomer
    }

    override fun nonMeber() {
        Mart.barangMartArray
        println("----------------------------")
        println("Checkout Pelanggan non-Member")
        println("----------------------------")
        do {
            var done = 0
            print("Input Nama Barang : ")
            var inputBarang = readLine().toString()
            Mart.barangMartArray.add(inputBarang)

            print("Input Harga Satuan Barang : ")
            var hargaBarang = Integer.valueOf(readLine())
            Mart.hargaBarangArray.add(hargaBarang)

            print("Input Jumlah Barang : ")
            var jumlahBarang = Integer.valueOf(readLine())
            Mart.jumlahBarangArray.add(jumlahBarang)
            Mart.subTotalArray.add(perhitunganBelanja(hargaBarang,jumlahBarang))

            print("input barang lagi (y/n) : ")
        } while (done == 1)
        when(readLine()){
            "y" -> member()
            "n" -> cetak()
            else -> {
                println("input yang dimasukkan tidak tersedia")
            }
        }
    }
}