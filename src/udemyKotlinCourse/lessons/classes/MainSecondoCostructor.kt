package udemyKotlinCourse.lessons.classes

class SecondPerson(var name : String?){
    init {
        println("Person's name is $name")
    }

    constructor(name: String?, lastName: String?, age: Int?): this(name){
        println("name: $name,lastName: $lastName, age: $age ")
    }
}

fun main() {
    val sp = SecondPerson("Gianluca","Pippi",3)
}