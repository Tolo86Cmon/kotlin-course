package udacityKotlinCourse.lesson3

import kotlin.random.Random

fun main(args: Array<String>) {
    feedTheFish()
    eagerExample()
    println("I ${if (canAddFish(140.0, listOf(4, 3, 2), 3, false)) "can" else "can't"} add fish")

}


fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flower")
    val eager =     decorations.asSequence().filter { it[0] == 'r' }
    println(eager)

}

fun randomDay(): String {
    val week = listOf(
        "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    )
    return week[Random.nextInt(7)]
}

fun canAddFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldIChangeTheWater(day, 20, 50)
    shouldIChangeTheWater(day)
    shouldIChangeTheWater(day, dirty = 50)

    if (shouldIChangeTheWater(day)) {
        println("Change the water Today")
    }

    dirtyProcessor();
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "granules"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "plankton"
        else -> "fasting"
    }
}



fun shouldIChangeTheWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    val isSunday = day == "sunday"
    val isTooHot = temperature > 30
    val isTooDirty = dirty > 30
    return when {
        isSundayFun(day) -> true
        isTooHotFun(temperature) -> true
        isTooDirtyFun(temperature) -> true
        else -> false
    }
}

fun isSundayFun(day: String): Boolean = day == "sunday"
fun isTooHotFun(temperature: Int): Boolean = temperature > 30
fun isTooDirtyFun(dirty: Int): Boolean = dirty > 30


var dirty = 20

//Assegnare una funzione anonima ad una variabile
val waterFilter = {dirty: Int -> dirty/2}

val waterFilterLambda : (Int) -> Int =  {dirty: Int -> dirty/2}

fun feedFish(dirty: Int) = dirty + 10

//High order function
fun updateDirty (dirty: Int,operation: (Int) -> Int): Int {
   return operation(dirty)
}

fun dirtyProcessor() {
    updateDirty(dirty, waterFilter)
    updateDirty(dirty,::feedFish)
    updateDirty(dirty) { dirty ->
        dirty + 50
    }


    println("BANANA1 " +  updateDirty(dirty,::feedFish))

    println("BANANA2 " + updateDirty(dirty) { dirty ->
        dirty + 50
    })

    println("BANANA3 " +  updateDirty(dirty, waterFilter))
}
