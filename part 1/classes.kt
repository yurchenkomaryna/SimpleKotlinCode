fun main(args:Array<String>){
    //Classes - a way to create a blue print to create an object
    //properties variables that belongs to this class
    class Dog {
        var name = ""
        var age = 0
        var furColor = ""
    }
    //new dog object from this class
    var myDog = Dog()
    myDog.age = 6
    myDog.name = "Brian"
    myDog.furColor = "Brown"
    println(myDog.name)

    //can create multiple objects from one class and that objects are not connected - otherDog is not connected to myDog
    var otherDog = Dog()
    //new name
    otherDog.name = "Sharik"
    println(otherDog.name)


    //can easier specify parameters in the class
    /*class Cat(catName : String, catAge : Int, catFurColor : String, weightCat : Int){
        var catName = catName
        var catAge = catAge
        var catFurColor = catFurColor
        var weightCat = weightCat
    }
        var myCat = Cat("Vasya", 5, "white", 25)
        println(myCat.weightCat)
    */

    //Homework -
    //Add a property to the cat class of your choosing and update your code
    // updated code above



    //Class Functions -- the way to add functions to the classes and the functions are only run in relation to the object of that class
    class Cat(catName : String, catAge : Int, catFurColor : String, weightCat : Int){
        var catName = catName
        var catAge = catAge
        var catFurColor = catFurColor
        var weightCat = weightCat

        fun info(){
            println("$catName is $catAge years old and $catFurColor fur and is $weightCat kilo")
            println(this.catName)

            var catAge = 25
            println(catAge)
            println(this.catAge)
        }
    }
    var myCat = Cat("Vasya", 5, "white", 25)
    myCat.info()

    //Homework - create a function that resets all the information for a region

    class region(regionName : String, regionSize : Int){
        var regionName = regionName
        var regionSize = regionSize

        fun reg(){
            println("$regionName is very beautiful and $regionSize kilometers is very big")
        }

        fun clear(){
            regionName = ""
            regionSize = 0
        }
    }
    var myRegion = region("Borzna", 5656)
    myRegion.reg()
    //by this we clear the info
    myRegion.clear()
    //and call the function - now all information is () or 0
    myRegion.reg()

}