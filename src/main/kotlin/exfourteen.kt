fun main() = try {
    var x: Int = readln().toInt()
    val y: Int = readln().toInt()
    val m: Int = readln().toInt()
    val n: Int = readln().toInt()

    var z1: Int = x - y
    var z2: Int = m / n
    if (z1 < z2) x + 1
    else {
    }

    println(x)
} catch (e: NumberFormatException) {
    println("Введено недопустимое значение")
}