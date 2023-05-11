
                        //Hier soll die Programmsteuerung implementiert werden.
                        // d.H hier sollen nur Funktionen aufgerufen werden.
fun main(){


    val user= mutableMapOf<String,String>("muster@gmail.de" to "Frutti")

    println("------------------------")
        //todo => Breit Mitglied.

    BreitMitglied(user)

    println("------------------------")

        //todo => Registrieren
    Registrieren(user)

    println("------------------------")

        //todo => Sportarten wählen 1. Mountainbike 2. Fahrrad 3. Wandern

                //todo: 1. Sportarten => Mountainbike
    val kategorie1:Kategorie=Kategorie(user)
    kategorie1.Mountainbike()

    val mountainbike:Mountainbike = Mountainbike(user)
    mountainbike.tourWaehlenMountainbike()

    println("------------------------")

                //todo: 2. Sportarten => Fahrrad

    val kategorie2:Kategorie=Kategorie(user)
    kategorie2.Fahrrad()

    val fahrrad:Fahrrad = Fahrrad(user)
    fahrrad.tourWaehlenFahrrad()

    println("------------------------")


                //todo: 3. Sportarten => Wandern

    val kategorie3:Kategorie=Kategorie(user)
    kategorie3.Wandern()

    val wandern:Wandern = Wandern(user)
    wandern.tourWaehlenWandern()


    println("------------------------")

        //todo => Tour planen, für die Sportarten.

    val tourPlanen:TourPlanen = TourPlanen(user)
    tourPlanen.tourHinzufuegenMountainbike()

    println("------------------------")

        //todo => Tour Aufzeichnen, für die Sportarten.

    val touraufzeichnen:Touraufzeichnen = Touraufzeichnen(user)
    touraufzeichnen.tourAufnehmenMountainbike()






}


