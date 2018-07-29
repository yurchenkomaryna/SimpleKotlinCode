fun main(args:Array<String>){
    //For Loop is something that allows you to run one or multiple lines of code - over and over again
    for(count in 1..10){
        println(count)
    }

    var candies = listOf("cake","sake","lake" )
    for (oneCandy in candies){
        println(oneCandy)
    }

    // Homework
    //loop thought the numbers one thought 10000 and print out any number that are greater 692

    for (number in 1..1_000){
        if (number > 692)
            println(number)
    }
}