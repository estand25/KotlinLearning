package learningprogrammingacademy.learning

import java.util.*

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/

fun main(args: Array<String>) {
    val deck = Stack<String>()
    deck.push("Ace of diamonds") // Bottom
    deck.push("Ace of hearts")
    deck.push("Ace of clubs")
    deck.push("Ace of spades") // Top

    println("size= ${deck.size}")

    for(card in deck){
        println("card= $card")
    }

    println("size= ${deck.size}")

    while(deck.size > 0){
        val cardName = deck.pop()
        println("dealing card= $cardName")
    }

    println("size= ${deck.size}")
}
