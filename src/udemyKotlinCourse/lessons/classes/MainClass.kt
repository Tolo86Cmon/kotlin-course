package udemyKotlinCourse.lessons.classes

/**
 * A differenza di Java in kotlin posso creare una funzione main e una classe nello stesso file .kt
 */

class Persona( var name: String,  age_param: Int, var height: Int) {

    /**
     * Il costruttore primario è quello presente tra parentesi tonde dopo il nome classe
     Non c'è l'obbligo del getter and setter perchè kt prevede già l'incapsulamente behind the scene
     Il blocco init è un'altro modo di invocare il costruttore. A differenza di quello presente tra parentesi ci consente
     di scrivere della logica. Viene richiamata appena richiamo l'istanza Persona()
     */

    var age = age_param

     /**
     *  Il set richiamato ogni qual volta viene modificato la proprietà di una classe
      *  Se si vuole semplicemente settare il valore di una proprietà ci pensa già kotlin senza "set". Ma se si vuole
      *  come in questo caso aggiungerel logica diventa utile
      */
    set(value){
        if (value>0)
            field = value
        else
            println("Something went wrong in set")
    }

    get(){
        println("Richiamato getter $field")
        return field
    }


    /**
     *  L'init viene richiamato ogni qual volta viene istanziata la classe Persona passando i parametri nel costruttore
     */
    init {
        if (age_param<=0)
            println("Something went wrong in init")

   }
}

fun main() {

    // Qui viene richiamato init in automatico
    val myFriend = Persona("Marco",5,-180)

    // Qui  viene richiamato set
    myFriend.age = 3

    myFriend.age

}