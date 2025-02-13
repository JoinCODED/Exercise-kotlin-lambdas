fun String.loud(): String {
    return this.uppercase() + "!"
}
val diveMessage: (String) -> String = {text -> text.loud()}
fun main(){
    println(diveMessage("deep sea"))
}