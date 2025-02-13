fun main() {
    var diveMessage: (String) -> String = {
        it.loud()
    }
    println(diveMessage("deep sea"))
}

fun String.loud(): String {
    var uppercase = this.uppercase() + "!"
    return uppercase
}