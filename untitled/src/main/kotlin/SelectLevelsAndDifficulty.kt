class SelectLevelsAndDifficulty : GuessTheNumberStart() {
    fun selectLevel() {
        println("Select Level: 1, 2, 3")
        when (readln()) {
            "1" -> selectDifficulty((0..100).random())
            "2" -> selectDifficulty((0..100).random())
            "3" -> selectDifficulty((0..100).random())
            else -> throw Exception("Invalid Input")
        }
    }

    fun selectDifficulty(number: Int) {
        println("Select difficulty: 1, 2, 3")
        when (readln()) {
            "1" -> startGame("1", number)
            "2" -> startGame("2", number)
            "3" -> startGame("3", number)
            else -> throw Exception("Invalid Input")
        }
    }

}