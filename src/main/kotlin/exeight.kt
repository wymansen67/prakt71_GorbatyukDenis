import kotlin.math.pow

fun main() = try {

    val x: Double = -1.0 * 2.0 / 3.0

    var z: Double = 5 * x.pow(3) + 70 * x.pow(2) + 14 * x

    println(z)
} catch (e: NumberFormatException) {
    println("Введено недопустимое значение")
}