open class Kategorie {


    var user: MutableMap<String, String>

    constructor(user: MutableMap<String, String>) {
        this.user = user
    }

    val sportArt1 = "Mountainbike"
    val sportArt2 = "Fahrrad"
    val sportArt3 = "Wandern"




    open fun Mountainbike(){
        println("Wählen Sie ihr Sportart: $sportArt1 ")
        println("Bitte (Ok) oder (Eingaben taste) Bestätigen!")
        val eingabenTaste = readln()
        println(eingabenTaste)

    }
    open fun Fahrrad(){
        println("Wählen Sie ihr Sportart: $sportArt2")
        println("Bitte (Ok) oder (Eingaben taste) Bestätigen!")
        val eingabenTaste = readln()
        println(eingabenTaste)

    }
    open fun Wandern(){
        println("Wählen Sie ihr Sportart: $sportArt3")
        println("Bitte (Ok) oder (Eingaben taste) Bestätigen!")
        val eingabenTaste = readln()
        println(eingabenTaste)

    }

}