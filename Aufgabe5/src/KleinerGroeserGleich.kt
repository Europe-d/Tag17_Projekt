fun main() {
    println(compareNumbers(2, 5))
    println(compareNumbers(5, 5))
    println(compareNumbers(6, 5))

    println(compareNumbers2(2, 5))
    println(compareNumbers2(5, 5))
    println(compareNumbers2(6, 5))
}

fun compareNumbers(number1: Int, number2: Int) :Boolean {
    // Schreibe hier deinen Code.
    return number1 <= number2

}


fun compareNumbers2(number1: Int, number2: Int) :Boolean {
    // Schreibe hier deinen Code.
    if (number1 <= number2){
        return true
    } else {
        return false
    }

}