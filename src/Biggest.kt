fun findBiggestNumber(input: List<String>): Int {

    var biggestNumber = 0

    for(number in input){
        val currentNum = Integer.valueOf(number)
        if(currentNum > biggestNumber){
            biggestNumber = currentNum
        }
    }

    return biggestNumber
}

fun main() {
    val input = readln().split(" ")
    val num = findBiggestNumber(input)

    println(num)
}