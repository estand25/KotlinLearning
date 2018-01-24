package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/

/**
 * 1. Create new component class that implements speed of our unit
 * 2. Add component speed to medic - 10
 * 3. Add component speed to pikement - 2@author
 * 4. print to console speed of each unit
 */

interface BasicComponent

class Health(var amount: Int) : BasicComponent

class Weapon(var name: String) : BasicComponent

class Armor(var amount: Int) : BasicComponent

class Speed(var amount: Int) : BasicComponent

class Unit(var name: String){
    private val componentsByName = hashMapOf<String, BasicComponent>()

//    fun addComponent(name: String, component: BasicComponent) = componentsByName.put(name, component)
    operator fun set(name: String, component: BasicComponent) = componentsByName.put(name,component)

    fun removeComponent(name: String) = componentsByName.remove(name)

//    fun getComponent(name: String): BasicComponent? = componentsByName[name]

    operator fun get(name: String): BasicComponent? = componentsByName[name]

    override fun toString(): String {
        val componentString = componentsByName.keys.joinToString(", ")
        return "Name= $name components= $componentString"
    }
}

fun main(args: Array<String>) {
    //Pickman
    val pikemanHealth = Health(100)
    val pike = Weapon("pike")
    val pikemanArmor = Armor(50)
    val pikemanSpeed = Speed(6)
    val pikeman = Unit("Pikeman")
    pikeman["health"] = pikemanHealth
    pikeman["weapon"] = pike
    pikeman["armor"] = pikemanArmor
    pikeman["speed"] = pikemanSpeed
    println("Phikeman= $pikeman")

    //Archer
    val archerHealth = Health(80)
    val bow = Weapon("bow")
    val archerArmor = Armor(30)
    val archer = Unit("Archer")
    archer["health"] = archerHealth
    archer["weapon"] = bow
    archer["armor"] = archerArmor

    println("Archer= $archer")

    //Swordsmen
    val swordsmenHealth = Health(60)
    val sword = Weapon("sword")
    val swordArmor = Armor(10)
    val swordsman = Unit("Swordsman")
    swordsman["health"] = swordsmenHealth
    swordsman["weapon"] = sword
    swordsman["armor"] = swordArmor

    println("Swordsman= $swordsman")

    //Medic
    val medicHealth = Health(50)
    val medicSpeed = Speed(10)
    val medic = Unit("Medic")
    medic["health"] = medicHealth
    medic["speed"] = medicSpeed

    println("Medic= $medic")

    val medicWeapon = medic["weapon"]
    println("medic weapon ${medicWeapon != null}")

    val pikemanWeapon = pikeman["weapon"] as Weapon
    println("pikeman weapon ${pikemanWeapon.name}")

    val pikeman_Speed = pikeman["speed"] as Speed
    println("pikemen speed ${pikeman_Speed.amount}")

    val archer_Speed = archer["speed"]
    println("archer speed ${archer_Speed != null}")

    val swordsman_Speed = swordsman["speed"]
    println("swordsman speed ${swordsman_Speed != null}")

    val medic_Speed = medic["speed"] as Speed
    println("medic speed ${medic_Speed.amount}")
}