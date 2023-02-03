fun main() = try {
    var x: Byte = readln().toByte()
    var y: Byte = readln().toByte()

    if ( x > 0 && y > 0 ) println("Первая четверть")
    else if ( x > 0 && y < 0 ) println("Четвертая четверть")
    else if ( x < 0 && y > 0 ) println("Вторая четверь")
    else if ( x < 0 && y < 0 ) println("Третья четверть")
    else {}
}
catch(e: NumberFormatException) { println("Введено недопустимое значение") }