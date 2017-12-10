package learningprogrammingacademy.learning

/*
learningprogrammingacademy.learning
Standley Eugene
12/8/2017
*/

var pets = arrayOf("parrot","cat", "dog") // size 3 and index range 0-2

var table = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6),
        intArrayOf(7,8,9)
)

fun main(args: Array<String>){
    for(i in pets.indices){
      //1st iteration i = 0
      //2nd iteration i = 1
      //3rd iteration i = 2
      //4rd iteration i = 3 --> for loop finishes
      println("pets{"+ i +"]= " + pets[i])
    }

    for(pet in pets){
      println("pets= " + pet)
    }

    // using ranges
    for (value in 1..10 step 2){
      println("value= " + value)
    }

    for((index, value) in pets.withIndex()){
        println("elements at index= " + index + " = " + value)
    }


    for (row in 0 until table.size){
        println("row= " + table[row])

        for(colume in 0 until table[row].size){
            println("number= "+ table[row][colume])
        }
    }
}