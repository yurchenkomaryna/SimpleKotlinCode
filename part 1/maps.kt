fun main(args:Array<String>){
    //Maps is a cousin of List and Array -- hold some values together the way that is stored is a quiet different
    //In other languages Maps are called - Dictionaries
    //Map hold a collection of things (keys and values)

    var dogs = mapOf<String,Int>("Rex" to 8, "Sharik" to 9, "Shon" to 23)
    println(dogs["Rex"])

    //Homework
    //Create a Map where you have 3 entries and in each entry you have a word for the key, and a definition for the value
    var seasons = mapOf("winter" to "very cold", "spring" to " very sunny", "summer" to "very hot", "fall" to "a little bit cold")
    println(seasons["summer"])
}
