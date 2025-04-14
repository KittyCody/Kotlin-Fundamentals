fun secondBiggestNum2 (numbers: List<Int>): Int {

    var max = Int.MIN_VALUE
    var secondMax = Int.MIN_VALUE

    for (num in numbers) {
        if (num > max) {
            secondMax = max
            max = num
        }

        else if (num > secondMax && num != max) {
            secondMax = num
        }
    }
        return secondMax
}

fun main() {
    val numbers = readln().split(" ").map { it.toInt() }

    println(secondBiggestNum2(numbers))
}