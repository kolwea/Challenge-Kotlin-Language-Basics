/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */

fun main(args: Array<String>) {
    val sample1 = 0x3A
    var sample2 = 58
    var heartRate : Int = 85
    var deposits : Double = 135002796
    val acceleration : Float = 9.800
    var mass: Float = 14.6
    var distance : Double = 129.763001
    var lost : Boolean = true
    var expensive: Boolean = true
    var choice : Int = 2
//     val integral : Char = '\u{222B}'
    val greeting : String = "Hello"
    var name : String = "Karen"
    

// Use the Kotlin “when” expression and the variable choice to display “You chose 1.” if choice is 1, “You
// chose 2.” if choice is 2, “You chose 3.” if choice is 3, and “You made an unknown choice.” if choice is
// something other than 1, 2, or 3.
// Using the character constant integral, display the character in integral followed by the string “ is an integral.”
// Using a “for” loop count from 5 to 10 (inclusive of start and end) using an integer variable i. Inside the loop
// display each value of i with a line that is “i = ” followed by the value of i as in:
// i=5
// i=6
// i=7
// i=8
// i=9
// i = 10
// Declare an integer variable age with an initial value of 0. Using a “while” loop that continues while age is less
// than 6 display the value of age in a line that begins with “age = ” and is followed by the value of age.
// (Example: age = 3) After the age line is displayed increment the value of age by 1.
// Display a line that contains the greeting string followed by a space followed by the name string
    
    if(sample1 == sample2) println("The samples are equal")
    
    if(heartRate > 40 || heartRate < 80) println("Heartrate is normal") else println("Heart rate in not normal")
    
    if(deposits >= 100000000) println("You are exceedingly wealthy") else println("Sorry you are so poor")
    
    var force = mass*acceleration
    println("force = $force")
    
    println("$distance is the distance")
    
    if(lost && expensive) println("I am really sorry! I will get the manager.")
    if(lost && !expensive) println("Here is coupon for 10% off.")
    
        when (choice) {
    1 -> println("Your choice is 1")
    2 -> println("Your choice is 2")
    3 -> println("Your choice is 3")
    else -> {
        println("You made an unknown choice")
    	}
    }
    
    for(i in 5..10){
        println("i = $i")
    }
    
//     Declare an integer variable age with an initial value of 0. Using a “while” loop that continues while age is less
// than 6 display the value of age in a line that begins with “age = ” and is followed by the value of age.
// (Example: age = 3) After the age line is displayed increment the value of age by 1.
// Display a line that contains the greeting string followed by a space followed by the name string.
    
    var age : Int = 0;
    while(age<6){
        println("age = $age")
        age++
    }
    
    println(greeting + " " + name)
    
}
