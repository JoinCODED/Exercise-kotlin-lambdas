val divideTreasure: (Double, Double) -> Double= {treasure, explorers -> treasure / explorers}
fun main(){
    val result = divideTreasure(1000.0, 5.0)
    println("$result")
}