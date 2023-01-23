fun main(){
    var mitarbeiter1: Mitarbeiter = Mitarbeiter(1, "Fetullah Andug", "CEO/Founder", 500000, "Inhaberschaft", false)
    var mitarbeiter2: Mitarbeiter = Mitarbeiter(2, "Max Maier", "Angestellter/Sklave", 50000, "Vollzeit-Sklave", false)
    var mitarbeiter3: Mitarbeiter = Mitarbeiter(3, "Hannelore Papaya", "Angestellter/Sklave", 25000, "Teilzeit-Sklave", false)

    mitarbeiter1.gehaltAusgeben()
    mitarbeiter2.befoerdern("Exklusiv-Sklave/Manager", 75000)
    mitarbeiter2.gehaltAusgeben()
    println(mitarbeiter2.position)
    mitarbeiter3.istVerfuegbar()
}