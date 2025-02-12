fun main() {
    exploreWaters()
    {
        println("Exploring the unknown depths...")
    }
}
inline fun exploreWaters(explore: () -> Unit) {
    val start = System.currentTimeMillis()
    explore()

    val end = System.currentTimeMillis()

    println("Time taken: ${end - start} milliseconds")
}
