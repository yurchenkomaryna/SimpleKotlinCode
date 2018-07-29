fun main(args: Array<String>) {
    // Arrays and Lists  - something that holds a list of values in a particular order
    // Values can be - Integers, Strings

    // cannot change the value in list, it will give an error
        //var topCandy = listOf("cake","roshen","milky")
        //topCandy[0] = "new cake"
        //println(topCandy[0])

    //can change value if list is mutable
    var colors : MutableList<String> = mutableListOf("grey", "red", "white")
    colors[0] = "red"
    //also can add values to mutable list
    colors.add(0, "yellow")
    println(colors[0])
    println(colors[1])
    println(colors[2])
    println(colors[3])

    var sweets : List<Int> = listOf(2, 12, 25)
    println(sweets[2])

    //in Array can change the value
    var numbers : Array<String> = arrayOf("one","two","three")
    numbers[0] = "first"
    println(numbers[0])

    //Homework - create an Array that holds 4 Integers of my favorite number
    var num = arrayOf(2,15,45,15)
    //first item
    println(num.first())
    //very last item
    println(num.last())
    println(num[num.size-1])
    //size of the list
    println(num.size)
    println(num[3])
}


