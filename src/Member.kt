class Member () : Anggota (){
    var namaMember: String = ""
    protected fun Int.idr():String{
        return ("Rp. $this,00")
    }

    override fun inputBelanjaan() {
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

            print("Input Nama Barang : ")
            var inputBarang = readLine().toString()
            Mart.barangMartArray.add(inputBarang)

            print("Input Harga Satuan Barang : ")
            var hargaBarang = Integer.valueOf(readLine())
            Mart.hargaBarangArray.add(hargaBarang)

            print("Input Jumlah Barang : ")
            var jumlahBarang = Integer.valueOf(readLine())
            Mart.jumlahBarangArray.add(jumlahBarang)
            Mart.subTotalArray.add(hitung(hargaBarang,jumlahBarang))

            print("input barang lagi (y/n) : ")
            val inputan = readLine()!!
            val inputanChar : Char= inputan.single()
        } while (inputanChar == 'y')
        perhitunganBelanja()
    }

    override fun perhitunganBelanja(){
        println("----------------------------")
        println("Checkout pelanggan member : ${namaMember}")
        println("----------------------------")
        var i = 0
        while(i < Mart.barangMartArray.size ) {
            println("${Mart.barangMartArray.get(i)} x ${Mart.jumlahBarangArray.get(i)} : Rp. ${Mart.subTotalArray.get(i)} ")
            Mart.totalBelanja += Mart.subTotalArray.get(i)
            i++
        }
        println("""
            -------------------------
            Total Belanja : ${Mart.totalBelanja.idr()}
            -------------------------
        """.trimIndent())
        if (Mart.totalBelanja > 50000) {
            diskon()
        }
        pembayaran()
    }

    private fun hitung(hargaBarang:Int,jumlahBarang:Int ):Int{
        var subTotal =  hargaBarang * jumlahBarang
        return subTotal
    }

    private fun diskon(){
        Mart.DISKONMEMBER
        var totalDiskon = Mart.totalBelanja * Mart.DISKONMEMBER
        println("""
            Selamat ! karena total belanjaan ${namaMember} lebih besar dari Rp. 50000,
            maka mendapatkan potongan sebesar 9.5%
            ${namaMember} cukup membayar Rp. ${totalDiskon}
        """.trimIndent())
        Mart.totalBelanja = totalDiskon.toInt()
    }

    override fun pembayaran(){
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


}