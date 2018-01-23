package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/

/**
 * create interface shooter with method shot void
 * implement the interface in on class pistolero and archor
 * pistolero already has to just overrider
 * archer doesn't have it so you need to implement it
 * uses same logic as in pistolero
 * fix attach logic in archor class to stop when not more arrow
 * when archor reloading print it out
 * check
 */
interface Healable{
    fun heal(amount: Int)
}

interface Shooter{
    fun reload(amount: Int)
}

abstract class Enemy(health: Int, var weapon: String){
    var health: Int = 0
    set(value) {
        field = value

        if(value < 0){
            field = 0
        }

        if (field > 100){
            field = 100
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

    abstract fun run()
}

class Pikeman(health: Int, var armor: Int) : Enemy(health, "Pike"){
    init {
        println("Pikeman init called")
    }

    override fun run() {
        println("Pikeman running")
    }
}

class Archer(health: Int,var arrowCount: Int): Enemy(health,"bow"), Shooter{
    init {
        println("Archer init called")
    }

    override fun attack(enemy: Enemy) {
        if(arrowCount <= 0){
            println("No more arrows")
            println("Reloading... arrows")
            reload(6)
        }
        else{
            super.attack(enemy)
            arrowCount--
            println("arrows left = $arrowCount")
        }
    }

    override fun run() {
        println("Archer running")
    }

    override fun reload(amount: Int) {
        arrowCount += amount
    }
}

class Pistolero(health: Int, bulletCount:Int ): Enemy(health, "pistol"), Healable, Shooter{
    var bulletCount: Int = 6
    set(value) {
        field = value

        if(field < 0){
            field = 0
        }
    }

    init {
        this.bulletCount = bulletCount
        println("Pistolero init called")
    }

    override fun attack(enemy: Enemy) {
        if(bulletCount <= 0) {
            println("Reloading... bullets")
            reload(6)
        } else {
            super.attack(enemy)
            bulletCount--
            println("bullets left = $bulletCount")
        }

    }

    override fun reload(amount: Int) {
        bulletCount += amount
    }

    override fun run() {
        println("Pistolero running")
    }

    override fun heal(amount: Int) {
        if(amount < 0){
            println("cast heal with negative amount")
            return
        }

        println("healing with amount= $amount")
        health += amount
    }
}

fun main(args: Array<String>) {
    val pikeman: Enemy = Pikeman(100, 100)
    pikeman.damage = 40
    pikeman.run()

    val archer: Enemy = Archer(100, 5)
    archer.damage = 4
    archer.run()

    val pistolero: Enemy = Pistolero(100, 6)
    pistolero.damage = 5
    pistolero.run()

    do {
        archer.attack(pistolero)
        println("Archer health= ${archer.health}")

        pistolero.attack(archer)
        println("Pistolero health= ${pistolero.health}")
    } while (archer.health > 0)

    println("archer died")
    println("pistolero health= ${pistolero.health}")

//    val healable = archer as Healable

    if(pistolero is Healable){
        //val healable = pistolero as Healable // cast or convert to healert

        pistolero.heal(10)
        println("Health= ${pistolero.health}")

        pistolero.heal(-10)
        println("Health= ${pistolero.health}")

        pistolero.heal(200)
        println("Health= ${pistolero.health}")
    }
}
