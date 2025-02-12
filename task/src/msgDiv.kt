
fun main() {
    println(diveMessage("deep sea"))
}

val diveMessage: (String) -> String = { msg -> msg.loud() }

fun String.loud(): String {
    return this.uppercase() + "!"
}
//extending function loud to an existing class String