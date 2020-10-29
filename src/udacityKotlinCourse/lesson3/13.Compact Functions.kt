package udacityKotlinCourse.lesson3

import java.lang.Math.random

fun main(args: Array<String>) {
    //println(Lesson3.whatShouldIDoToday("sad", "rainy", 31))
    val random = random()
    val random1 = {random()}

    println(random)
    println(random)
    println(random)

    println(random1())
    println(random1())
    println(random1())


}

fun isTheWeatherBad (mood: String, weather: String, temperature: Int)  =
    mood == "sad" && weather == "rainy" && temperature == 30



fun isVeryHot (temperature: Int) = temperature > 30

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {

    return when {
        isTheWeatherBad(mood,weather,temperature) -> "stay in bed"
        isVeryHot(temperature) -> "go swimming"
        else -> "Banana"
    }





}

