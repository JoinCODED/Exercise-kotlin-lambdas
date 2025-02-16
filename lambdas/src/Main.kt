fun main() {

    greetSeaCreatures ()
    println(findPearl(6))
    println(divideTreasure(1000.0,5))

}

//task 1 lambda with no parameters

val greetSeaCreatures = { println("Hello, Deep Sea Adventurer!") }

// task 2 simple lambda experssion

val findPearl = {pearls: Int -> pearls*pearls }


// task 3 lambda with multiple parameters

val divideTreasure: (Double, Int) -> Double = { tre, exp -> tre/exp }