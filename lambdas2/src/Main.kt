fun main() {
    val findPearl: (Int) -> Int = {pearls -> pearls * pearls}
    val result = findPearl(6)

    println("how many pearls $result")
}