fun fooBarQix(number: Int): String {
    val sb = StringBuilder()

    if (number % 3 == 0) sb.append("Foo")
    if (number % 5 == 0) sb.append("Bar")
    if (number % 7 == 0) sb.append("Qix")

    val numberStr = number.toString()
    for (ch in numberStr) {
        when (ch) {
            '0' -> sb.append ("*")
            '3' -> sb.append("Foo")
            '5' -> sb.append("Bar")
            '7' -> sb.append("Qix")

            else -> sb.append(ch)
        }
    }

    return sb.toString()
}

fun main() {
    val input = readln().toInt()
    val result = fooBarQix(input)
    println(result)
}
