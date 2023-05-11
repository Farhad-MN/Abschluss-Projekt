



fun Registrieren(user: MutableMap<String, String>): MutableMap<String, String> {

            //todo: Registrieren für neue Benutzer.

     val name: String
     val vorname: String
     val geburtsjahr: Int
     val geschlecht: Char
     val emailAdress: String
     val telefonnummer: String




        println("Geben sie ihren Vornamen ein:")
        name = readln()
        Thread.sleep(700)

        println("Geben sie ihren Nachnamen ein:")
        vorname = readln()
        Thread.sleep(700)

        println("Geben sie ihr Geburtsjahr ein:")
       geburtsjahr = readln().toInt()
        Thread.sleep(700)

        println("Geben sie ihr Geschlecht ein: (m/w/d)")
        geschlecht = readln().first()
        Thread.sleep(700)

        println("Geben sie ihre E-Mail adresse ein:")
        emailAdress = readln()
        Thread.sleep(700)

        println("Geben sie ihre Telefonnummer ein:")
        telefonnummer = readln()
        Thread.sleep(700)

        println("Bitte wählen Sie ihr Password")
        val password: String = readln()
        println("Bitte wiederholen Sie ihr Password")
        val passWordWiederholen= readln()



    println("-------------")

        println("Ihr neuer Account wurde erstellt mit den folgenden Daten: \n Name: $name" +
                "\n Vorname: $vorname \n Geburtsjahr: $geburtsjahr \n " +
                "Geschlecht: $geschlecht \n E'mail: $emailAdress \n Telefonnummer: $telefonnummer \n Passwort: $password")

    println("-------------")

        println("Willkommen")
    return user
}




