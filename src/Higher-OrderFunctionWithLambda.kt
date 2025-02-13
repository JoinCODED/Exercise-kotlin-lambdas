fun main() {

    val differenceInDepth: (Int, Int) -> Int = { depthA, depthB ->
        depthA - depthB
    }
    println(calculateDepth(1500, 800, differenceInDepth))

}

fun calculateDepth(locationA: Int, locationB: Int, differenceInDepth: (Int, Int) -> Int): Int {
    return differenceInDepth(locationA, locationB)
}
