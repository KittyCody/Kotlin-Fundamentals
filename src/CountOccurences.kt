fun main() {
    val numbers = readln().split(" ")
        .filter { it.isNotBlank() }
        .map { it.toInt() }

    val counts = numbers.groupingBy { it }.eachCount()

    for ((number, count) in counts) {
        println("$number appears $count ${if (count == 1) "time" else "times"}")
    }
}
