
fun findSecondBiggestNum(numbers: List<Int>): Int {

    val sorted = numbers.distinct().sorted()

    val secondBiggestNum = sorted[numbers.size - 2]

    return secondBiggestNum
}

fun main() {

    val numbers = readln().split(" ").map { it.toInt() }

    println(findSecondBiggestNum(numbers))

}