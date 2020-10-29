package udemyKotlinCourse.lessons.nulls

fun main() {
  val book1 = Book()
}

class Book {
    // Consente di creare una variabile senza assegnarle un valore
    lateinit var title:String
}