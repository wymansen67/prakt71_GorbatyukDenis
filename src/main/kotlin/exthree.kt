fun main() = try {
    println("Введите первый член геометрической прогресси")
    var b1 = readln().toInt()
    println("Введите знаменатель геометрической прогрессии")
    var q = readln().toInt()
    var bn: Int
    println("Введите конечный элемент прогрессии")
    do {
        bn = readln().toInt()
        if (bn <= b1) println("Конечный элемент должен быть больше начального")
    } while (bn <= b1)

    var sum: Double

    sum = ((bn * q - b1 / q - 1).toDouble())

    println("Сумма элементов геометрической прогрессии от $b1 до $bn равна $sum")

} catch (e: NumberFormatException) {
    println("Введено недопустимое значение")
}