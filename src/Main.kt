fun main() {
    greetSeaCreatures()
    var pearl = findPearl(6);
    println(pearl);
    var amount = divideTreasure( 1000.0, 5.0);
    println(amount);
}


val greetSeaCreatures = { println("Hello, Deep Sea Adventurer!") }
val findPearl: (Int)->Int = {pearls-> pearls*pearls}
val divideTreasure: (Double, Double)->Double = {totalTreasureInKWD, numOfExplorers ->
    val amount = totalTreasureInKWD/numOfExplorers;
    amount // this is wierd but this is how return works in lambda functions wow
}