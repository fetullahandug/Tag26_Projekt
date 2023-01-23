fun main() {

    var firstBus: Bus = Bus()
    var secondBus: Bus = Bus()
    var thirdBus: Bus = Bus()


    firstBus.honk()


    val ps = firstBus.horsePower
    println("Ganze $ps PS hat unser Bus.")

    firstBus.horsePower = 750
    var newPs = firstBus.horsePower
    println("Jetzt hat unser Bus sogar $newPs PS!")

    println("PS des zweiten Busses: ${secondBus.horsePower}")
    println("PS des dritten Busses: ${thirdBus.horsePower}")

    // Nachdem euer erstellter Bus einmal gehupt hat, soll über einen Funktionsaufruf die Durchsage getätigt werden.
    // Hier drunter könnten ihr weitercoden:

    firstBus.honk()
    firstBus.durchsage()

    println(firstBus.seats)
}