package udemyKotlinCourse.challanges

import java.time.Year

//Per completare questa esercizio dovrai:
//
//Creare un un algoritmo in grado di calcolare la tua età.
//
//Per fare questo dovrai poter inserire solo l'anno in cui sei nato.
//
//Non potrai scrivere a mano l'anno corrente ma dovrai prenderlo tramite delle classi Koltin o Java (cerca su Internet come fare)


fun main() {
   val annoDiNascita = 1986


    val annoAttuale = Year.now().value


    val mieiAnni = annoAttuale - annoDiNascita
    println(mieiAnni)
}

