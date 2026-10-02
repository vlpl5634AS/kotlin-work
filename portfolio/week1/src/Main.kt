// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess


fun main(args:Array<String>){
        
    if (args.size != 3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }   
   
    // set the cma each to the subsequent letter in hte triangle
    val a = args[0].toDouble()
    val b = args[1].toDouble()
    val c = args[2].toDouble() 
    
    // calculcute the semi perimiterr that is requrired for herons frormula
    val s = (a + b + c) / 2
    
    //plugs in all the values into fromula
    val area = sqrt(s * (s - a) * (s - b) * (s - c))
    
    //rounda to 5dp as requested in the portfolio document
    val roundedTo5Dp = String.format("%.5f", area)
    
    //prints the area as requested in the portfolio document
    println("Area = $area")
    
}