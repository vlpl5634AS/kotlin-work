// Task 4.3: grade calculation using a when expression

fun main() {
    // Add your code here
    println("Enter your score (0-100):")
    val score = readLine()?.toIntOrNull()

    if (score != null && score in 0..100) {
        val grade = when (score) {
            in 70 ..100 -> "Distinction"
            in 40 ..69 -> "Pass"
            else -> "Fail"
        }
        println("Your grade is: $grade")
    } else {
        println("Invalid score. Please enter a number between 0 and 100.")
    }
}