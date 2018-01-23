package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/
object StringUtilis {
//    fun startWithUpperCase(value: String?): Boolean {
//        if(value.isNullOrBlank()){
//            return false
//        }
//
//        return value!![0].isUpperCase()

//        return !(value.isNullOrBlank()) && value!![0].isUpperCase()
//    }

    fun startWithUpperCase(value: String?) : Boolean = !(value.isNullOrBlank()) && value!![0].isUpperCase()
}

fun String?.startWithUpperCase() : Boolean = !(this.isNullOrBlank()) && this!![0].isUpperCase()
infix fun Int.multiplyBy(multiplier : Int) = this * multiplier

fun main(args: Array<String>){

    val myString = "Kotlin"

    println("toLowerCase= ${myString.toLowerCase()}")

    println("startWithUpper= ${StringUtilis.startWithUpperCase(myString)}")
    println("startWithUpper= ${StringUtilis.startWithUpperCase(null)}")
    println("startWithUpper= ${StringUtilis.startWithUpperCase("")}")
    println("startWithUpper= ${StringUtilis.startWithUpperCase("kotlin")}")

    println("startWithUpper= ${myString.startWithUpperCase()}")

    println("1 * 5= ${1.multiplyBy(5)}")

    println("1 * 5= ${1 multiplyBy 5}")
}

