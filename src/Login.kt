open class Login () {
    private val username : String = "MasAgus"
    private val password : String = "apaajaboleh"
    var inputUsername : String = ""
    var inputPassword : String = ""

    fun login(){
        println("------------------------------")
        println("Selamat datang di synergi mart")
        println("------------------------------")
        print("Username : ")
        inputUsername = readLine().toString()
        print("Password : ")
        inputPassword = readLine(). toString()
            if ( (inputUsername == username) && (inputPassword == password) ) {
                Menu().cekMenu(username)
            } else {
                print("Username / password tidak terdaftar")
                Menu().menu()
            }

    }
}



