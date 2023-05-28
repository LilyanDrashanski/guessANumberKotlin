open class StartGameClass {
    fun selectLevel(): IntArray {
        println("Select level: 1, 2, 3")
        return when (readln()) {
            "1" -> IntArray(100) { it + 1 }
            "2" -> IntArray(200) { it + 1 }
            "3" -> IntArray(300) { it + 1 }
            else -> throw Exception("Invalid input")
        }
    }

    fun selectDifficulty(): Int {
        println("Select difficulty: 1, 2, 3")
        return when (readln()) {
            "1" -> 20
            "2" -> 10
            "3" -> 5
            else -> throw Exception("Invalid input")
        }
    }
}