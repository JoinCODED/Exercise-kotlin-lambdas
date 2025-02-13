val calculateDepth: (Int, Int) -> Int = { location1, location2 -> location1 - location2 }
fun main (){
    val result = calculateDepth(1500, 800)
    println(result)
}