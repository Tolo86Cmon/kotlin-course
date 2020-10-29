package udemyKotlinCourse.lessons.classes
/*
 * Instructs the Kotlin compiler to generate overloads for this function that substitute default parameter values.
If a method has N parameters and M of which have default values, M overloads are generated: the first one takes N-1 parameters (all but the last one that takes a default value), the second takes N-2 parameters, and so on.
 */
// Se vogliamo rendere compatibile codice kotlin con codice java (ad esempio usando metodi con input di default) //
// dobbiamo far capire al compilatore che tale metodo deve poter generare degli overloads in java aggiungendo prima
// della funzione, "@JvmOverLoads". Altrimenti non potremo avere compatibilità
@JvmOverloads fun method (input1: String="input1", input2: String="input2"){

}

//Stessa cosa con i costruttori delle classi con input di default in questo caso la dicitura va odo tra class e constructor.
//Constructor va aggiunto obbligatoriamente solo se si usa @JvmOverloads
data class Event @JvmOverloads constructor(var name: String = "pippo",
                                           var date: String = "pippo2",
                                           var isPrivate: Boolean = true)


fun main() {
    method()
    method(input1= "asasd")
    method(input2= "asasd")
}