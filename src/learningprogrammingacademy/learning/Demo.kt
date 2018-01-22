package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/

fun main(args: Array<String>){
    showInfo()
    showInfo("Jimmy")
    showInfo("Anthony", 10)
    showInfo(level = 5, name = "Timmy")

    showLevelAndXp(5,1000)
    showLevelAndXp(xp = 10, level = 3)
    showLevelAndXp(level = 10, xp = 5000)
}

private fun showInfo(name: String = "John", level: Int = 2) = println("name = $name level= $level")

private fun showLevelAndXp(level: Int, xp:Int) = println("level = $level xp= $xp")