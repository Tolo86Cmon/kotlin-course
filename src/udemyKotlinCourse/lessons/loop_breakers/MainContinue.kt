package udemyKotlinCourse.lessons.loop_breakers

fun main() {
    val foods = arrayListOf<String>("apple","toast","pizza","pasta","kebab","orange")
    val fruits = arrayListOf<String>("orange","apple","strawberry","pear")

    var fruitCounter = 0



    for (food in foods){
        //Not in
        if (food !in fruits){
            println("This is not a fruit")
            continue
        }
        fruitCounter++
        println("Found a fruit")
    }

    println("Total fruits is: $fruitCounter")
}