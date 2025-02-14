fun calculateDepth(location1: Int, location2: Int, depthDifference: (Int, Int) -> Int): Int {
    return depthDifference(location1, location2)
}

fun main() {
    val result = calculateDepth(1500, 800) { location1, location2 -> location1 - location2 }
    
    println(result)
}
