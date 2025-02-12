fun main() {
val divideTreasure: (Double,  Double) -> Double = { totalTreasure, numExplorers ->
    totalTreasure / numExplorers
}
val result = divideTreasure(1000.0, 5.0)
    println("each explorer gets $result KWD")
}
