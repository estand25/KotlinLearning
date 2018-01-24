package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/
/**
 * 1. write class Armor similar to Health
 * 2. Create properties armor in Soldier class
 * 3. When print soldier include armor
 * 4. Add Armor to pikeman and archer in main function
 * 5. create swordmaen soldier and print to console
 */
class Health(var amount: Int)

class Weapon(var name: String)

class Armor(var amount: Int)

class Soldier(var name: String, var health: Health, var weapon: Weapon, var armor: Armor){
    override fun toString() = "name= $name health= ${health.amount} weapon= ${weapon.name} armor= ${armor.amount}"
}

fun main(args: Array<String>) {
    //Pickman
    val pikemanHealth = Health(100)
    val pike = Weapon("pike")
    val pikeArmor = Armor(50)
    val pikeman = Soldier("Pikeman", pikemanHealth, pike, pikeArmor)

    println("Phikeman= $pikeman")

    //Archer
    val archerHealth = Health(80)
    val bow = Weapon("bow")
    val archerArmor = Armor(30)
    val archer = Soldier("Archer", archerHealth, bow, archerArmor)

    println("Archer= $archer")

    //Swordsmen
    val swordsmenHealth = Health(60)
    val sword = Weapon("sword")
    val swordArmor = Armor(10)
    val swordsman = Soldier("Swordsman", swordsmenHealth, sword, swordArmor)

    println("Swordsman= $swordsman")
}