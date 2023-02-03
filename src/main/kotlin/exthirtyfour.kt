import kotlin.math.pow
import kotlin.system.exitProcess

fun main() = try {
    var k: Double = readln().toDouble()
    var a: Double = readln().toDouble()
    var b: Double = readln().toDouble()
    var x1:Double
    var x2:Double

    var D: Double = b.pow(2) - 4 * k *a
    if ( D == 0.0) {
        println("Точек пересечения нет")
        exitProcess(0)
    }
    else if (D >= 0.0){
        x1 = b.pow(2) + Math.sqrt(D) / 2 * k
        x2 = b.pow(2) - Math.sqrt(D) / 2 * k
    }
    else{
        x1 = b.pow(2) + Math.sqrt(D) / 2 * k
    }


}
catch(e: NumberFormatException) { println("Введено недопустимое значение") }