fun main() {
    greetSeaCreatures()
    println(findPearl(6))
    println(divideTreasure(1000.0, 5))
    println(calculateDepth(1500,800,depthCalculator))

}

val greetSeaCreatures = {
    println(loud("hello, deep sea"))
}

val findPearl = { numberOfPearls: Int -> numberOfPearls * numberOfPearls}

val divideTreasure = {  totalTreasuresKWD: Double, numberOfExplorers: Int -> totalTreasuresKWD / numberOfExplorers}

val depthCalculator: (Int, Int) -> Int = { location1,location2 -> location1 - location2 }

fun calculateDepth(location1: Int,location2: Int, depthCalculator: (Int,Int)->Int): Int{
    return depthCalculator(location1,location2)
}

val loud: (String)->String = { text -> text.uppercase() }

fun String.loud(): String {
    return this.uppercase() + "!"
}

