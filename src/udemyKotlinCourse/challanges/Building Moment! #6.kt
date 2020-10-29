package udemyKotlinCourse.challanges

class Triangle (triangleSides1: Double, triangleSides2: Double, triangleSides3: Double){

    init {
        doubleArrayOf(triangleSides1, triangleSides2, triangleSides3).run {
            forEachIndexed { i, side ->
                require(side > 0) {
                    "Side ${i+1} has value $side <= 0" //throw an exception
                }
            }
        }
    }

    var typeOfTriangle: String = when {
        triangleSides1 == triangleSides2 && triangleSides2 == triangleSides3 && triangleSides3 == triangleSides1 -> "equilatero"
        triangleSides1 == triangleSides2 || triangleSides2 == triangleSides3 ||  triangleSides3 == triangleSides1 -> "isoscele"
        else ->"scaleno"
    }

    fun checkTypeOfTriangle() : String = typeOfTriangle
}

fun main() {
    val triangle = Triangle(10.3,11.0,1.0)
    println(triangle.checkTypeOfTriangle())
}