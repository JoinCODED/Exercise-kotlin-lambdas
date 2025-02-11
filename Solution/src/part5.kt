fun main() {
    var announcement: String = diveMessage("deep sea");

    println(announcement);
}

fun String.load(): String {
    return this.uppercase();
}

val diveMessage: (String) -> String = { text -> "${text.load()}!"  }
