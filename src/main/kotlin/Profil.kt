

class Profil(user: MutableMap<String, String>,
                  var name: String,
                  var vorname: String,
                  var geburtsjahr: Int,
                  var geschlecht: Char,
                  var `e-mail`: String,
                  var telefonnummer: String,
                  private var password: String

) {



     init {

          this.name = name
          this.vorname = vorname
          this.geburtsjahr = geburtsjahr
          this.geschlecht = geschlecht
          this.`e-mail` = `e-mail`
          this.telefonnummer = telefonnummer
          this.password = password



     }



}