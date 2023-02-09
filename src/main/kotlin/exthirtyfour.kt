import kotlin.math.pow
import kotlin.system.exitProcess

fun main() = try {
    var k: Double = readln().toDouble()
    var a: Double = readln().toDouble()
    var b: Double = readln().toDouble()
    var x1: Double = 0.0
    var x2: Double = 0.0

    var D: Double = b.pow(2) - 4 * k * a

    if (D == 0.0) {
        println("Точек пересечения нет")
        exitProcess(0)
    } else if (D >= 0.0) {
        x1 = b.pow(2) + Math.sqrt(D) / 2 * k
        x2 = b.pow(2) - Math.sqrt(D) / 2 * k
    } else {
        x1 = b.pow(2) + Math.sqrt(D) / 2 * k
    }
    if (x1 != 0.0 && x2 != 0.0) {
        println("Точек пересечения - две")
        println(x1)
        println(x2)
    } else if (x1 != 0.0 && x2 == 0.0) {
        println("Точек пересечения - одна")
        println(x1)
    } else {
    }

} catch (e: NumberFormatException) {
    println("Введено недопустимое значение")
}