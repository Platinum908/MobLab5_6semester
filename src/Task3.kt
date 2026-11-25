//Дан словарь с товарами. Выведите на экран все товары, цена которых не превышает 100 рублей, а текущий остаток не менее 10 кг

class Product(val price: Double, val stock: Double)

fun main() {
    val products = mapOf(
        "Яблоки" to Product(80.0, 10.0),
        "Бананы" to Product(95.0, 20.0),
        "Груши" to Product(120.0, 30.0),
        "Картофель" to Product(35.0, 100.0),
        "Морковь" to Product(100.0, 5.0),
        "Виноград" to Product(250.0, 3.0)
    )

    println("Товары с ценой не больше 100руб и остатком не меньше 10кг:")

    for (name in products.keys) {
        val product = products[name]!!

        if (product.price <= 100 && product.stock >= 10) {
            println("$name: цена ${product.price} руб, остаток ${product.stock} кг")
        }
    }
}