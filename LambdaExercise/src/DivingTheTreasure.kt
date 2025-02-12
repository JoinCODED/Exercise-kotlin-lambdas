val divideTreasure: (Double, Int) -> Double = { treasure, explorers -> treasure / explorers }

fun main() {
    println(divideTreasure(1000.0, 5))
}