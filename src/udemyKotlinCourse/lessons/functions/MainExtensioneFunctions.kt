package udemyKotlinCourse.lessons.functions

fun main() {

    //Come si nota scrivendo il punto dopo la stringa, oltre a tutti i metodi della classe Stringa avrò anche il mio definito sotto
    val stringExampleLenght = "Cane".lengthPlus4()
    println(stringExampleLenght)

}

    /*Metodo di abbreviare codice nella definizione di una funzione
    *Il dopo fun mi indica il tipo di varibile da cui posso richiamare la funzione (in questo caso stringhe)
    *Subito dopo il punto definisco il mio metodo a piacere. Successivamente nel corpo rischiamo this come valore su cui applicare la logica
    *Non essendoci parametri di input. Il this fa riferimento ovviamente alle stringhe
    */
fun String.lengthPlus4(): Int {
    return this.length + 5
}