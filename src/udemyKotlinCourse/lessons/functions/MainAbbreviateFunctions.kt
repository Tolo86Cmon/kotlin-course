package udemyKotlinCourse.lessons.functions

fun main() {
   println(power(3))
    printMessage()
}

//Nelle funzioni abbreviate non utilizzo il return. Tutto sta in una sola linea. Al posto delle parentesi graffe ho
// l'uguale
fun power (x: Int): Int = x*x

//Nelle funzioni abbreviate posso anche non ritonare nulla (void per java)

fun printMessage() = println("Hello kotlin")