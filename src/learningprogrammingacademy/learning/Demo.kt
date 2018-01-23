package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/

enum class EnemyClassType{
    LIGHT,
    HEAVY;

    fun isLight() = this == LIGHT

    fun isHeavy() = this == HEAVY
}

interface Healable{
    fun heal(amount: Int)
}

interface Shooter{
    fun reload(amount: Int)
}

abstract class Enemy(health: Int, var weapon: String){
    var type = EnemyClassType.LIGHT
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

    fun isLight() = type.isLight()

    fun isHeavy() = type.isHeavy()

    open fun attack(enemy: Enemy){
        val percentage = (damage *0.1).toInt()
        var damageToTake = damage

        if(isLight() && enemy.isHeavy()){
            damageToTake = damage - percentage // 10 % less
        } else if(isHeavy() && enemy.isLight()){
            damageToTake = damage + percentage // 10 % more
        }

        println("attacking $enemy with $weapon")
        enemy.takeDamage(damageToTake)
    }

    fun takeDamage(damageToTake: Int){
        health -= damageToTake
    }

    abstract fun run()
}

class Pikeman(health: Int, var armor: Int) : Enemy(health, "Pike"){
    init {
        type = EnemyClassType.HEAVY
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
    pikeman.damage = 5
    pikeman.run()

    val archer: Enemy = Archer(100, 5)
    archer.damage = 10
    archer.run()

    val pistolero: Enemy = Pistolero(100, 6)
    pistolero.damage = 20
    pistolero.run()

    println("pikeman type= ${pikeman.type}")
    println("archer type= ${archer.type}")
    println("pistolero type= ${pistolero.type}")

    println("pikeman heavy= ${pikeman.isHeavy()} , light= ${pikeman.isLight()}")
    println("archer heavy= ${archer.isHeavy()} , light= ${archer.isLight()}")
    println("pistolero heavy= ${pistolero.isHeavy()} , light= ${pistolero.isLight()}")

    pikeman.attack(archer)
    archer.attack(pikeman)
    println("pikeman health= ${pikeman.health} archer health = ${archer.health}")

    pikeman.attack(pistolero)
    pistolero.attack(pikeman)
    println("pikeman health= ${pikeman.health} pistolero health = ${pistolero.health}")

    archer.attack(pistolero)
    pistolero.attack(archer)
    println("archer health= ${archer.health} pistolero health = ${pistolero.health}")
}
