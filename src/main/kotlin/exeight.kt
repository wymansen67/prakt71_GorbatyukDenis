import kotlin.math.pow

fun main() = try {

    val x: Int = -1 * 2 / 3

    var z:Double = 5 * x.pow(3) + 70 * x.pow(2) + 14 * x
}
catch(e: NumberFormatException) { println("Введено недопустимое значение") }