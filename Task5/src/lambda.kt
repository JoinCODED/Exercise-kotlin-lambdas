//Part 1: Lambda with No Parameters – Greeting the Sea Creatures
val greetSeaCreatures = {"Hello, Deep Sea Adventurer!"}

//Part 2: Simple Lambda Expression – Finding a Hidden Pearl
val findPearl = {pearlNum: Int -> pearlNum * pearlNum }

//Part 3: Lambda with Multiple Parameters – Dividing the Treasure
val divideTreasure = {totalTreasure: Double, explorers: Double -> totalTreasure/explorers }

//Part 4: Higher-Order Function with Lambda – Calculating Depth
//fun calculateDepth(depth_x: Int, depth_y: int): Int{
//
//}





fun main() {

    var welcomeMsg: String =  greetSeaCreatures() //part1
    println(welcomeMsg) //part1

    var pearlCalculated: Int = findPearl(6) //part2
    println(pearlCalculated) //part2

    var result: Double = divideTreasure(1000.0, 5.0)//part 3
    println(result) //part3


}