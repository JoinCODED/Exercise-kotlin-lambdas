fun main() {

    greetSeaCreatures()
    println((findPearl(6)))
}

val greetSeaCreatures = { println("Hello, Deep Sea Adventurer!")}

val findPearl: (pearl: Int) -> Int = {pearl -> pearl * pearl}

val
