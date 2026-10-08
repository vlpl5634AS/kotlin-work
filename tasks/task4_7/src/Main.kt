// Task 4.7: finding the longest line in a file
import kotlin.system.exitProcess
import java.io.File

fun main(args: Array<String>){
    if (args.size != 1) {
    println("Only enter the file name")
    return
}    
    var longestLine = 0
    var longestLength = 0
    
    val filePath = File(args[0])
    
    filePath.useLines { lines ->
        for ((index, line) in lines.withIndex()) {
            val lineNumber = index + 1

            if (line.length > longestLength) {
                longestLength = line.length
                longestLine = lineNumber
            }
        }
}
    println(longestLine)
    println(longestLength)
}