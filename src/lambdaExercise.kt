val greetSeaCreatures = { println("Hello, Deep Sea Adventurer!") }
val findPearl: (Int) -> Int = {x -> x*x}
val divideTreasure: (Double, Double) -> Double = {x, y -> x/y}

fun main() {
    greetSeaCreatures()
    println(findPearl(6))
    println(divideTreasure(1000.0, 5.0))
}