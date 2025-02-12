import kotlin.math.absoluteValue // for Part 4 to ensure result is always positive
fun main(){
    greetSeaCreatures
    println(findPearl(6))
    println(divideTreasure(1000.0, 5.0))
    val depthDifference = calculateDepth(1500, 800) {x, y -> (x - y).absoluteValue}
    println(depthDifference)
    println(diveMessage("deep sea"))
}
val greetSeaCreatures = println("Hello, Deep Sea Adventurer!")
val findPearl = {numOfPearls: Int -> numOfPearls * numOfPearls}
val divideTreasure = {totalTreasureInKWD: Double, numOfExplorers: Double -> totalTreasureInKWD / numOfExplorers}
fun calculateDepth(locationX: Int, locationY: Int, differenceInDepth: (Int, Int) -> Int ): Int{
    return differenceInDepth(locationX, locationY)
}
fun String.loud(): String{
    return this.uppercase() + "!"
}
val diveMessage = {beLoud: String -> beLoud.loud()}