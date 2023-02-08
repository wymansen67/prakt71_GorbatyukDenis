fun main() = try {

    val a: Double = readln().toDouble()
    val b: Double = readln().toDouble()
    val c: Double = readln().toDouble()
    val P: Double
    var max: Double
    var min: Double

    if (a > b) max = a
    else max = b
    if (max < c) max = c
    else {
    }

    if (a > b) min = b
    else min = a
    if (min > c) min = c
    else {
    }

    P = max + min / 2
    println(P)

} catch (e: NumberFormatException) {
    println("Введено недопустимое значение")
}