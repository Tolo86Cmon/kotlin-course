package udemyKotlinCourse.lessons.nulls

//Classica inizializzazioen di una variabile (se però non viene usato mi occupa spazio inutile)
val number: Float = 98.9f

// Inizializzione di una variabile by lazy (se  non usata non viene neanche compilata. Ottimizza lo spazio) -> E' thread safe si può usare sy
// var o val
val numberByLazy: Float by lazy { 98.9f }

fun main() {

    //Se uso più volte number inizializzerò più volte la variabile
    println("some code $number")
    println("some code")
    //Se uso più volte numberByLazy andrò inizializzare la variabile una volta solo recuperanod il valore dalla cache senza occupare ulteriore memoria
    println("some code $numberByLazy")
    println("some more  code")
}