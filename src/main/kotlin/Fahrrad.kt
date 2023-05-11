
                        //todo: =>  zuerst wird die Variable initialisiert.
                        //    die Schleife läuft (while) mit (joinToString) Kontrolliert die leerzeichnen von
                        //    die Liste, bein fehlende leerzeichnen wird das Programm angehalten,
                        //    kommt dann auf nächste versuch. bis die richtig angaben gegeben ist.


class Fahrrad(user: MutableMap<String, String>):Kategorie(user) {


    val standOrtWaehlen: MutableList<String> = mutableListOf("Start Punkt-1", "Start Punkt-2", "Start Punkt-3")
    var tourWaehlen: MutableList<String> = mutableListOf("Tour A", "Tour B", "Tour C")
    var dauerWaehlen: MutableList<Int> = mutableListOf(1, 2, 3)
    var schwiergkeit: MutableList<String> = mutableListOf("Leicht", "Mittelschwer", "Schwer")


    fun tourWaehlenFahrrad() {

        println("Wähle einen Startpunkt aus: ${standOrtWaehlen.joinToString()}")
        var eingabe = readln()
        while (eingabe !in standOrtWaehlen) {
            println("Fehlerhafte Eingabe! Bitte wählen Sie einen gültigen Startpunkt aus: ${standOrtWaehlen.joinToString()}")

            eingabe = readLine().toString()
        }

        val index = standOrtWaehlen.indexOf(eingabe)
        var tour = ("${tourWaehlen[index]} ")
        var dauer = ("Dauer: ${dauerWaehlen[index]} Stunde ")
        val schwierigkeitsgrad = schwiergkeit[index]
        println("Ihr gewählte Tour:")
        println("$tour, $dauer, Schwierigkeitsgrad: $schwierigkeitsgrad")

    }
}