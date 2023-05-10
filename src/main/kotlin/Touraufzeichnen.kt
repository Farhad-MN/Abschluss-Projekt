class Touraufzeichnen(user: MutableMap<String, String>):Kategorie(user) {




    val standOrtWaehlen  = mutableListOf<String>("Start Punkt-1","Start Punkt-2","Start Punkt-3","Start Punkt-4")
    var tourWaehlen: MutableList<String> = mutableListOf("Tour A", "Tour B", "Tour C")
    var dauerWaehlen: MutableList<Int> = mutableListOf(1, 2, 3, 4)
    var schwiergkeit: MutableList<String> = mutableListOf("Leicht", "Mittelschwer", "Schwer")




    fun tourAufnehmenMountainbike() {
        println("Tour wird Aufgezeichnet!")

        val neueTourMountainbike = standOrtWaehlen

        if (neueTourMountainbike == standOrtWaehlen) {

            standOrtWaehlen.add("Start Punkt-5")
            tourWaehlen.add("Tour D")
            dauerWaehlen.add(5)
            schwiergkeit.add("sehr Schwer")

            print("\n $standOrtWaehlen \n $tourWaehlen \n $dauerWaehlen \n $schwiergkeit")

        }

        println("Um Tour zu Starten Bitte (Ok) oder (Eingaben taste) tätigen!")
        val eingabenTaste = readln()
        println("$eingabenTaste Viel Spass beim Tour!")

    }

}