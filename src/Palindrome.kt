
fun isPalindrome(word: String): Boolean {
    val cleaned = word.lowercase()
    return cleaned == cleaned.reversed()
}

fun main() {
    val input = readln()
    if(isPalindrome(input)){
        println("It is a palindrome!")
    } else {
        println("It is not a palindrome")
    }
}