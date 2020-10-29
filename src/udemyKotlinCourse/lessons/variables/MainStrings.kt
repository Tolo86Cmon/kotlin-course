package udemyKotlinCourse.lessons.variables

fun main() {
    // La classe String non è quella di java come per altri tipi ma è stock ti Kotlin (Ci fornisce molti più metodi)

    val money = 5.34
    val fees = 3.45

    //Come facevamo in java per printare il valore di una variabile
    println("My all money printed in java style is " + money)

    //Come possiamo fare in kotlin per printare il valore di una variabile
    println("My all money  printed in kotlin style is $money")

    //Se vogliamo printare direttamente $money
    println("My all money  printed in kotlin style is \$money")

    //Possiamo eseguire direttamente delle funzioni all'interno della stringa semplicemente aggiungendo
    //parentesi quadre dopo il dollaro
    println("My all money  printed in kotlin style after fees is  ${money - fees}")

    //Se voglio scrivere un percorso senza che i back slash vengano utilizzati come operatore
    val path = """"C:\somedire\somedir\file.txt"""

    // Se volessi printare su più righe in kotlin ho varie possibilità

    val bio = "Ciao sono Gualtiero" +
            "ho 29 anni" +
            "Mi piace sviluppare"


    val bioReturnJavaStyle = "Ciao sono Gualtiero\n" +
            "ho 29 anni\n" +
            "Mi piace sviluppare"

    val bioReturnKotlinStyleWithLeftMargin = """Ciao sono Gualtiero 
                                  ho 29 anni
                                  Mi piace sviluppare"""

    println(bioReturnKotlinStyleWithLeftMargin)

    //Usando il trim value di default (|)
    val bioReturnKotlinStyleWithoutLeftMarginDefault = """Ciao sono Gualtiero 
                                                   |ho 29 anni
                                                   |Mi piace sviluppare""".trimMargin()

    println(bioReturnKotlinStyleWithoutLeftMarginDefault)

    //Oppure usando un carattere speciale a mia scelta come (-)
    val bioReturnKotlinStyleWithoutLeftMargin = """Ciao sono Gualtiero 
                                                   -ho 29 anni
                                                   -Mi piace sviluppare""".trimMargin("-")


    println(bioReturnKotlinStyleWithoutLeftMargin)
}

