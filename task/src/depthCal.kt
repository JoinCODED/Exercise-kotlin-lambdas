fun main(){
    val depth = calculateDepth(1500, 800, ::diff)
    println(depth)
}
fun calculateDepth(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}
fun diff(x: Int, y: Int): Int = x - y