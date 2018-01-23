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

    open fun attack(){
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

    override fun attack() {
        if(arrowCount <= 0){
            println("No more arrows")

        }
        else{
            super.attack()
            arrowCount--
            println("arrows left = $arrowCount")
        }
    }
}

fun main(args: Array<String>){
    val pikeman = Pikeman(100, 100)
    pikeman.attack()

    val archer = Archer(100,5)
    archer.attack()
    archer.attack()
    archer.attack()
    archer.attack()
    archer.attack()
    archer.attack()
}

