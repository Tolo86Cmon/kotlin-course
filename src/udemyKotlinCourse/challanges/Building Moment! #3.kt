package udemyKotlinCourse.challanges

fun main() {
    val names = listOf("Marco Rossi", "Alfredo Andrei", "John Mayer", "Justin Biber")
    val userNames= mutableListOf(String())
    for (name in  names)
        userNames.add(name.replace(" ","_").toLowerCase())

    for (userName in userNames) {
        println(userName)
    }
}


