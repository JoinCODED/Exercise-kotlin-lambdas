fun main() {

    greetSeaCreatures()
    println(findPearl(6))
    println(divideTreasure(1000.0, 5.0))
    println(calculateDepth(1500, 800))
    println(diveMessage("deep sea"))

}

val greetSeaCreatures = {println("Hello, Deep Sea Adventurer!")}

val findPearl = {number: Int ->  number * number }

val divideTreasure = {totalTreasure: Double, numberExplorers: Double -> totalTreasure/numberExplorers}

val calculateDepth: (Int, Int) -> Int = {x, y -> x-y}

fun String.loud(): String{
    return this.uppercase() + "!"
}
val diveMessage: (String) -> String = { message -> message.loud() }


