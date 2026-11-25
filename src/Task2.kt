//На входе функция to_set() получает список чисел. Преобразуйте их в множество. На выходе должно получиться множество и его мощность.

fun toSet(numbers: List<Int>): Set<Int> {
    val result = mutableSetOf<Int>()

    for (number in numbers) {
        result.add(number)
    }

    return result
}

fun main() {
    print("Введите числа через пробел: ")
    val line = readln()
    val parts = line.split(" ")

    val numbers = mutableListOf<Int>()
    for (part in parts) {
        numbers.add(part.toInt())
    }

    val mySet = toSet(numbers)

    println("Множество: $mySet")
    println("Мощность множества: ${mySet.size}")
}