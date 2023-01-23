class Mitarbeiter(id: Int, name: String, position: String, gehalt: Int, artDerBeschaeftigung: String, mutterschaftsUrlaub: Boolean){

    var id: Int = id
    var name: String = name
    var position: String = position
    var gehalt: Int = gehalt
    var artDerBeschaeftigung: String = artDerBeschaeftigung
    var mutterschaftsUrlaub: Boolean = mutterschaftsUrlaub

    fun gehaltAusgeben(){
        println("$name : $gehalt")
    }

    fun befoerdern(neuePosition: String, neuesGehalt: Int){
        this.position = neuePosition
        this.gehalt = neuesGehalt
    }

    fun istVerfuegbar(){
        if(this.mutterschaftsUrlaub){
            println("Der/Die Mitarbeiter/in ist zur Zeit nicht verfügbar.")
        }else if(!this.mutterschaftsUrlaub){
            println("Der/Die Mitarbeiter/in ist zur Zeit verfügbar.")
        }else{
            println("Keine Informationen zur verfügbarkeit gefunden!")
        }
    }
}
