package udemyKotlinCourse.lessons.functions

fun main() {
    /*
    * REGOLE PER POTER USARE LE INFLIX FUNCTIONS (da usare con operazioni semplici)
    * 1) La funzione deve essere non di alto ma all'interno di una classe o extension functions
    * 2) Deve avere un singolo parametro di input
    * 3) Non può avere valori di default cone visto prima
    *
    * A COSA SERVE?
    * 1) Rendere pulito il codice eliminando parentesi e punti
    */

    val infixAdding = 10 addWithInfix 5

    val nonInfixAdding = 10.addWithoutInfix(5)

    println("Add with infix $infixAdding")

    println("Add with infix $nonInfixAdding")


}
infix fun Int.addWithInfix(b: Int) : Int {
    return this + b
}

 fun Int.addWithoutInfix(b: Int) : Int {
    return this + b
}



