package udemyKotlinCourse.lessons.variables

fun main(args : Array<String>){

    // 1) DEFINIRE VARIABILI TIPATE

    var numberOfPeople: Int = 2000
    var earthNumber: Long = 1231231231231231231

    var PI: Double = 3.143242342342
    var measure: Float = 2.65f

    var name: String = "Matteo"

    var character: Char = 'd'

    var isFinished: Boolean = true



    // 2) DEFINIRE VARIABILI NON TIPATE


    //Ad una variabile numerica se non tipata verrà assegnato il tipo Int (a meno che non sfori i byte)
    var numberOfPeopleInferred = 2000

    //Se voglio assegnarli il tipo Long devo aggiungere una L alla fine
    var earthNumberInferred  = 1231231231231231231L

    //Ad una variabile numerica con virgola se non tipata verrà assegnato il tipo Double (a meno che non sfori i byte)
    var pIInferred = 3.143242342342
    //Se voglio assegnarli il tipo Float devo aggiungere una f minuscola alla fine
    var measureInferred = 2.65f

    var nameInferred = "Matteo"

    var characterInferred = 'd'

    var isFinishedInferred = true

    // 3) ASSEGNAZIONE E RIASSEGNAZIONE VARIABILI


    var money = 1000
    money = 800

    var money2 = money

    println("Variabile riassegnata $money2")

    //4) CAMBIARE TIPO ALLE VARIABILI

    //E' possibile eseguire il cambio di tipo direttamente sul valore assegnato
    var voto1 = "8".toInt()

    var voto2 = 9
    var voto3 = 4
    var voto4 = 4
    var media = (voto1.toInt() + voto2 + voto3 + voto4)/4f


    println("Valore media $media")

    // 4) VAR E VAL Variabile mutabile e immutabile (es Final in Java)


    //Azione consentita
    var variabileMutabile = 9
    variabileMutabile = 9


    //Azione non consentita
    val variabileImmutabile = 9

   //  variabileImmutabile = 9 //il parser darà il seguente errore -> "Val cannot be reassigned"


}