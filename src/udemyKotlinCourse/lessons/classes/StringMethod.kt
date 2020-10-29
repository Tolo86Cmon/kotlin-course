package udemyKotlinCourse.lessons.classes

class StingMethod  (private val id: String) : Any() {
    override fun toString(): String {
        return "id: $id " +  super.toString()
    }
}

fun main() {
    val sm = StingMethod("Pippo")
    println(sm)
}