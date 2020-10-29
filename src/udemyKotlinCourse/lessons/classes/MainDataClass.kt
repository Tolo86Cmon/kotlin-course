package udemyKotlinCourse.lessons.classes

data class CarsDataClass(var owner: String, val model: String, val year: Int)

class Persons(var name: String = "piipo",var age: Int)

fun main() {
    val p1 = Persons("marco",20)
    val p2 = Persons("marco",20)
    println("Non data p1 hashcode -> ${p1.hashCode()}")
    println("Non data p2 hashcode -> ${p2.hashCode()}")
    // In java il simbolo == andava a verificare l'uguaglianza del riferimento. Se volevo verificare l'uguaglianza del contenuto dell'istanza di classe
    // dovevo utilizzare "l'equals". In kotlin si può usare "==" per tutte e due le necessità
    println("p1 è uguale a p2 ? -> ${p1 == p2}") // Ritorna false perchè tra le due istanze della classe p1 e p2 abbiamo hashcode differenti
                      // Proprietà hashcode ereditata dalla superclasse any

    println("-----------------------------------------------")
    val pp1 = Persons("marco",20)
    val pp2 = pp1
    println("Non data pp1 hashcode -> ${pp1.hashCode()}")
    println("Non data pp2 hashcode -> ${pp2.hashCode()}")
    println("pp1 è uguale a pp2 ? -> ${pp1 == pp2}") // Ritorna true perchè in questo caso ho valorizzato pp2 con il riferimento di memoria
                        // di pp1
    println("-----------------------------------------------")

    // Per risolvere la questione del primo caso (due istanze formalmente uguali che puntano ad area di memoria diverse )
    // è stata creata la classe "data". Che non confronta gli hash

    val c1 = CarsDataClass(model="Opel",owner="Pippo",year= 82)
    var c2 = CarsDataClass("Pippo","Opel",82)
    val c3 = c1.copy(owner = "Gianni")
    println("data c1 hashcode-> ${c1.hashCode()}")
    println("data c2 hashcode-> ${c2.hashCode()}")
    println("data c3 hashcode-> ${c3.hashCode()}")
    println("c1 è uguale a c2 ? -> ${c1 == c2}")
    println("c2 è uguale a c3 ? -> ${c2 == c3}")
}