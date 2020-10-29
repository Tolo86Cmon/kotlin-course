package udemyKotlinCourse.lessons.classes
// Affinchè una classe possa essere ereditata da un'altra deve essere dichiarara come "open"
open class Person(var name: String,var age: Int) {

    open fun printData(){
        println("name: $name age: $age")
    }

    open fun eat(){
        println("I'm eating...")
    }
    open fun sleep(){
        println("I'm sleeping")
    }
}

 class FootballPlayer (name: String, age: Int,var club: String): Person(name, age) {
     fun whichTeamArePlayingWith(){
         println("I'm playing for the $club")
     }
 }

class Teacher (name: String, age: Int,var subject: String) : Person(name, age){
    fun whichSubjectAreYouTeaching(){
        println("I'm teaching  $subject")
    }

    override fun eat() {
        println("I'm override my eating...")
        super.eat()

    }
}


fun main() {
    val prof = Teacher("Claudio",33,"Math")
    prof.whichSubjectAreYouTeaching()
    prof.eat()
    prof.printData()
}