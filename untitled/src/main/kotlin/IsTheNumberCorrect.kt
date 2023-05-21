class IsTheNumberCorrect(val number: Int, val difficulty: String) {
    fun isInputValid() {
        val guess = readln().toIntOrNull()
        if (guess is Int) isTheNumberCorrect(number, guess) else throw Exception("Invalid Input")
    }

    fun isTheNumberCorrect(number: Int, input: Int) {
        when (input) {
            number -> println("Good job! You guessed the number!")
            else -> return if (input > number) {
                println("Incorrect. Number is lower ")
            } else {
                println("Incorrect. Number is higher")
            }
        }
    }

    fun repeat() {
        when (difficulty) {
            "1" -> isInputValid()
            "2" -> repeat(10) { isInputValid() }
            "3" -> repeat(5) { isInputValid() }
        }
        println("Game Over!")
    }
}