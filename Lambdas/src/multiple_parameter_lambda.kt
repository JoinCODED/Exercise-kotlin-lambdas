fun main() {
    val divideTreasure: (Double, Double) -> Double = { treasure, explorers -> treasure / explorers }

    val result = divideTreasure(1000.0, 5.0)

    println(result)
}
