fun main() {
    compareNumbers(5, 2)
    compareNumbers(5, 7)
    compareNumbers(5, 5)
}

fun compareNumbers(number1: Int, number2: Int) {
    // Schreibe hier deinen Code.
    if (number1 > number2) {
        println("Die erste Zahl ist größer.")
    } else {

        if (number1 < number2)
            println("Die erste Zahl ist kleiner")

        if (number1 == number2)
            println("Die erste Zahl mit zweite sind gleich .")
    }

}
