// Task 7.7.1: statistics functions

fun median(numbers: List<Float>): Float {
    require(numbers.isNotEmpty()) { "List cannot be empty" }

    val sorted = numbers.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 == 1) {
        sorted[middle]
    } else {
        (sorted[middle - 1] + sorted[middle]) / 2
    }
}

fun displayStatistics(numbers: List<Float>) {
    require(numbers.isNotEmpty()) { "List cannot be empty" }

    println("Minimum: ${numbers.minOrNull()}")
    println("Maximum: ${numbers.maxOrNull()}")
    println("Mean: ${numbers.average()}")
    println("Median: ${median(numbers)}")
}
