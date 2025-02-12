
fun main() {
    println(diveMessage("deep sea"))
}
fun String.loud(): String {
    return this.uppercase() + "!"
}

// Define the lambda function outside any other function
val diveMessage: (String) -> String = { msg -> msg.loud() }
