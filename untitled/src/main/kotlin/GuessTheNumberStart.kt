abstract class GuessTheNumberStart {
    fun startGame(difficulty: String, number: Int) {
        println("Guess the number")
        val difficultyCall: Unit
        when (difficulty) {
            "1" -> difficultyCall = IsTheNumberCorrect(number, "1").repeat()
            "2" -> difficultyCall = IsTheNumberCorrect(number, "2").repeat()
            "3" -> difficultyCall = IsTheNumberCorrect(number, "3").repeat()
        }
    }
}