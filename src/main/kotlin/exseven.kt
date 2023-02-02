import kotlin.math.pow

fun main() = try{
    println("Введите x ")
    var x = readln()!!.toDouble()
    println("Введите y ")
    var y = readln()!!.toDouble()
    println("Введите z ")
    var z = readln()!!.toDouble()

    var a: Double = 3 + Math.E.pow( y - 1 ) / 1 + x.pow(2) * Math.abs( y - Math.tan(z) ).pow(2)
    var b: Double = 1 + Math.abs( y - x ) + (y - x).pow(2) / 2 + (y - x).pow(3) / 3

    println(a)
    println(b)

}
catch (e: NumberFormatException) { println("Введено недопустимое значение") }