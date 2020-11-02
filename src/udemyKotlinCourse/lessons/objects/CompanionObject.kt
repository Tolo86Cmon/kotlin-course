package udemyKotlinCourse.lessons.objects

class StringModifierClass private constructor(val string: String) {
    companion object {
        fun justAssign(str: String) = StringModifierClass(str)

        fun upperOrLowerCase(str: String, lowerCase: Boolean): StringModifierClass {
            return if (lowerCase) {
                StringModifierClass(str.toLowerCase())
            } else {
                StringModifierClass(str.toUpperCase())
            }
        }
    }
}

fun main() {
    val stringTest = "prova"
    // Se Istanzio class 1 e class 2 utilizzando i metodi del companion object utilizzo la parte statica della classe
    val class2 = StringModifierClass.Companion.justAssign(stringTest)
    val class1 = StringModifierClass.Companion.upperOrLowerCase(stringTest,false)
    // Come si nota in class 3 posso evitare di esplicitare la sintassi "companion" ma solo se utilizzo un file kotlin. Se richiamo
    // la classe da un file java devo scriverlo
    val class3 = StringModifierClass.justAssign(stringTest)
    // Se valorizzo il costruttore primario senza passare dal companion sto bypassando l'associazione statica e lo posso fare solo se
    // il costruttore è public

    //val class4 = StringModifierClass("Pippo")


    println(class1.string)
}