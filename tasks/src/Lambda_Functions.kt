fun main() {
    val greetSeaCreatures = {println("Hello, Deep Sea Adventurer!")}
    greetSeaCreatures()
    val findPearl = {numPearls: Int -> numPearls * numPearls};
    println(findPearl(6));
    val divideTreasure = {totalTreasure: Double, numExplorers: Double -> totalTreasure / numExplorers};
    println(divideTreasure(1000.0, 5.0));
}