package udemyKotlinCourse.challanges

fun main() {
    val basketItems   = mapOf("apples" to 4, "oranges" to 19, "kites" to 3, "sandwiches" to 8)
    val fruits = listOf("apples", "oranges", "pears", "grapes", "bananas")
    var sumValue = 0


    for  ((key,value) in basketItems){
        if (key in fruits){
            sumValue += value
        }
    }
    println(sumValue)
}