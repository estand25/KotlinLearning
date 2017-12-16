package learningprogrammingacademy.learning

/*
learningprogrammingacademy.learning
Standley Eugene
12/8/2017
*/

fun main(args: Array<String>){
    println("isTrue= ${isTrue()}")

    var number = getInt()

    println("number= $number") // 10

    number = increment(number)

    println("number= $number")

    number = sum(number, 3)
    println("number= $number")

    printSum(4,5)
}


//private fun getInt(): Int {
//    // return false // does not compile needs to be assignable to return type
//    return 10 // assigned to return
//}

private  fun getInt(): Int = 10

//private fun isTrue() : Boolean {
//    return 4 < 10
//}

private fun isTrue() : Boolean = 4 < 10

private fun increment(number : Int) = number + 1

private fun sum(a: Int, b: Int) = a + b

private fun printSum(a: Int, b: Int) = println("$a + $b = ${a + b}")

