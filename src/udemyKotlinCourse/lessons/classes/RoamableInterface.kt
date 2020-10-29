package udemyKotlinCourse.lessons.classes

interface RoamableInterface {
    fun roam ()
}

class Car (val model: String): RoamableInterface{
    override fun roam() {
        println("The car is roaming")
    }
}

abstract class Animal ( var food: String) : RoamableInterface{
     open fun eat(){
        println("I'm eating: $food")
    }

    override fun roam() {
        println("The animal is roaming")
    }

}

 class Lion ( var name: String, food: String) : Animal(food) {
     fun info(){
        println("My name is $name the king")
    }

    override fun eat() {
        super.eat()
    }

    override fun roam() {
        super.roam()
    }

}

class Hippo ( var name: String, food: String) : Animal(food) {
    fun info(){
        println("My name is $name")
    }

    override fun eat() {
        super.eat()
    }

    override fun roam() {
        super.roam()
    }
}

fun main() {
    val roamables = arrayOf(
        Hippo("Samantha","fish"),
        Lion("Alex","meat"),
        Car("Ford")
    )
    for (item in roamables){
        item.roam()
        if (item is Animal){
            item.eat();
        }
    }
}

