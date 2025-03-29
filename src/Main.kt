// №1
fun main(args: Array<String>) {
    println("------Задание 1------")
    // №1
    println("Иван")
    println(35)
    println(true)

    // №2
    println("------Задание 2------")
    val numberInt: Int = 5
    val char: Char = 'F'
    val string: String = "Привет"
    val numberDouble: Double = 90.2

    val constantValue: Int = 67

    println(string)

    // №3
    println("------Задание 3------")
    println("Число:")
    val input = readLine()

    if (input != null && input.length == 4 && input.all { it.isDigit() }) {
        val number = input.toInt()
        val dig1 = number / 1000
        val dig2 = (number % 1000) / 100
        val dig3 = (number % 100) / 10
        val dig4 = number % 10

        println("$dig1, $dig2, $dig3, $dig4")
    }

    // №4
    println("------Задание 4------")
    val totalDays = 2642

    val year = totalDays / 365
    val weeks = (totalDays % 365) / 7
    val days = (totalDays % 365) % 7

    println("Дней: $totalDays")
    println("Лет: $year, недель: $weeks, дней: $days")

    // №5
    println("------Задание 5------")
    println("Введите число:")
    val my_input = readLine()

    if (my_input != null && my_input.toIntOrNull() != null) {
        val n = my_input.toInt()
        //val result = n + n * 2
        println("Итого: $n${n * 2}")
    }

    // №6
    println("------Задание 6------")
    println("Имя: ")
    val name = readLine()

    println("Возраст:")
    val ageInput = readLine()

    if (name != null && ageInput != null && ageInput.toIntOrNull() != null) {
        val age = ageInput.toInt()
        println("Привет, $name! Тебе уже $age.")
    }
}
