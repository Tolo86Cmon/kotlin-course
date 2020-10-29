package udemyKotlinCourse.challanges

import kotlin.math.pow

enum class Shape {
    TRIANGLE,
    SQUARE,
    PENTAGON,
    HEXAGON,
    HEPTAGON,
    OCTAGON,
    NONAGON,
    DECAGON,
    UNKNOWN;
}

interface PolygonInterface{
    fun shape(vararg side: Double) : Shape
    fun perimeter(): Double
    fun area(): Double?
}

abstract class Polygon() : PolygonInterface {
    override fun area(): Double {
        return  0.0
    }

    override fun perimeter(): Double {
        return  0.0
    }

    override fun shape(vararg side: Double): Shape {
       return when(side.size){
           3-> Shape.TRIANGLE
           4-> Shape.SQUARE
           5-> Shape.PENTAGON
           6-> Shape.HEXAGON
           7-> Shape.HEPTAGON
           8-> Shape.OCTAGON
           9-> Shape.NONAGON
           10-> Shape.DECAGON
           else -> Shape.UNKNOWN
       }
    }
}

class  Square (private val side1: Double, private val side2: Double, private val side3: Double, private val side4: Double): Polygon() {
    private var isARectangle: Boolean = false

    init {
        doubleArrayOf(side1, side2, side3, side4).run {
            forEachIndexed { i, side ->
                require(side > 0) {
                    "Side ${i + 1} has value $side <= 0" //throw an exception
                }
            }
            isARectangle = !(side1 == side2 && side2 == side3 && side3 == side4 && side4 == side1)
        }
    }

    override fun perimeter(): Double {
        return doubleArrayOf(side1,side2,side3,side4).sum()
    }

    override fun shape(vararg sides: Double): Shape {
        return super.shape(side1,side2,side3,side4)
    }


    override fun area(): Double {

        return if (!isARectangle) {
              side1.pow(2)
          }
          else{
              (doubleArrayOf(side1, side2, side3, side4).maxOrNull()!! *   doubleArrayOf(side1, side2, side3, side4).minOrNull()!!)/2
          }
    }
}

fun main() {
    val square = Square(1.0,2.0,1.0,2.0)
    println(square.perimeter())
    println(square.area())
    println(square.shape().name)
}