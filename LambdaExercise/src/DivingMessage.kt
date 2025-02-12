fun String.loud(): String {
    return this.uppercase() + "!"
}

val diveMessage = { message: String -> message.loud() }

fun main() {
    println(diveMessage("deep sea"))
}