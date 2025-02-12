val greetSeaCreatures = { println("Hello, Deep Sea Adventurer!") }
val findPearl: (Int) -> Int = {x -> x*x}
val divideTreasure: (Double, Double) -> Double = {x, y -> x/y}
val difference: (Int, Int) -> Int = { x, y -> x - y }

fun calculateDepth(x: Int, y: Int, result: (Int, Int) -> Int): Int{
    return result(x, y)
}

fun main() {
    greetSeaCreatures()
    println(findPearl(6))
    println(divideTreasure(1000.0, 5.0))
    println(calculateDepth(1500, 800, difference))
}