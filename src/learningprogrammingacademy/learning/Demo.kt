package learningprogrammingacademy.learning

/*
learningprogrammingacademy.learning
Standley Eugene
12/8/2017
*/

var person : String? = null
var lives : Int = 0

var pets : String? = null

fun main(args: Array<String>){
    //person.toUpperCase() // compilation error
    //person!!.toUpperCase() // null pointer exception

    person = person?.toUpperCase() //  null safe operation

    println("person= $person")

    person = "John"
    person = person?.toUpperCase() // null safe operator
    println("person= $person")

    println("live= ${lives == 0}")

    var anotherPersion : String? = null
    println("anotherPerson= $anotherPersion")
    println("anotherPerson null - ${anotherPersion === null}")
    println("anotherPerson isEmpty= ${anotherPersion.isNullOrEmpty()}")

    pets = "Dog"
    println("pets is null= ${pets === null}")
    val dog = pets!!.toUpperCase()
    //val dog = pets?.toUpperCase()

    println("dog= $dog")

}