package learningprogrammingacademy.learning

/*
learning programming academy.learning
Standley Eugene
12/8/2017
*/

fun main(args: Array<String>) {
//    val weaponsByDamage = hashMapOf<String,Int>()
//    weaponsByDamage.put("pike", 10)
//    weaponsByDamage.put("arrow", 15)
//    weaponsByDamage.put("sword", 20)
//    weaponsByDamage.put("pistol", 30)

    val weaponsByDamage = hashMapOf<String, Int>(
            "pike" to 10,
            "arrow" to 15,
            "sword" to 20,
            "pistol" to 30
    )

    for ((key,value) in weaponsByDamage){
        println("key= $key value= $value")
    }

    for(key in weaponsByDamage){
        println("key= $key")
    }

    for(value in weaponsByDamage){
        println("value= $value")
    }

    //getting//setting values
    println("sword has damage ${weaponsByDamage["sword"]}")

    println("size= ${weaponsByDamage.size}")

    weaponsByDamage["sword"] = 35

    println("sword has new damage ${weaponsByDamage["sword"]}")

    println("size= ${weaponsByDamage.size}")
}