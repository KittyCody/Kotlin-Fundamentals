fun findBiggestNum(numbers: List<Int>): Int {

    var biggestNum = numbers[0]

    for (i in 1..<numbers.size) {
        val currentNum = numbers[i]
        if (currentNum > biggestNum) {
            biggestNum = currentNum
        }
    }
    return biggestNum
}

    fun main() {
        val numbers = readln().split(" ").map { it.toInt() }

        println(findBiggestNum(numbers))

    }

