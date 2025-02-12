fun main() {
    val depth = calculateDepth(1500, 800) { x, y -> x - y }
    println(depth)
}

fun calculateDepth(x: Int, y: Int, differance: (Int, Int) -> Int): Int {
    return differance(x, y)
}