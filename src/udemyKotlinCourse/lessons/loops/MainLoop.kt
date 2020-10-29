package udemyKotlinCourse.lessons.loops

fun main() {
    val nameList = listOf<String>("Marco", "Anna", "Micheal", "Alfredo")
    val map = mapOf(30 to "Marco", 20 to "Anna", 34 to "Micheal", 50 to "Alfredo")

    //1) FOR

    println("Map loop")
    for ((key, value) in map) {
        println("key-> $key value-> $value")
    }

    println("\nList loop")
    for (name in nameList) {
        println(name)
    }

    println("\nRange loop")
    //Loop utilizzando un range numerico
    for (i in 1..10) {
        println(i)
    }

    //Loop utilizzando un range tramite until
    println("\nUntil loop")
    for (i in 1 until 10) {
        println(i)
    }

    //Loop utilizzando un range decrescente tramite downto
    println("\nDown to loop")
    for (i in 10 downTo 1) {
        println(i)
    }
    //Loop utilizzando un range crescente di due valori alla volta
    println("\nStep loop")
    for (i in 1..10 step 2) {
        println(i)
    }
    println("\nWhile loop loop")
    //2) WHILE
    var i = 1
    while (i < 11) {
        println("$i")
        i++
    }

    println("\nDo While loop")
    //2) DO WHILE
    var num = 2
    var iterator = 1

    do {
        println("2 * $iterator = ${num*iterator}")
        iterator++
    } while (iterator <= 10)
}
