const val DISMAX = 0.95
const val DISMELOMAN: Double = 0.99
const val DISMIN: Double = 100.0
const val PRICE: Int = 100

fun main() {

    val totalDis: Double
    print("Укажите количество товара к покупке: ")
    val count: Int = readln().toInt()
    val total = PRICE * count
    print("Были ли вы у нас раньше, для ответа использовать Y/N:")
    val input: String = readln()
    val meloman: Boolean = input == "Y"

    if (meloman) {
        if (total < 1000) {
            totalDis = total * DISMELOMAN
            println("Итого к оплате $totalDis руб.")
        } else if (total in 1001..9999) {
            totalDis = total - DISMIN * DISMELOMAN
            println("Итого к оплате $totalDis руб.")
        } else if (total > 10000) {
            totalDis = total * DISMAX * DISMELOMAN
            println("Итого к оплате $totalDis руб.")
        }

    } else if (!meloman) {
        if (total < 1000) {
            totalDis = total * 1.0
            println("Итого к оплате $totalDis руб.")
        } else if (total in 1001..9999) {
            totalDis = total - DISMIN
            println("Итого к оплате $totalDis руб.")
        } else if (total > 10000) {
            totalDis = total * DISMAX
            println("Итого к оплате $totalDis руб.")
        }

    }
}