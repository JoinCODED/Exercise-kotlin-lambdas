fun main() {
   //part 1
    val greetSeaCreatures = { println("Hello, Deep Sea Adventurer!")}
    greetSeaCreatures()

    // part 2
    val findPearl = {numOfPearls: Int -> numOfPearls*numOfPearls }
    println( findPearl(6))

    // part 3
    val divideTreasure = {totalTreasure:Double, numOfExplorers:Double -> totalTreasure/numOfExplorers}
    println(divideTreasure(1000.0,5.0))

    //part 4
println( calculateDepth(1500,700, ::difference))


    //part 5
    val diveMessage={msg: String -> loud(msg)}
println(diveMessage("deep sea"))

}

// part 4
fun calculateDepth(x:Int, y: Int, operation:(Int, Int) -> Int): Int {
    return operation(x,y)
}
fun difference(a: Int, b: Int): Int = a - b


// part 5
fun loud(text: String):String{
return text.uppercase().plus("!!!!")
}

