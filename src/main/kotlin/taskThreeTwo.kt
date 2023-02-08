import java.lang.NumberFormatException

fun main() = try {
    println("Введите точки x1,y1,x2,y2,x3,y3:")
    var xone: Double = readLine()!!.toDouble()
    var yone: Double = readLine()!!.toDouble()
    var xtwo: Double = readLine()!!.toDouble()
    var ytwo: Double = readLine()!!.toDouble()
    var xthree: Double = readLine()!!.toDouble()
    var ythree: Double = readLine()!!.toDouble()

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