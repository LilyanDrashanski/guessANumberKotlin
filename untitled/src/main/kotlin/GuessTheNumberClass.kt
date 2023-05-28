open class GuessTheNumberClass {
    companion object {
        val array = StartGameClass().selectLevel()
        val difficulty = StartGameClass().selectDifficulty()
        val target = (array.indices).random()
    }
    init {
        println("Guess the Number")
    }
    fun guessANumber() {
        for (i in 1..difficulty) {
            val guess = readln().toInt()
            when {
                target == guess -> return println("Good job, you guessed the number!")
                target < guess -> println("The number is lower!")
                else -> println("The number is higher!")
            }
        }
        println("Game Over! The number was $target")
    }

}