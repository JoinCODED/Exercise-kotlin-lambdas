fun main() {
    println(divideTreasure(1000.0, 5.0));
}

val divideTreasure: (Double, Double) -> Double = { totalTreasure, numExplorers ->
    totalTreasure / numExplorers
};

