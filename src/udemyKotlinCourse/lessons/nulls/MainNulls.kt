package udemyKotlinCourse.lessons.nulls

fun main() {

    /**
     * Il punto interrogativo in fase di definizione di una variabile ci consente di assegnargli una variabile il valore null
     */

    var name: String? = null

    name = "Marco"

    //In fase di richiamo di un metodo su una variabile definita con ? fa mantenuto nella dicitura il ? e in caso di null della variabile
    //il sofware non crasha (viene implicitamente effetuato il controllo varibiale != null)
    name?.let {
        println("nameLength ${it.length}")
        println("name $it")
    }

    //Check classico
/*    val checkName = if (name != null){
        name.length
    }
    else{
        -1
    }

    //Check con elvis operator
    val checkName2 = name?.length ?: -1*/


    //Check usando l'operatore scope let, mi consente di eseguire codice complesso in caso di valore non null
    //Cosa che l'elvis operator non mi permette di fare facilmente. Il parametro passato nel corpo è "it"





    println(name)
}