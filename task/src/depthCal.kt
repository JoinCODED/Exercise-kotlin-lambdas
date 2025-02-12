fun main() {
    println(calculateDepth(1500, 800) { x, y -> x - y })
}

fun calculateDepth(x: Int, y: Int, differance: (Int, Int) -> Int): Int {
    return differance(x, y)
}