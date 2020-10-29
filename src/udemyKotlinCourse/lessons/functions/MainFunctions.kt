package udemyKotlinCourse.lessons.functions

fun main() {
    //1) FUNZIONI SENZA RETURN


    //Richiamo funzione senza parametro passando il default (funziona solo se definisco il default nell'input
    eat()

    //Richiamo funzione passando un parametro
    eat("carrot")


    //FUNZIONI CON RITORNO

    //In kotlin è possibile assegnare il ritorno di una funzione ad una variabile
    val result : Int = multiplication()
    print("Result equals $result")

}

// Se una funzione non torna nulla non siamo costretti a esplicitare Void (Unit in kotlin)
fun eat(typeOfFood: String = "meat"){
    println("I'm eating  $typeOfFood")
}

fun multiplication(a:Int = 1,b:Int = 2):Int {
    return a*b
}


