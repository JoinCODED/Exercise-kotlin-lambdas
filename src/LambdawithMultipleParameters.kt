fun main() {
    val divideTreasure: (Double, Double) -> Double = { totalTreasure, numberOfExplorers ->
        totalTreasure/numberOfExplorers
    }

    println(divideTreasure(1000.0, 5.0))
}