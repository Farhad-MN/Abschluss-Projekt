class Fahrrad(user: MutableMap<String, String>):Kategorie(user) {



    val standOrtWaehlen: MutableList<String> = mutableListOf("Start Punkt-1","Start Punkt-2","Start Punkt-3")
    var tourWaehlen: MutableList<String> = mutableListOf("Tour A", "Tour B", "Tour C")
    var dauerWaehlen: MutableList<Int> = mutableListOf(1, 2, 3)
    var schwiergkeit: MutableList<String> = mutableListOf("Leicht", "Mittelschwer", "Schwer")



    fun tourWaehlenFahrrad() {

        println("Tour für Fahrrad")

        println("Wähle eine Start Punkt ein: \"Start Punkt-1\",\"Start Punkt-2\",\"Start Punkt-3\" ")
        println("Bitte geben Sie ein!")
        var eingabe = readln()

        if (eingabe == standOrtWaehlen[0]) {
            var tour = ("${tourWaehlen[0]} ")
            var dauer = ("${dauerWaehlen[0]} Stunde ")
            var schwiergkeit = ("Schwiergkeit: ${schwiergkeit[0]} ")
            println("Ihr gewählte Tour:")
            println("$tour, $dauer, $schwiergkeit")
        }

        if (eingabe == standOrtWaehlen[1]) {
            var tour = ("${tourWaehlen[1]} ")
            var dauer = ("${dauerWaehlen[1]} Stunde ")
            var schwiergkeit = ("Schwiergkeit: ${schwiergkeit[1]} ")
            println("Ihr gewählte Tour:")
            println("$tour, $dauer, $schwiergkeit")
        }

        if (eingabe == standOrtWaehlen[2]) {
            var tour = ("${tourWaehlen[2]} ")
            var dauer = ("${dauerWaehlen[2]} Stunde ")
            var schwiergkeit = ("Schwiergkeit: ${schwiergkeit[2]} ")
            println("Ihr gewählte Tour:")
            println("$tour, $dauer, $schwiergkeit")
        }
    }
}