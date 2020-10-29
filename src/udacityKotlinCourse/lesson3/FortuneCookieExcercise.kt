package udacityKotlinCourse.lesson3

fun main(args: Array<String>) {
    var fortune: String = ""
    while (!fortune.contains("Take it easy")) {
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")
    }
}

fun getFortuneCookie(birthDay: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends, because they are your greatest fortune."
    )

    return when (birthDay) {
        in 1..7 -> "Be humble and all will turn out well."
        28, 31 -> "You will have a great day!"
        else -> fortunes[birthDay.rem(fortunes.size)]
    }
}

fun getBirthday(): Int {
    print("\nEnter your birthday: ")
    return readLine()?.toIntOrNull() ?: 1
}