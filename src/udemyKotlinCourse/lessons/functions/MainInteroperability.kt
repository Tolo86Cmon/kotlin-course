package udemyKotlinCourse.lessons.functions

import kotlin.math.asin

fun main() {
    //In questo caso Math è un classe java ma posso utilizzarla anche in file Kotlin (mi viene ovviamente detto che esiste la corrispondente
    // verisione Kotlin)

    //Versione Java
    val PI = Math.asin(5.5)

    //Versione kotlin
    val PI2 = asin(5.5)

    //Il compilatore trasforma il nome file kotlin in classe java dopo averlo compilato
}


fun multiplication2(a:Int = 1,b:Int = 2):Int {
    return a * b
}