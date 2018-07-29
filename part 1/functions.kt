fun main(args:Array<String>){
    //Functions -- it's a way to give a name to a some piece code
    fun hello(){
        println("Hello World!")
    }
    println("Hi")
    //to call or print the function to be executed we need to call it
    hello()

    //call hello function 100 times
    for (x in 1..100){
        hello()
    }

    //parameters -- need to add them in () in function, can provide default value number2: Int = 0 -- 0 is a default value
    //create a function that add two items together and then prints it out
    fun addAndPrint(number1: Int, number2: Int = 0){
    println(number1+number2)
    }
    addAndPrint(4)

    //new function
    fun addNewValue(num1: Int, num2: Int) : Int{
        return num1+num2
    }
    addNewValue(4, 5)

    var sum : Int = addNewValue(4, 5)
    println(sum)


    //Homework
    //Create a function that takes a dogs names and age and prints out some information about the dog
    fun dogs(name: String, age: String) : String{
        return name+age
    }
    dogs("Sharik", "one")
    var newDogs = dogs("Sharik", " one")
    println(newDogs)


    //new try
    fun dogInfo(n: String, a: Int){
//        print(n)
//        print(" is ")
//        print(a)
        println(n+ " is " + a + " years old")
        //can print the arguments with $
        println("$n is $a years old")
    }
    dogInfo("Sharik", 1)
    dogInfo("Sara", 22)
}