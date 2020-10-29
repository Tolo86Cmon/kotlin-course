package udemyKotlinCourse.lessons.classes

open class VisibilityClass {
    // Rende visibile la variabile solo all'interno della classe
    private var name = "Giovanni"
    //Rende accessibile la proprietà alle sottoclassi
    protected var surname = "Ciccioloni"
    var age = 19
}

class SubVisibilityClass : VisibilityClass() {
    val surnameInSubClasses = super.surname
}

fun main() {
    val visb = VisibilityClass()
  //   visb.name //Non posso accedervi perchè privata
  //  visb.surname //Non posso accedervi perchè protected
}