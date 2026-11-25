//Напишите программу, которая удаляет дубликаты из списка.

fun removeDuplicates(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()

    for (number in list) {
        if (!result.contains(number)) {
            result.add(number)
        }
    }

    return result
}

fun main() {
    println("Удаление дубликатов из списка")

    print("Введите числа через пробел: ")
    val line = readln()
    val parts = line.split(" ")

    val numbers = mutableListOf<Int>()
    for (part in parts) {
        numbers.add(part.toInt())
    }

    val unique = removeDuplicates(numbers)

    println("Исходный список: $numbers")
    println("Список без дубликатов: $unique")
}