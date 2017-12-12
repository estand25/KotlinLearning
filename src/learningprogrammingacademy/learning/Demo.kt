package learningprogrammingacademy.learning

/*
learningprogrammingacademy.learning
Standley Eugene
12/8/2017
*/

fun main(args: Array<String>){
    // create array of string that represent names of peoplet
    // print all strings/name that start captial letter P in uppercase
    // find method in string class that checks if staring startswith another string

    var lists = arrayOf("Paul","Jack","Patrick", "Jason", "Derek", "Eugene")

    for(list in lists) if(list.startsWith("P"))
        println(list.toUpperCase())


    for(i in lists.indices){
        var l = lists[i]
        if(l.startsWith("P"))
            println(l.toUpperCase())
    }

    // while
    var index = 0

    while(index < lists.size){
        var l = lists[index]
        if(l.startsWith("P"))
            println(l.toUpperCase())
    }
}