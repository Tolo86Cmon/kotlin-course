package udacityKotlinCourse.lesson3

import kotlin.random.Random

fun main(args: Array<String>) {
    val dice = 0

    val randomDicVal = { Random.nextInt(12) + 1 }

    val randomDicVal1 = { sides : Int -> Random.nextInt(sides)+1}

    val randomDicVal0 = {
        sides :Int ->
        if (sides == 0) 0
        else Random.nextInt(sides)+1
    }

    val randomDicVal2: (Int) -> Int = {
        sides ->
        if (sides == 0) 0
        else Random.nextInt(sides)+1
    }

    gamePlay(6) {
            sides :Int ->
        if (sides == 0) 0
        else Random.nextInt(sides)+1
    }
}


fun gamePlay(dice : Int, operation: (Int)-> Int) : Int {
    println(operation(dice))
    return operation(dice)

}

