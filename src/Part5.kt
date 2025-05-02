import java.io.StringReader


val load : String.() -> String = {this.uppercase() +"!"}
val devideMessage: (String) -> String = {it.load()}

fun main(){

    val res = devideMessage("deep sea")
        println(res)
}