

fun main(){


    var user= mutableMapOf<String,String>("muster@gmail.de" to "Frutti")

    println("------------------------")
        //todo => Breit Mitglied.

    breitMitglied(user)

    println("------------------------")

        //todo => Registrieren
    Registrieren(user)

    println("------------------------")

        //todo => Sportarten wählen 1. Mountainbike 2. Fahrrad 3. Wandern

                //todo: 1. Sportarten => Mountainbike
    val kategorie1:Kategorie=Kategorie(user)
    kategorie1.Mountainbike()

    val mountainbike:Mountainbike = Mountainbike(user)
    mountainbike.tourWahelen()

    println("------------------------")

                //todo: 2. Sportarten => Fahrrad

    val kategorie2:Kategorie=Kategorie(user)
    kategorie2.Fahrrad()

    val fahrrad:Fahrrad = Fahrrad(user)
    fahrrad.tourWahelen_Fahrrad()

    println("------------------------")


                //todo: 3. Sportarten => Wandern

    val kategorie3:Kategorie=Kategorie(user)
    kategorie3.Wandern()

    val wandern:Wandern = Wandern(user)
    wandern.tourWahelen_Wandern()

    println("------------------------")

        //todo => Tour planen, für die Sportarten.

    val tourPlanen:TourPlanen = TourPlanen(user)
    tourPlanen.tourHinzufuegen_Mountainbike()

    println("------------------------")

        //todo => Tour Aufzeichnen, für die Sportarten.

    val touraufzeichnen:Touraufzeichnen = Touraufzeichnen(user)
    touraufzeichnen.tourAufnehmen_Mountainbike()






}


