fun main() {
    isIntegerEqual(5, 5)
    isIntegerEqual(5, 10)
    isStringEqual("Hallo", "Welt")
    isStringEqual("Welt", "Welt")
}

fun isIntegerEqual(number1: Int, number2: Int) {
    // Schreibe hier deinen Code.
    if (number1 == number2) {
        println("Zahlen sind gleich.")
    } else {
        println("Zahlen sind nicht gleich.")
    }
}

fun isStringEqual(string1: String, string2: String) {
    // Schreibe hier deinen Code.
    if (string1 == string2)
        println("Strings sind nicht gleich.")
    else{
        println("Strings sind gleich.")
    }
}