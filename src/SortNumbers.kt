fun sortNumbers(input: List<Int>): List<Int> {
    val numbers = input.toMutableList()

    for (i in input.indices){
        for (j in 0..<input.size - i - 1){

            if (numbers[j] == numbers[j+1]){
               numbers.removeAt(j+1)
            }

            if (numbers[j] > numbers[j + 1]){
                val temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }

    return numbers
}

fun main() {
    val input = readln().split(" ").map { it.toInt() }
    val result = sortNumbers(input)
    println(result)
}
