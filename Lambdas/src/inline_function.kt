// i had to look this up because i wasnt sure what an inline function is
//but apperantly action is a unit type lambda, hopefully its right
inline fun exploreWaters(action: () -> Unit) {
    val startTime = System.currentTimeMillis()
    action()
    val endTime = System.currentTimeMillis()
    println("Time taken: ${endTime - startTime} milliseconds")
}

fun main() {
    exploreWaters {
        println("Exploring the unknown depths...")
    }
}
