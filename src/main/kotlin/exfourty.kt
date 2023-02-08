import kotlin.math.pow
import kotlin.system.exitProcess

fun main() = try {
    var k: Double = readln().toDouble()
    var a: Double = readln().toDouble()
    var b: Double = readln().toDouble()
    var l: Double = readln().toDouble()
    var x1:Double = 0.0
    var x2:Double = 0.0
    var l1: Double
    var l2: Double

    var D: Double = b.pow(2) - 4 * k *a
    if ( D == 0.0) {
        println("Точек пересечения нет")
        exitProcess(0)
    }
    else if (D >= 0.0){
        var x1 = b.pow(2) + Math.sqrt(D) / 2 * k
        x2 = b.pow(2) - Math.sqrt(D) / 2 * k
    }
    else{
        x1 = b.pow(2) + Math.sqrt(D) / 2 * k
    }
    l1 = l / 2 * -1
    l2 = l / 2
    if (x1 != 0.0 && x2 != 0.0){
        if ((x1 >= l1 || x1 <= l2) && (x2 >= l1 || x2 <= l2)){
            println("Обе точки попадают в квадрат")
            println(x1)
            println(x2)
        }
        else if ((x1 >= l1 || x1 <= l2) && (x2 < l1 || x2 > l2)){
            println("Одна точка попадает в квадрат")
            println(x1)
        }
        else if ((x1 < l1 || x1 > l2) && (x2 >= l1 || x2 <= l2)){
            println("Одна точка попадает в квадрат")
            println(x2)
        }
        else {println("Нет точек попадающих в квадрат")}
    }
    else if (x1 != 0.0 && x2 == 0.0){
        if (x1 >= l1 || x1 <= l2){
            println("Точка пересечения одна")
            println(x1)
        }
        else {println("Нет точек попадающих в квадрат")}
    }
    else {}

}
catch(e: NumberFormatException) { println("Введено недопустимое значение") }