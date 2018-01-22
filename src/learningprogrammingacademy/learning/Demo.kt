package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/

class Dog constructor(private val color: String = "Black") {

    init {
        println("dog Initialized with color value = $color")
    }

    fun printColor() = println("color = $color")
}

class Cat(private val name: String = "Tom", private val age: Int = 3){
    /*private var age = 3

    constructor(name: String = "Tom", age: Int = 50) :this(name){
        this.age = age
    }*/

    fun printInfo() = println("name = $name age = $age")
}

fun main(args: Array<String>){
    val dog = Dog()
    dog.printColor()

    val dog2 = Dog("gray")
    dog2.printColor()

    val cat = Cat()
    cat.printInfo()

    val cat2 = Cat(name = "Jerry")
    cat2.printInfo()

    val cat3 = Cat(name = "Jimmy", age = 10)
    cat3.printInfo()

}

