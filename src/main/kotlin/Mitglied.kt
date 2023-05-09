fun breitMitglied(user: MutableMap<String, String>) {
            var versuche = 3
            var userLogIn = false

            // todo: Anmeldung für die Mitglieder, die eine Konto haben.

            println("Haben Sie eine Konto? Bitte geben Sie ihr E`mail adresse und Password ein!")
    println("-------------")
            while (versuche > 0 && !userLogIn) {
                println("Geben sie ihr Email ein:")
                var email = readln()
                println("Geben sie ihr Password ein:")
                var passWord = readln()
                if (user.containsKey(email) && user[email]==passWord) {
                    userLogIn = true
                    println("Willkommen")
                } else {
                    println("Falsches Passwort.")
                    versuche-=1
                    println("Versuch sie es noch einmal, Sie haben noch $versuche!")

                }
                println("-------------")
            }
            if (versuche == 0) {
                println("Bitte Registrieren!")
                println("Zu Registrieren Bitte (Ok) oder (Eingaben taste) tätigen!")
                val eingabenTaste = readln()
                println(eingabenTaste)



            }

        }


