package udemyKotlinCourse.lessons.lambdas

fun main() {
    // il metodo  count senza input ritorna la lunghezza della stringa
    val numberOfLetters = "Mississippi".count();

    println(numberOfLetters)

    // il metodo count può prendere come input una funzione lambda che ritorna solo il numero di s
    val numberOfS = "Mississippi".count {
        lettersS -> lettersS == 's'
    }

    // stessa cosa di sopra ma usando il parametro it che è fisso
    val numberOfSWithIt = "Mississippi".count {
        it == 's'
    }

    println(numberOfS)
}