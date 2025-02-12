import kotlin.random.Random

fun main() {
    // part 1
    val greetSeaCreatures = {println("Hello, Deep Sea Adventurer!")}
    greetSeaCreatures()

    // part 2
    val findPearl = {numPearls: Int -> numPearls * numPearls};
    println(findPearl(6));

    // part 3
    val divideTreasure = {totalTreasure: Double, numExplorers: Double -> totalTreasure / numExplorers};
    println(divideTreasure(1000.0, 5.0));

    // part 4
    println(calculateDepth(1500, 800) {a, b -> a - b});

    // part 5
    val diveMessage = {message: String -> message.loud()};
    println(diveMessage("deep sea"));

    // bonus
    exploreWaters {println("Exploring the unknown depths...")};


}

fun calculateDepth(location1: Int, location2: Int, operation: (Int, Int) -> Int): Int {
    return operation(location1, location2);
}

fun String.loud(): String {
    return "${this.uppercase()}!"
}

inline fun exploreWaters(action: () -> Unit) {
    var startTime: Double = Random.nextDouble(0.0, 600.0);
    var endTime: Double = Random.nextDouble(800.0, 1200.0);
    action();
    println("Time Taken: ${String.format("%.2f", (endTime - startTime))} milliseconds");


}