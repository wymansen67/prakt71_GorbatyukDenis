import java.lang.NumberFormatException

fun main() = try {
    println("Введите точки x1,y1,x2,y2,x3,y3:")
    var xone: Double = readln().toDouble()
    var yone: Double = readln().toDouble()
    var xtwo: Double = readln().toDouble()
    var ytwo: Double = readln().toDouble()
    var xthree: Double = readln().toDouble()
    var ythree: Double = readln().toDouble()

    var x: Double
    var y: Double
    var z: Double
    var pone: Double
    var ptwo: Double
    var s: Double

    x = Math.sqrt(xtwo - xone) + Math.sqrt(ytwo - yone)
    y = Math.sqrt(xthree - xtwo) + Math.sqrt(ythree - ytwo)
    z = Math.sqrt(xthree - xone) + Math.sqrt(ythree - yone)
    pone = (x + y + z)
    ptwo = pone / 2
    s = Math.sqrt(ptwo * (ptwo - x) * (ptwo - y) * (ptwo * z))
    println("Площадь:" + s)
    println("Периметр:" + pone)


} catch (e: NumberFormatException) {
    println("Введено недопустимое значение")
}