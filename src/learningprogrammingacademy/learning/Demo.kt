package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/

/**
 *  write class the represents person
 *
 *  person has 3 properties/field firtName(String), lastName(String), age (int)
 *  write setter/ set block for age to limit age between 0 and 100
 *  create readonly property fullName (firstName + lastName
 *
 *  in main create instance of person
 *
 *  print firtName, lastName, fullName and age
 *
 *  tip: create method in person class to print properties
 */

class Person (var firstName: String,var lastName: String, age: Int) {
    var age: Int = 0
        set(value) {
            println("Setting Block")
            var newAge = value

            if(newAge < 0)
                newAge = 0

            if(newAge > 100)
                newAge = 100

            field = newAge
        }

    init {
        this.age = age
    }

    val fullName: String
        get() = firstName + " " + lastName

    fun printInfo(){
        println("Person firstName = $firstName, lastName = $lastName, fullName = $fullName , Age= $age")
    }
}

fun main(args: Array<String>){
    val john = Person("John", "Smith", 25)
    john.printInfo()

    val jimmy = Person("Jimmy", "Winter", 120)
    jimmy.printInfo()

    val anthony = Person("Anthony", "Bell", -10)
    anthony.printInfo()

    println("anthony firstNam= ${anthony.firstName}")


}

