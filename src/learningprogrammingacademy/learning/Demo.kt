package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/

open class Enemy(var health: Int, var weapon: String){
    init {
        println("Enemy init called")
    }

    fun attack(){
      println("attacking with $weapon")
    }
}

class Pikeman(health: Int, var armor: Int) : Enemy(health, "Pike"){
    init {
        println("Pikeman init called")
    }
}

class Archer(health: Int,var arrowCount: Int): Enemy(health,"bow"){
    init {
        println("Archer init called")
    }
}

fun main(args: Array<String>){
    val pikeman = Pikeman(100, 100)
    pikeman.attack()

    val archer = Archer(100,5)
    archer.attack()
}

