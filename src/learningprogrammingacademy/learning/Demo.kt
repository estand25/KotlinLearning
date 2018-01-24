package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/

interface BasicConponent

class Health(var amount: Int) : BasicConponent

class Weapon(var name: String) : BasicConponent

class Armor(var amount: Int) : BasicConponent

class Unit(var name: String){
    private val componentsByName = hashMapOf<String, BasicConponent>()

    fun addComponent(name: String, component: BasicConponent) = componentsByName.put(name, component)

    fun removeComponent(name: String) = componentsByName.remove(name)

    fun getComponent(name: String): BasicConponent? = componentsByName[name]

    override fun toString(): String {
        val componentString = componentsByName.keys.joinToString(", ")
        return "Name= $name components= $componentString"
    }
}

fun main(args: Array<String>) {
    //Pickman
    val pikemanHealth = Health(100)
    val pike = Weapon("pike")
    val pikeArmor = Armor(50)
    val pikeman = Unit("Pikeman")
    pikeman.addComponent("health", pikemanHealth)
    pikeman.addComponent("weapon", pike)
    pikeman.addComponent("armor", pikeArmor)

    println("Phikeman= $pikeman")

    //Archer
    val archerHealth = Health(80)
    val bow = Weapon("bow")
    val archerArmor = Armor(30)
    val archer = Unit("Archer")
    archer.addComponent("health", archerHealth)
    archer.addComponent("weapon", bow)
    archer.addComponent("armor", archerArmor)


    println("Archer= $archer")

    //Swordsmen
    val swordsmenHealth = Health(60)
    val sword = Weapon("sword")
    val swordArmor = Armor(10)
    val swordsman = Unit("Swordsman")
    swordsman.addComponent("health", swordsmenHealth)
    swordsman.addComponent("weapon", sword)
    swordsman.addComponent("armor", swordArmor)

    println("Swordsman= $swordsman")

    //Medic
    val medicHealth = Health(50)
    val medic = Unit("Medic")
    medic.addComponent("health", medicHealth)

    println("Medic= $medic")

    val medicWeapon = medic.getComponent("weapon")
    println("medic weapon ${medicWeapon != null}")

    val pikemanWeapon = pikeman.getComponent("weapon") as Weapon
    println("pikeman weapon ${pikemanWeapon.name}")
}