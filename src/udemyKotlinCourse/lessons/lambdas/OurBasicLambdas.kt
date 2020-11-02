package udemyKotlinCourse.lessons.lambdas

fun main() {

    // Lambda function semplice senza ritorno
    val print = { println("Hello")}

    //Lambda function con input string e ritorno Unit
    val print2 : (String) -> Unit = { println("Hello $it") }

    //Lambda function con input Int e ritorno Int (con definizione fuori dal lambda e quindi accesso al parametro it)
    val addFive : (Int) -> Int = {it+5}

    //Lambda function con input Int e ritorno Int (con definizione dentro la lambda )
    val addFive2 = { number : Int -> number+5}
    val addNumberXY = { x : Int, y : Int -> x+y}

    print()
    print2("Marco")
    println(addFive(3))
    println(addFive2(3))
    println(addNumberXY(3,5))
}
