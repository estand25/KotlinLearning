package learningprogrammingacademy.learning

/*
learningprogrammingacademy.learning
Standley Eugene
12/8/2017
*/

fun main(args: Array<String>){
    // use any loop from previous video (for, while, do-while)
    // sum all number from 1 - 100
    // print sum to console

    // My solution
//    var sum = 0

//    for(i in 1 .. 100){
//        println("Current index: " + i)
        //sum= sum!!.plus(i) //4950
//        println("Current sum: " + sum)
        //sum += i ... did the something but the long way around
//    }
//
//    println(sum)

    // The Answer
    // while
    var number = 1
    var sum = 0

    while(number <= 100){
        sum += number // sum = sum + number
        number++
    }

    println("while sum= " + sum)

    number = 1
    sum = 0

    do {
        sum += number
        number ++
    } while (number <= 100)

    println("do while sum= " +sum)

    sum = 0

    for (n in 1 .. 100){
        sum+= n
    }

    println("for sum= " +sum)


    sum = (1..100).sum()

    println("sum with ranges= "+ sum)
}