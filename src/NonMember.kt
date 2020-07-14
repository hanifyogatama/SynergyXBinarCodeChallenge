class NonMember() :Anggota(){
    protected fun Int.idr():String{
        return ("Rp. $this,00")
    }

    override fun inputBelanjaan() {
        Mart.barangMartArray
        println("----------------------------")
        println("Checkout Pelanggan Non Member")
        println("----------------------------")
        do {
            print("Input Nama Barang : ")
            var inputBarang = readLine().toString()
            print("Input Harga Satuan Barang : ")
            var hargaBarang = Integer.valueOf(readLine())
            print("Input Jumlah Barang : ")
            var jumlahBarang = Integer.valueOf(readLine())
            Mart.subTotalArray.add(hitung(hargaBarang,jumlahBarang))

            if(Mart.barangMartArray != null && Mart.hargaBarangArray != null && Mart.jumlahBarangArray != null){
                Mart.barangMartArray.add(inputBarang)
                Mart.hargaBarangArray.add(hargaBarang)
                Mart.jumlahBarangArray.add(jumlahBarang)
            }
            println("-------------------------------")
            print("input barang lagi (y/n) : ")
            val inputan = readLine()!!
            val inputanChar : Char= inputan.single()
        } while (inputanChar == 'y')
        perhitunganBelanja()
    }

    override fun perhitunganBelanja(){
        println("----------------------------")
        println("Checkout pelanggan non member ")
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
        if (Mart.totalBelanja > 70000) {
            diskon()
        }
        pembayaran()
    }

    private fun hitung(hargaBarang:Int,jumlahBarang:Int ):Int{
        var subTotal =  hargaBarang * jumlahBarang
        return subTotal
    }

    private fun diskon(){
        Mart.DISKONNONMEMBER
        var totalDiskon = Mart.totalBelanja * Mart.DISKONNONMEMBER
        println("""
            Selamat ! karena total belanjaan lebih besar dari Rp. 70000,
            maka mendapatkan potongan sebesar 4.1%
            cukup membayar Rp. ${totalDiskon}
        """.trimIndent())
        Mart.totalBelanja = totalDiskon.toInt()
    }

    override fun pembayaran(){
        var kembalian : Int = 0
        println("----------------------------")
        println("Checkout pelanggan non member ")
        println("----------------------------")
        println("Total belanja : Rp ${Mart.totalBelanja}")
        print("input uang customer : Rp. ")
        var uangCustomer = Integer.valueOf(readLine())
        print("kembalian : Rp. $kembalian")
        kembalian -= uangCustomer
    }
}