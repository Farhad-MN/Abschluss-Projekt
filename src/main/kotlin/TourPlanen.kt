

                    //todo: =>  hier wird die MutableListe fest gelegt, und wird eine neue
                    // Tour geplant mit hilfe schleife (if ) und wird in die vorhandene liste zugefügt.


class TourPlanen(user: MutableMap<String, String>):Kategorie(user) {



    val standOrtWaehlen: MutableList<String> = mutableListOf("Start Punkt-1","Start Punkt-2","Start Punkt-3")
    var tourWaehlen: MutableList<String> = mutableListOf("Tour A", "Tour B", "Tour C")
    var dauerWaehlen: MutableList<Int> = mutableListOf(1, 2, 3)
    var schwiergkeit: MutableList<String> = mutableListOf("Leicht", "Mittelschwer", "Schwer")


    fun tourHinzufuegenMountainbike() {

        println("Tour für Mountainbike wird Hinzugefügt!")

        val neueTourMountainbike = standOrtWaehlen


        if (neueTourMountainbike == standOrtWaehlen) {

            standOrtWaehlen.add("(Start Punkt-4)")
            tourWaehlen.add("(Tour D)")
            dauerWaehlen.add((4))
            schwiergkeit.add("(sehr Schwer)")

            print("\n $standOrtWaehlen \n $tourWaehlen \n $dauerWaehlen \n $schwiergkeit ")
        }

        println("\n Um Tour zu Starten Bitte (Ok) oder (Eingaben taste) Bestätigen!")
        val eingabenTaste = readln()
        println("$eingabenTaste Viel Spass beim Tour!")
    }
}