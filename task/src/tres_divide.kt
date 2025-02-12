fun main(){
    println(divideTreasure(1000.0,5))
}
val divideTreasure: (Double, Int) -> Double = { tres, explorerNum -> tres/explorerNum }