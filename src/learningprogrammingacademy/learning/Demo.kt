package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/

open class Enemy(health: Int, var weapon: String){
    var health: Int = 0
    set(value) {
        field = value

        if(value < 0){
            field = 0
        }
    }

    var damage: Int = 0

    init {
        this.health = health
        println("Enemy init called")
    }

    open fun attack(enemy: Enemy){
      println("attacking $enemy with $weapon")
        enemy.takeDamage(damage)
    }

    fun takeDamage(damageToTake: Int){
        health -= damageToTake
    }
//    open fun attack(pikeman: Pikeman){
//        println("attacking with $weapon")
//    }
//
//    open fun attack(archer: Archer){
//        println("attacking with $weapon")
//    }


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

    override fun attack(enemy: Enemy) {
        if(arrowCount <= 0){
            println("No more arrows")

        }
        else{
            super.attack(enemy)
            arrowCount--
            println("arrows left = $arrowCount")
        }
    }
}

fun main(args: Array<String>) {
    val pikeman: Enemy = Pikeman(100, 100)
    pikeman.damage = 40

    val archer: Enemy = Archer(100, 5)
    archer.damage = 60

    pikeman.attack(archer)
    println("Pikeman health= ${pikeman.health}")

    archer.attack(pikeman)
    println("Archer health= ${archer.health}")

    pikeman.attack(archer)
    println("Pikeman health= ${pikeman.health}")

    archer.attack(pikeman)
    println("Archer health= ${archer.health}")
}
