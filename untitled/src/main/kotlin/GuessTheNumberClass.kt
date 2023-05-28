open class GuessTheNumberClass {
    companion object {
        val array = StartGameClass().selectLevel()
        val difficulty = StartGameClass().selectDifficulty()
        val target = (array.indices).random()
    }
    init {println("Guess the Number")}
    fun guessANumber() {
        var left = 0
        var right = array.lastIndex
        for (i in 1..difficulty) {
            val guess = readln().toInt()
            val mid = left + (right - left) / 2

            when {
                target == guess -> return println("Good job, you guessed the number!")
                target < guess -> {
                    left = mid + 1; println("The number is lower!")
                }
                else -> {
                    right = mid - 1;println("The number is higher!")
                }
            }
        }
        println("Game Over! The number was $target")
    }

}