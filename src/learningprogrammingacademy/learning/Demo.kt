package learningprogrammingacademy.learning

/*
learningprogrammingacademy.learning
Standley Eugene
12/8/2017
*/

fun main(args: Array<String>){
    val animals = arrayOf("Dog", "Cat", "Lizard", "Bird", "Snake")

    for(animal in animals){
        if(animal == "Lizard"){
            break
        }

        println(animal)
    }
    // break jump to this line

    println("continue")

    for(animal in animals){
        if(animal == "Lizard"){
            continue
        }

        println(animal)
    }
}