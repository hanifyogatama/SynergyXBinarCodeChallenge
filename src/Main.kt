
fun main(){
    intro("Synergy Mart")
    Login().login()
//    intro("Synergy_Mart","Bye")
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