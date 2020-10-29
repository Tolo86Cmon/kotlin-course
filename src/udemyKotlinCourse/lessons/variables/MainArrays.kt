package udemyKotlinCourse.lessons.variables

fun main() {
    val numberArray = arrayOf(1,3,5,6)

    val stringArray = arrayOf("Luca","Marco","Anna","Matilde")

    //Array misti, può prendere tutti i tipi, sono immutabili tranne che in un caso, il successivo
    val mixedArray = arrayOf("Luca",3,"Marco",false, 3444L)


    //In questo caso posso aggiungere valori all'array solo perchè lo istanziato come "arrayOfNulls
    val arrayOfNull : Array<Int?> = arrayOfNulls(3)



    arrayOfNull[0] = 1
    arrayOfNull[1] = 2
    arrayOfNull[2] = 3

    //per stampare ogni elemente dell'array
    for (name in arrayOfNull){
        println(name)
    }
}