package udacityKotlinCourse.lesson4.exercise5

fun main(args: Array<String>) {
    val spiceList = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry","mild"),
        Spice("hot pepper","extremely spicy"))


    val filteredSpiceList : List<Spice> = spiceList.filter{ it.heat > 5 }

    println(Spice().makeDefaultSalt())
}