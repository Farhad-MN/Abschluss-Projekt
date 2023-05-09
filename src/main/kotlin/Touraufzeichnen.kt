class Touraufzeichnen(user: MutableMap<String, String>) {


    val standOrtWaehlen  = mutableListOf<String>()
    var tourWaehlen: MutableList<String> = mutableListOf()
    var dauerWaehlen: MutableList<Int> = mutableListOf()
    var schwiergkeit: MutableList<String> = mutableListOf()


    fun tourAufnehmen_Mountainbike() {
        println("Tour wird Aufgezeichnet!")

        val neueTour_Mountainbike = standOrtWaehlen

        for (neueTour_Mountainbike in standOrtWaehlen) {

            standOrtWaehlen.add("Start Punkt-5")
            tourWaehlen.add("Tour D")
            dauerWaehlen.add(5)
            schwiergkeit.add("sehr Schwer")
            print("$standOrtWaehlen $tourWaehlen $dauerWaehlen $schwiergkeit")

        }
        println("Um Tour zu Starten Bitte (Ok) oder (Eingaben taste) tätigen!")
        val eingabenTaste = readln()
        println("$eingabenTaste Viel Spass beim Tour!")

    }

}