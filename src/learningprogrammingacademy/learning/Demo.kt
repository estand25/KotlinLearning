package learningprogrammingacademy.learning

/*
learningprogrammingacademy.learning
Standley Eugene
12/8/2017
*/

fun main(args: Array<String>){

    val dog = "Dog"
    val dog2 = String(charArrayOf('D','o','g')) // creates new reference of type string

    println("dog === dog2 => " + (dog === dog2)) // reference equality (point to same point in memory)
    println("dog == dog2 => " + (dog == dog2)) // structural equality (checks the contain of the string)  Same characters ad length

    val cat = "Cat"
    val cat2 = String(cat.toCharArray())
    val cat3 = cat2 // reference to same object

    println("reference equal => " + (cat === cat2))
    println("reference equal => " + (cat === cat3))
    println("reference equal => " + (cat2 === cat2))

    // templates
    println("dog= $dog cat= $cat")

    // raw
    println(""" this is
        my dog
        $dog""")

    // methods from String class
    var lizard = "Lizard"

    println("lizard first letter= ${lizard[0]}")
    println("contian= ${lizard.contains("is")}")

    // immutability
    lizard.toUpperCase()

    println("lizard= $lizard")

    lizard = lizard.toUpperCase() // assigned new value to variable

    println("lizard= $lizard")


}