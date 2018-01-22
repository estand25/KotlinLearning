package learningprogrammingacademy.learning

/*
learningprogrammingacademy.learning
Standley Eugene
12/8/2017
*/

fun main(args: Array<String>){
    var result = sum(1,1)
    println("sum(1, 1) = $result")

    result = sum(1,1, 1)
    println("sum(1, 1, 1) = $result")

    result = sum(1,1, 1, 1)
    println("sum(1, 1, 1, 1) = $result")
}

private fun sum(a:Int, b:Int) = a + b
private fun sum(a:Int, b:Int, c:Int) = a + b + c
private fun sum(a:Int, b:Int, c:Int, d:Int) = a + b + c + d
