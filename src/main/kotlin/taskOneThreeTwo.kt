import java.lang.NumberFormatException

fun main() = try {
    println("Введите x,y,z")
    var x: Int = readln().toInt()
    var y: Int = readln().toInt()
    var z: Int = readln().toInt()
    print("u=")
    if (x < z) {
        print(Math.max(x, y))
    } else if (x >= z) {
        print(Math.min(x, y))
    } else {
    }
} catch (e: NumberFormatException) {
    println("Введено недопустимое значение")
}