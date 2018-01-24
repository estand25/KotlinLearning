package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/

enum class SoliderClassType {
    LIGHT,
    HEAVY;

    fun isLight() = this == LIGHT

    fun isHeavy() = this == HEAVY
}

interface Healable {
    fun heal(amount: Int)
}

interface Shooter {
    fun reload(amount: Int)
}

abstract class Solider(health: Int, var weapon: String) {
    var type = SoliderClassType.LIGHT
    var health: Int = 0
        set(value) {
            field = value

            if (value < 0) {
                field = 0
            }

            if (field > 100) {
                field = 100
            }
        }

    var damage: Int = 0

    init {
        this.health = health
        println("Solider init called")
    }

    fun isLight() = type.isLight()

    fun isHeavy() = type.isHeavy()

    open fun attack(solider: Solider) {
        val percentage = (damage * 0.1).toInt()
        var damageToTake = damage

        if (isLight() && solider.isHeavy()) {
            damageToTake = damage - percentage // 10 % less
        } else if (isHeavy() && solider.isLight()) {
            damageToTake = damage + percentage // 10 % more
        }

        println("attacking $solider with $weapon")
        solider.takeDamage(damageToTake)
    }

    fun takeDamage(damageToTake: Int) {
        health -= damageToTake
    }

    abstract fun run()
}

class Pikeman(health: Int, var armor: Int) : Solider(health, "Pike") {
    init {
        type = SoliderClassType.HEAVY
        println("Pikeman init called")
    }

    override fun run() {
        println("Pikeman running")
    }
}

class Archer(health: Int, var arrowCount: Int) : Solider(health, "bow"), Shooter {
    init {
        println("Archer init called")
    }

    override fun attack(solider: Solider) {
        if (arrowCount <= 0) {
            println("No more arrows")
            println("Reloading... arrows")
            reload(6)
        } else {
            super.attack(solider)
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

class Pistolero(health: Int, bulletCount: Int) : Solider(health, "pistol"), Healable, Shooter {
    var bulletCount: Int = 6
        set(value) {
            field = value

            if (field < 0) {
                field = 0
            }
        }

    init {
        this.bulletCount = bulletCount
        println("Pistolero init called")
    }

    override fun attack(solider: Solider) {
        if (bulletCount <= 0) {
            println("Reloading... bullets")
            reload(6)
        } else {
            super.attack(solider)
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
        if (amount < 0) {
            println("cast heal with negative amount")
            return
        }

        println("healing with amount= $amount")
        health += amount
    }
}

fun main(args: Array<String>) {
    val names = listOf("Jimmy","Anthony","John")

    for(name in names){
        println("name= $name uppercase= ${name.toUpperCase()}")
    }

    val pikeman: Solider = Pikeman(100, 100)
    pikeman.damage = 5
    pikeman.run()

    val archer: Solider = Archer(100, 5)
    archer.damage = 10
    archer.run()

    val pistolero: Solider = Pistolero(100, 6)
    pistolero.damage = 20
    pistolero.run()

    val army = listOf(pikeman,archer,pistolero)

    for(soldier in army){
        println("Soldier= ${soldier.javaClass.simpleName} health= ${soldier.health} damage= ${soldier.damage}")
    }

    for(i in army.indices){
        val soldier = army[i]
        println("Soldier= ${soldier.javaClass.simpleName} health= ${soldier.health} damage= ${soldier.damage}")
    }

}
