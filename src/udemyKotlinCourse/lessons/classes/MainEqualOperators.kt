package udemyKotlinCourse.lessons.classes

fun main() {
    val number1 = 5
    val number2 = 5

    // Per tutti i tipi primitivi il riferimento in memoria di due variabili uguali in contenuto è sempre lo stesso
    println("Number 1 ha lo stesso contenuto di number 2? --> ${number1 == number2}")
    println("Number 1 ha lo stesso riferimento di memoria dinumber 2? --> ${number1 === number2}")
    println("--------------------------------------------------")
    // Se uso un wrapper invece con medesimo contenuto valore, proprio perchè instnazio due oggetti, avrò
    // confronto di contenuto true, mentre confronto di riferimento in memoria false
    val number3 = Integer(10)
    val number4 = Integer(10)

    println("Number 3 ha lo stesso contenuto di number 4? --> ${number3 == number4}")
    println("Number 3 ha lo stesso riferimento di memoria dinumber 4? --> ${number3 === number4}")
    println("--------------------------------------------------")
    // Se uguaglio due oggetti complessi avrò sia contenuto che riferimento di memoria diversi
    // Dati diversi perchè vengono assegnati hascode diversi. Riferimenti diversi perchè
    // ho due istanze diverse
    val persona1 = Persons("marco",20)
    val persona2 = Persons("marco",20)
    println("persona1  ha lo stesso contenuto di persona2? --> ${persona1 == persona2}")
    println("persona1  ha lo stesso riferimento di memoria persona2? --> ${persona1 === persona2}")
    println("--------------------------------------------------")
    // Se uguaglio due oggetti complessi di tipo "data" avrò sia contenuto uguale e riferimento di memoria diversi
    // ho due istanze diverse
    val car1 = CarsDataClass("marco","opel",1982)
    val car2 = CarsDataClass("marco","opel",1982)
    println("car1 ha lo stesso contenuto di car2? --> ${car1 == car2}")
    println("car1 ha lo stesso riferimento di memoria car2? --> ${car1 === car2}")
}