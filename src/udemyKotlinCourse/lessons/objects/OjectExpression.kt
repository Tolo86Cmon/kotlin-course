package udemyKotlinCourse.lessons.objects

 open class Person {
     fun eat() = println("I'm eating")
     open fun pray() = println("I'm praying")
 }



fun main() {
    // La classe object ci consente di creare classi anonime che da associare ad una variabile
    val anonymousObject = object {
        val x = 3
        val y = 4
    }


   // La classe object anonime possono anche estendere altre classi (in questo caso la classe Persone)
   val person = object : Person(){
       override fun pray() {
           println("I dont'pray")
       }
   }

    println(anonymousObject.x)
    println(person.eat())
    println(person.pray())

}