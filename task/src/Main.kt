fun main() {

    greetSeaCreatures()
    println((findPearl(6)))
    println(divideTreasure(1000.0, 5.0))
}

val greetSeaCreatures = { println("Hello, Deep Sea Adventurer!")}

val findPearl: (Int) -> Int = {pearl -> pearl * pearl}

val divideTreasure: (Double, Double) -> Double = {totalTreasure, explorers -> totalTreasure / explorers}
