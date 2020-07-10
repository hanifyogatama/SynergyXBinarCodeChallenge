

fun main(){
    intro("Synergy_Mart")
    home()
//    intro("Synergy_Mart","Bye")
}

fun home(){
    println("""
        1. Login Kasir
        0. Keluar
    """.trimIndent())
    print("pilih : ")
    when(readLine()){
        "1" -> Mart().login()
        "0" -> return
    }
}

fun intro (martName: String){
    println("------------------------------")
    println("Selamat Datang di $martName")
    println("------------------------------")
}


fun intro (martName: String, pesan: String){
    println("------------------------------")
    println(" $martName")
    println(" $pesan")
    println("------------------------------")
}