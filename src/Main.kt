fun main() {
    println("Hello World!")
    greetSeaCreatures();
    println("${findPearl(6)}")
    println("${divideTreasure(1000.0,5)}")
    println(calculateDepth(1500,800))
    println(diveMessage("Hello world"))
//    println(trainees)

}
val greetSeaCreatures = { println("Hello, Deep Sea Adventurer!") }

val findPearl = {pearl: Int -> pearl * pearl}

val divideTreasure: (Double, Int) -> Double = {totalTreasure, explorers ->
    //to understand return in lambda
    if (totalTreasure<0){
        0.0
    }
    else {
        totalTreasure / explorers
    }
}
//val trainees = arrayListOf("aziz","aziz");
val calculateDepth = {depth1: Int, depth2: Int -> depth1 - depth2}

fun String.loud(): String = this.uppercase() + "!"
val diveMessage = {message: String -> message.loud()}