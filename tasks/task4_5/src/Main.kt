// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
    println("Only enter one number")
    return
}
    var sum = 0L
    val limit = args[0].toIntOrNull()
    if (limit == null) {
    println("Limit must be a whole number")
    return
} 
    for(n in 1.. limit step 2){
        sum = sum + n 
        
        }
    println(sum) 
}
