fun calculateDepth(location1: Int, location2: Int, depthCalculator: (Int, Int) -> Int): Int {
    return depthCalculator(location1, location2)
}

fun main() {
    val depthDifference = calculateDepth(1500, 800) { loc1, loc2 -> loc1 - loc2 }
    println(depthDifference)
}
