fun main(){
    //1
    val greetSeaCreatures = { println("Hello, Deep Sea Adventurer!") }
    greetSeaCreatures()

    //2
    val findPearl :(Int )-> Int ={pearls -> pearls*pearls}
    val pearls =6
    val numOfPearls= findPearl(pearls)
    println(numOfPearls)

    //3
    val divideTreasure : (Double,Double)-> Double ={totalTreasure ,numberOfExplorers -> totalTreasure / numberOfExplorers}
    val numberOfExplorers = 5.0
    val totalTreasure = 1000.0
    val resultOfDivideTreasure = divideTreasure(totalTreasure, numberOfExplorers)
    println(resultOfDivideTreasure)


    //4










}