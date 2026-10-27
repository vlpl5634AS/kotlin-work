// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3) {
    println("Usage: initial max increment")
    return
}
    val inital = args[0].toDouble()
    val max = args[1].toDouble()
    val increment = args[2].toDouble() 
    if (increment <= 0) {
    println("Increment must be positive")
    return
}
         

    var currentTemp = inital
    
    println(String.format("%10s %10s", "Celsius", "Fahrenheit"))    
    
    while(currentTemp <= max ){
        
        val fahrenheit = currentTemp * 9.0 / 5.0 + 32
        println(String.format("%10.1f %10.1f", currentTemp, fahrenheit))
        currentTemp = currentTemp + increment
    }
}