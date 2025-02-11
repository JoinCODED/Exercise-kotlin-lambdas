fun main() {
    println(
        calculateDepth(1500, 800, subtract)
    )
}

fun calculateDepth(seaDepth1: Int, seaDepth2: Int, callBack: (Int, Int) -> Int): Int {
    return callBack(seaDepth1, seaDepth2);
}

val subtract: (Int, Int) -> Int = { num1, num2 -> num1 - num2 }