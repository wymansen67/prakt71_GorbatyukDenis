import java.lang.NumberFormatException

fun main() = try {
    println("Введите длину окружности")
    var l: Double = readln().toDouble()

    var s: Double
    var r: Double

    r = l / 2 * 3.14
    s = 3.14 * r * r

    println("Площадь круга, ограничеснной этой окружностью:" + s)
} catch (e: NumberFormatException) {
    println("Введено недопустимое значение")
}