fun main(args: Array<String>) {

    // Booleans
    var age : Int = 28
    var weight : Double = 192.2
    var candy : String = "cake"
    //var catIsAlive : Boolean = false

    var verification : Boolean = age > 18
    var less_than : Boolean = age < 18
    var equal_to : Boolean = age == 18
    println(verification)
    var new_cake : Boolean = candy == "cake"
    println(new_cake)


    var catIsAlive : Boolean = false


//If Statements
    if (catIsAlive){
        println("The cat lives")
    } else{
        println("RIP to the cat")
    }


    if (less_than > equal_to){
        println("The cat lives")
    } else{
        println("RIP to the cat")
    }

// not equal !=
//println -- means print in new line

//Homework
// create a variable day and set to the day of the week
    var day = "Wednesday"

// If the day is Friday, print 'welcome to the weekend!'
    if (day == "Friday") {
        println("welcome to the weekend")
    } else {
        println("no way, today is not Friday")
    }
}