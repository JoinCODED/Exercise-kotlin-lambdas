
fun String.loud() = this.uppercase() + "!"

fun main() {
    val diveMessage: (String) -> String = { it.loud() }
    println(diveMessage("deep sea"))
}
