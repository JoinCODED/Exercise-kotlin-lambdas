val divideTreasure: (Double, Int) -> Double ={ totalTreasure , numOfexplorers -> totalTreasure / numOfexplorers}

val treasure  = divideTreasure(1000.0, 5)

fun main(){
    println("$treasure")
}
