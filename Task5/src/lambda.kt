//Part 1: Lambda with No Parameters – Greeting the Sea Creatures
val greetSeaCreatures = {"Hello, Deep Sea Adventurer!"}

//Part 2: Simple Lambda Expression – Finding a Hidden Pearl
val findPearl = {pearlNum: Int -> pearlNum * pearlNum }

//Part 3: Lambda with Multiple Parameters – Dividing the Treasure
val divideTreasure = {totalTreasure: Double, explorers: Double -> totalTreasure/explorers }

//Part 4: Higher-Order Function with Lambda – Calculating Depth
val differenceInDepth = {x: Int, y: Int -> x - y}

fun calculateDepth(depth_x: Int, depth_y: Int, depthDiffCalculator: (Int, Int) -> Int): Int {
return depthDiffCalculator(depth_x, depth_y)
}

//Part 5: Lambda with Extension Functions – Diving Message
fun String.loud(): String {
    return  this.uppercase() + "!"
}

val diveMessage = { message: String -> message.loud()}


//Bonus Challenge: Lambda as an Inline Function – Exploring Uncharted Waters
inline fun exploreWaters(action: () -> Unit){
    val startTime = System.currentTimeMillis()

    val endTime = System.currentTimeMillis()

    val timeTaken = endTime - startTime

    action()

    println("Time taken: $timeTaken milliseconds")

}




fun main() {

    var welcomeMsg: String =  greetSeaCreatures() //part1
    println(welcomeMsg) //part1

    var pearlCalculated: Int = findPearl(6) //part2
    println(pearlCalculated) //part2

    var result: Double = divideTreasure(1000.0, 5.0)//part 3
    println(result) //part3

   println(calculateDepth(1500,800, differenceInDepth))//part4

    println(diveMessage("deep sea")) //part5

    exploreWaters {
        println("Exploring the unknown depths...")
    }//Bonus

}