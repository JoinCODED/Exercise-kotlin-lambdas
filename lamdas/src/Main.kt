fun main() {
    greetSeaCreatures()
    println(findPearl(6))
    println(divideTreasure(1000.0,5))
    val result = calculateDepth(1500, 800) {depth1, depth2 -> if (depth1 > depth2) depth1 - depth2 else depth2 - depth1}
    println(result) //added an if statement to ensure result is always positive
    println(diveMessage("deep sea"))
}


val greetSeaCreatures = { println("Hello, Deep Sea Adventurer!")}

val findPearl: (Int) -> Int = { x -> x * x }

val divideTreasure = {total: Double, explorers: Int -> total / explorers}

fun calculateDepth(depth1: Int, depth2: Int, difference: (Int, Int) -> Int): Int {
    return difference(depth1, depth2)
}

fun String.loud(): String {
    return this.uppercase() + "!"
}

val diveMessage = {text: String -> text.loud()}

